/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oldřich
 */
public class ServerThread extends Thread {

    private PrintWriter pw;
    private BufferedReader br;

    public ServerThread(Socket s) throws IOException {
        pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    }

    public void run() {
        Thread t = Thread.currentThread();
        String jmeno = t.getName();
        String message;
        try {
            while (!(message = br.readLine()).equalsIgnoreCase(jmeno)) {
                pw.println("Server pro klienta " + jmeno + " :" + message.toUpperCase());
                System.out.println("Server pro klienta " + jmeno + " :" + message);
                pw.flush();
            }
            pw.close();
            br.close();
        } catch (IOException ex) {
            System.out.println("chyba komunikace");
        }catch (NullPointerException ex){
            System.out.println("konec klienta");
        }
        
    }
}
