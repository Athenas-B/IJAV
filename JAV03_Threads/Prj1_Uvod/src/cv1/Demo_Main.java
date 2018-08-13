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
public class Demo_Main {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Aktualni jmeno vlakna " + t);
        t.setName("test");
        System.out.println("Prejmenovane vlakno " + t);

        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t.getId());
        System.out.println("Skupina: " + t.getThreadGroup());
        System.out.println(t.MIN_PRIORITY);
    }
}
