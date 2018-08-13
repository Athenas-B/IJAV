package netik;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.net.*;

import java.io.*;

public class Client {
    Client() {
        int port = 55555;
        InputStream input = System.in;
        String inpName = "a.txt";

        try {
            input = new java.io.FileInputStream(inpName);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
// pomocné výpisy do konzole:
        System.err.printf("Connecting to server, port %d...\n", port);
        try {
//pokusi se pripojit na server = localhost = 127.0.0.1, na nastavenem portu
            Socket socket = new Socket("localhost", port);
//vypise, ze posila data
            System.err.printf("Connected! Now I'll send him data from %s...\n",
                              inpName);
            //vytvori printwriter pro posilani dat
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            //reader pro nacteni souboru s daty
            BufferedReader reader =
                new BufferedReader(new InputStreamReader(input));

            String line;
//v cyklu odešle po øádcích data ze souboru
            while ((line = reader.readLine()) != null) {
                writer.println(line);
                writer.flush();
            }
// konec
            System.err.printf("All data sent, exiting!\n");
            reader.close();
            writer.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (ConnectException e) {
            System.err.printf("Connection on port %d refused! Is the server running there?\n",
                              port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
