/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Oldřich
 */
public class ServerStart {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(56789);
        Socket s;
        for (;;) {
            System.out.println("Čekání na klienta ... (povolte vstupy)");
            synchronized (ss) {
                s = ss.accept();
            }
            new ServerThread(s).start();
        }
    }
}
