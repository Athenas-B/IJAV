/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oldřich
 */
public class DemoIP_02 {

    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println(ip);
            String hostName = ip.getHostName();
            System.out.println(hostName);
            String hostNameCanonical=ip.getCanonicalHostName();
            System.out.println(hostNameCanonical);
            InetAddress serverIP = InetAddress.getByName(null);
            System.out.println(serverIP);
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(DemoIP_02.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
