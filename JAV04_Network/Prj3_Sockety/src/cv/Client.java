/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cv;

import com.sun.corba.se.impl.io.OutputStreamHook;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Oldřich
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket s =new Socket("10.221.246.162",55555);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader konzole = new BufferedReader(new InputStreamReader(System.in));
        
        String message;
        System.out.println("Zadávejte zprávy pro server (stop ukončí klienta).");
        while (!(message=konzole.readLine()).equalsIgnoreCase("stop")) {            
            pw.println(message);
            pw.flush();
            String answer = br.readLine();
            System.out.println(answer);
        }
        pw.close();
        br.close();
        s.close();
    }
}
