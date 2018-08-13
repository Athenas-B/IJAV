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
public class MojeVlaknoInt1 implements Runnable {

    private Thread v;

    public MojeVlaknoInt1() {
        v = new Thread(this, "Intarface_1");
        v.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {

                System.out.println(v.getName() + " bezi. " + this);
                v.sleep(2000);
            }
        } catch (InterruptedException ex) {
            System.err.println(v.getName() + "Preruseno!");

        }
    }

}
