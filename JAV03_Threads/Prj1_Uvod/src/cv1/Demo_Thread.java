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
public class Demo_Thread {

    static class MojeVlakno extends Thread {

        public MojeVlakno(String jmeno) {
            super(jmeno);
            //start();
        }
        @Override
        public void run(){
            System.out.println(this.getName());
        }
    }
    public static void main(String[] args) {
        Thread v = new Thread(new MojeVlakno("Prvni"));
        v.start();
        
        new MojeVlakno("Druhe").start();
        System.out.println("Konec");
    }
}
