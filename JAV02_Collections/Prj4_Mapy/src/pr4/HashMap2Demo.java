/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Oldřich
 */
public class HashMap2Demo {

    public static void main(String[] args) {
        HashMap hm = new HashMap();
        System.out.println("prazdna: " + hm.isEmpty());
        System.out.println("prvku: " + hm.size());
        System.out.println("Mapa: " + hm);

        System.out.println("plnime ....");
        hm.put("Jakub", 191); //jmeno, vyska
        hm.put("Petr", 172);
        hm.put("Roman", 178);
        hm.put("Pavel", 162);
        hm.put("Milan", 181);

        System.out.println("Iterator prez klice: ");
        Iterator i = hm.keySet().iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + ", ");
        }
        System.out.println("");
        System.out.println("Iterator prez hodnoty: ");
        i = hm.values().iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + ", ");
        }
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        System.out.println("\nZdaje jmeno pro zmenu vysky:");
        String jmeno = sc.next();
        if (hm.containsKey(jmeno)) {
            System.out.println(jmeno + " nyni meri " + hm.get(jmeno) + " cm");
            System.out.println("Zadej novou vysku:");
            int vys = sc.nextInt();
            hm.put(jmeno, vys);
        } else {
            System.out.println("Jmeno <" + jmeno + "> ve slovniku neni!");

        }
        System.out.println(hm);

    }
}
