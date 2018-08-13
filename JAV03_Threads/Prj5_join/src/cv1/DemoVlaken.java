/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oldřich
 */
public class DemoVlaken {

    public static void main(String[] args) {
        Thread.currentThread().setName("Main vlakno");

        MojeVlakno mv = new MojeVlakno();
        Thread t = new Thread(mv, "Ahoj");
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.print(Thread.currentThread().getName() + "_... zacatek");
            System.out.println(" hlavniho programu");
        }
        System.out.println("t = " + t.isAlive());

        Thread.yield();
        try {
            t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(DemoVlaken.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("t = " + t.isAlive());
        
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ".... konec");
        }
    }
}
