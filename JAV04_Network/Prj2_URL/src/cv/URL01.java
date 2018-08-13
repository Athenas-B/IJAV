/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Oldřich
 */
public class URL01 {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://www.google.com");

        String protocol = url.getProtocol();
        String host = url.getHost();
        int port = url.getPort();
        String soubor = url.getFile();
        String ref = url.getRef();

        System.out.println(protocol + " :: " + host + " :: " + port + " :: " + soubor + " :: " + ref);
    }
}
