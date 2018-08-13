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
public class MojeVlaknoInt2 implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {

                System.out.println("Interface_2 taky bezi ...");
                Thread.sleep(2000);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();

        }
    }

}
