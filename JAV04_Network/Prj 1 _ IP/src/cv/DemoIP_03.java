/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oldřich
 */
public class DemoIP_03 {

    public static void main(String[] args) {
        InetSocketAddress isal = new InetSocketAddress("localhost", 65500);
        System.out.println(isal);

        InetSocketAddress isa2 = new InetSocketAddress(0);
        System.out.println(isa2);
        System.out.println("");

        try {
            InetAddress ia = InetAddress.getByName("www.google.com");
            System.out.println("ia= " + ia);
            Thread.sleep(3000);
            InetSocketAddress isa3 = new InetSocketAddress(ia, 80);
            System.out.println(ia + " a s portem: " + isa3);
        } catch (UnknownHostException ex) {
            Logger.getLogger(DemoIP_03.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(DemoIP_03.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
