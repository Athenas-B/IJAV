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
public class MojeVlaknoExt extends Thread {

    public MojeVlaknoExt() {
        super("Extend");
        this.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {

                System.out.println(this.getName() + " bezi. " + this);
                this.sleep(2000);
            }
        } catch (InterruptedException ex) {
            System.err.println(this.getName() + "Preruseno!");

        }
    }

}
