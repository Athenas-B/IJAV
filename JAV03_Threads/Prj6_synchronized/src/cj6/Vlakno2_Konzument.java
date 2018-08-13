/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cj6;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oldřich
 */
public class Vlakno2_Konzument implements Runnable {

    private Box box;

    public Vlakno2_Konzument(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        Random rg = new Random();
        for (String zprava = box.get(); !zprava.equals("STOP"); zprava = box.get()) {
            System.out.println("Prijato: " + zprava);
            try {
                Thread.sleep(rg.nextInt(5000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Vlakno2_Konzument.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
