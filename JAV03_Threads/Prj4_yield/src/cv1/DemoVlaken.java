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
public class DemoVlaken {

    public static void main(String[] args) {
        Thread.currentThread().setName("Main vlakno");

        MojeVlakno mv = new MojeVlakno();
        Thread mojeVlakno = new Thread(mv);
        mojeVlakno.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "_" + (i + 1));
            Thread.yield();
        }
    }
}
