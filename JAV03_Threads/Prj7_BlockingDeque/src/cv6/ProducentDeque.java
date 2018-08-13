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
public class ProducentDeque implements Runnable {

    private String jmeno;
    private BlockingDeque<Integer> deque;

    public ProducentDeque(String jmeno, BlockingDeque<Integer> deque) {
        this.jmeno = jmeno;
        this.deque = deque;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                deque.putLast(i);
                System.out.println(jmeno + " uklada " + i);
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducentDeque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
