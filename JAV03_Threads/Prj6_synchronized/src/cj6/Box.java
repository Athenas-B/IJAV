/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cj6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oldřich
 */
public class Box {

    private String zprava;
    private boolean jePrazdna = true;

    public synchronized String get() {
        while (jePrazdna) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Box.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jePrazdna = true;
        notifyAll();
        return zprava;

    }

    public synchronized void put(String zprava) {
        while (!jePrazdna) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Box.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.zprava = zprava;
        jePrazdna = false;
        notifyAll();
    }
}
