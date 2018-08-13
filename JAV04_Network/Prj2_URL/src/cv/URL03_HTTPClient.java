/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oldřich
 */
public class URL03_HTTPClient {

    public static void main(String[] args) {
        URL url;
        BufferedReader in = null;
        try {
            url = new URL("http://www.upce.cz/fei/index.html");
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            String radek;
            while ((radek = in.readLine()) != null) {
                System.out.println(radek);
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(URL03_HTTPClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(URL03_HTTPClient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
