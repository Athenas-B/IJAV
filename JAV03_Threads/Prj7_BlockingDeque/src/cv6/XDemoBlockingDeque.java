/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv6;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oldřich
 */
public class XDemoBlockingDeque {

    public static void main(String[] args) {
        BlockingDeque<Integer> deque = new LinkedBlockingDeque<>(5);
        Runnable producent = new ProducentDeque("Producent", deque);
        Runnable konzument = new KonzumentDeque("Konzument", deque);
        new Thread(producent).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(XDemoBlockingDeque.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Thread(konzument).start();
    }
}
