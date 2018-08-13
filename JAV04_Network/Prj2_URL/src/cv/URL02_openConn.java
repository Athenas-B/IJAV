/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oldřich
 */
public class URL02_openConn {

    public static void main(String[] args) {
        try {
            URL u = new URL("http://www.upce.cz/fei/index.html");
            URLConnection uc = u.openConnection();
            
            System.out.println(uc.getContentType());
            System.out.println(uc.getContentLength());
            System.out.println(uc.getExpiration());
            System.out.println(uc.getContentEncoding());
            System.out.println(new Date(uc.getLastModified()));
        } catch (IOException ex) {
            Logger.getLogger(URL02_openConn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
