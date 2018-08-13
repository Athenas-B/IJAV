/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oldřich
 */
public class DemoIP_01 {

    public static void main(String[] args) {
        try {
            InetAddress ip1 = InetAddress.getLocalHost();
            System.out.println(Arrays.toString(InetAddress.getAllByName("Y580")));
            InetAddress ip2 = InetAddress.getByName("www.google.cz");
            System.out.println(ip1);
            byte[] poleIP = ip2.getAddress();
            String ipAddrStr = "";
            for (int i = 0; i < poleIP.length; i++) {
                if (i > 0) {
                    ipAddrStr += ".";
                }
                ipAddrStr += poleIP[i] & 0xFF;
            }
            System.out.println(ipAddrStr + " (retezec)");
        } catch (UnknownHostException ex) {
            Logger.getLogger(DemoIP_01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
