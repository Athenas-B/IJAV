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
public class Demo_ViceVlaken_Runnable implements Runnable {

    private Thread v;

    public Demo_ViceVlaken_Runnable(String jmeno) {
        v = new Thread(this, jmeno);
        v.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(i + 1 + ". " + v.getName() + "" + v.getId() + " " + v.getPriority());
                Thread.sleep(3000);
            }

        } catch (InterruptedException e) {
            System.err.println("Moc brzo");
        }
    }

    public static void main(String[] args) {
        new Demo_ViceVlaken_Runnable("Ahoj");
        new Demo_ViceVlaken_Runnable("Dzus");
        new Demo_ViceVlaken_Runnable("zdar");
        System.out.println("soubezny beh 3 instanci jednoho vlakna");
    }

}
