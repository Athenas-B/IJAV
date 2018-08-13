/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1;

import java.util.Vector;

/**
 *
 * @author Oldřich
 */
public class VectorPriklad {

    public static void main(String[] args) {
        Vector<Bod> v = new Vector<>(5);

        v.add(new Bod(10, 10));
        v.add(new Bod(-10, -5));
        v.add(new Bod(20, 0));
        v.add(new Bod(-2, 11));
        v.add(new Bod(30, 1));
        System.out.println(v);

        if (!v.isEmpty()) {
            Bod max = v.firstElement();
            for (int i = 1; i < v.size(); i++) {
                if (v.get(i).vratVzdalenostOdPocatku() > max.vratVzdalenostOdPocatku()) {
                    max = v.get(i);
                }
            }
            System.out.println("Max je" + max);
        }

    }
}
