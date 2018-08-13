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
public class Vlakno1_Producent implements Runnable {

    private Box box;

    public Vlakno1_Producent(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        Random rg = new Random();
        String[] zpravy = {"<Prvni>", "<Druha>", "<Treti>", "<Ctvrta>",
            "<Pata>"};
        for (int i = 0; i < zpravy.length; i++) {
            System.out.println("Posilam: " + zpravy[i] + " :: ");
            box.put(zpravy[i]);
            try {
                Thread.sleep(rg.nextInt(5000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Vlakno1_Producent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        box.put("STOP");
    }

}
