/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Oldřich
 */
public class Vector1Demo {

    public static void main(String[] args) {
        Vector v = new Vector();

        v.add("Ahoj");
        v.add(new Integer(666));
        v.add((Integer) 123456);
        v.add(new Double(3.14));
        v.add(0, "zdar");

        System.out.println("pozice 0: " + v.elementAt(0));
        System.out.println("obsah vektoru: " + v);

        Iterator it = v.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
        System.out.println("");

        for (Object o : v) {
            System.out.println(o);
        }
        v.clear();
    }
}
