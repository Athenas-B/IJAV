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
public class VlaknaDemo {

    public static void main(String[] args) throws InterruptedException {
        MojeVlaknoExt vlExt = new MojeVlaknoExt();
        new MojeVlaknoInt1();

        MojeVlaknoInt2 mv = new MojeVlaknoInt2();
        Thread vlInt2 = new Thread(mv);
        vlInt2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Hlavni aplikace bezi");
            if (i == 1) {
                vlExt.interrupt();
            }
            Thread.sleep(2000);
        }
        System.out.println("Halvni app zastavena");
    }
}
