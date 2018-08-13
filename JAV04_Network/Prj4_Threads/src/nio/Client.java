/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Oldřich
 */
public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket("localhost", 56789); // testování na jednom stroji
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
//... čtení z konzole:        
        BufferedReader konzole = new BufferedReader(new InputStreamReader(System.in));
        
        String message;
        System.out.println("Zadávejte zprávy pro server (stop - ukončí klienta).");

//... úprava (místo prosté while): server ještě stačí odpovědět
        do {
            message = konzole.readLine();
            pw.println(message);
            pw.flush(); //... "vypláchnutí proudu"
            String answer = br.readLine();
            System.out.println(answer);
        } while (!(message.equalsIgnoreCase("stop")));
        pw.close(); br.close(); s.close();        
    }
}

