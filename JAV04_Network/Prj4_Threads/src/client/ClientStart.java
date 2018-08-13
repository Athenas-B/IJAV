/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Oldřich
 */
public class ClientStart {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("10.221.243.49", 56789);
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        BufferedReader konzole = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Zadávejte správy pro server (stop).");
        String message;
        while (!(message = konzole.readLine()).equalsIgnoreCase("stop")) {
            pw.println(message);
            pw.flush();
            String answer = br.readLine();
            System.out.println(answer);
        }
        pw.println(message);
        pw.flush();
        pw.close();
        br.close();
        s.close();
    }
}
