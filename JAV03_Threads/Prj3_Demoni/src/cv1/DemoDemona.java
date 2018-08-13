/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv1;

/**
 *
 * @author Oldřich
 */
public class DemoDemona {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Zacatek main");

        Thread vlD = new Thread(new MujDemon());
        vlD.setDaemon(true);
        vlD.start();
        if (vlD.isDaemon()) {
            Thread.sleep(10000);
            System.out.println("Main skoncil a tim skoncil i demon");
        } else {
            System.out.println("Main bezi dokud bezi vlakno");
        }
    }
}
