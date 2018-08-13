/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv6;

import java.util.concurrent.BlockingDeque;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oldřich
 */
public class KonzumentDeque implements Runnable {

    private String jmeno;
    private BlockingDeque<Integer> deque;

    public KonzumentDeque(String jmeno, BlockingDeque<Integer> deque) {
        this.jmeno = jmeno;
        this.deque = deque;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                int j = deque.takeFirst();
                System.out.println(jmeno + " vybira " + j);
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(KonzumentDeque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
