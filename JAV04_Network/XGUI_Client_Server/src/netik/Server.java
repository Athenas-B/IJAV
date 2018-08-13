package netik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Server {
    public static int port = 55555;

    Server(DemoClientServerGUI g) {
        try {
            while (true) {
                ServerSocket sSocket = new ServerSocket(port);
                Socket socket = sSocket.accept(); //cekame na spojeni od klienta
//vytvoreni noveho BufferedReaderu pro cteni
                BufferedReader reader =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request;
// cteni dokud je spojeni aktivni - pri ukonceni se posila NULL
                while ((request = reader.readLine()) != null) {
                    try {
                        //System.out.println(request);
                        g.textarray.setText(g.textarray.getText() + request + "\n");
                    } catch (NumberFormatException e) {
                        return;
                    }
                }
                /* pokud prazdny retezec - close */
                if (!sSocket.isClosed())
                    sSocket.close();
                //set timeout
                socket.setSoTimeout(100);
            }
        } catch (SocketException e) {
            System.err.printf("Connection with client crashed!");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
