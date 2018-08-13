/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osoba;

import java.lang.instrument.Instrumentation;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Oldřich
 */
public class HashSet3Demo {

    static final int POCET = 10 * 1000 * 1000;

    public static void main(String[] args) {
        Osoba[] poleOsob = new Osoba[POCET];

        while (true) {

            for (int i = 0; i < POCET; i++) {
                //poleOsob[i] = new OsobaNevhodna();
                poleOsob[i] = new OsobaVhodna();

            }
        }

//        System.out.println(poleOsob[0].getClass().getName());
//        System.out.println(poleOsob[0].getPrijmeni() + ", " + poleOsob[0].getVyska() + ", "
//                + poleOsob[0].getVaha());
//
//        long start = System.currentTimeMillis();
//        Set hs = new HashSet(POCET);
//        for (int i = 0; i < POCET; i++) {
//            hs.add(poleOsob[i]);
//        }
//        long stop = System.currentTimeMillis();
//        System.out.println("Vlozeni " + hs.size() + " [" + POCET + "]");
//        System.out.println("Cas: " + (stop - start) + " ms");
//
//        start = System.currentTimeMillis();
//        int poc = 0;
//        for (int i = POCET - 1; i >= 0; i--) {
//            if (hs.contains(poleOsob[i])) {
//                poc++;
//            }
//        }
//        stop = System.currentTimeMillis();
//
//        System.out.println("Pristup " + poc + " [" + POCET + "]");
//        System.out.println("Cas: " + (stop - start) + " ms");

    }
}
