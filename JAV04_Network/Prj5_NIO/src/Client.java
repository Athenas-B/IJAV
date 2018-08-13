/*
 *      Upraven� klient z projektu Prj3_Sockety
 * 
 *      Klient� m��e b�t v�ce !!!!!
 */
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket("localhost", 56789); // testov�n� na jednom stroji
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
//... �ten� z konzole:        
        BufferedReader konzole = new BufferedReader(new InputStreamReader(System.in));
        
        String message;
        System.out.println("Zad�vejte zpr�vy pro server (stop - ukon�� klienta).");

//... �prava (m�sto prost� while): server je�t� sta�� odpov�d�t
        do {
            message = konzole.readLine();
            pw.println(message);
            pw.flush(); //... "vypl�chnut� proudu"
            String answer = br.readLine();
            System.out.println(answer);
        } while (!(message.equalsIgnoreCase("stop")));
        pw.close(); br.close(); s.close();        
    }
}
