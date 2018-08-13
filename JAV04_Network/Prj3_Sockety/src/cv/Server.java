/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Oldřich
 */
public class Server {

    public static void main(String[] args) throws IOException {
        System.out.println("Čekám na klienta - spusťte ho!");

        ServerSocket ss = new ServerSocket(54545);
        Socket s = ss.accept();
        System.out.println("ano");

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
        String message;
        pw.println("Server odpovídá: (Olda)"  + ".");
        while (!(message = br.readLine()).equalsIgnoreCase("stop")) {
            pw.println("Server odpovídá: (Olda)" + message.toUpperCase() + ".");
            System.out.println(message);
            pw.flush();
        }
        pw.close();
        br.close();
        s.close();
        ss.close();
    }
}
