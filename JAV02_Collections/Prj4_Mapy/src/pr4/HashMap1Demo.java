/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr4;

import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Oldřich
 */
public class HashMap1Demo {

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

        System.out.println("prazdna: " + hm.isEmpty());
        System.out.println("prvku: " + hm.size());
        System.out.println("Mapa: " + hm);

        if (hm.containsKey("Jakub")) {
            System.out.println("Jakub meri " + hm.get("Jakub") + " cm");
        }
        hm.put("Jakub", 195);
        System.out.println("Mapa: " + hm);
        System.out.println("Jmena: " + hm.keySet());

        Collection col = hm.values();
        System.out.println("Vysky: " + col);

    }
}
