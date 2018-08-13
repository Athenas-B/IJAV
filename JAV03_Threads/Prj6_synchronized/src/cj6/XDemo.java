/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cj6;

/**
 *
 * @author Oldřich
 */
public class XDemo {

    public static void main(String[] args) {
        Box mujBox = new Box();

        new Thread(new Vlakno1_Producent(mujBox)).start();
        new Thread(new Vlakno2_Konzument(mujBox)).start();
    }
}
