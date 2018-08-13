/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package total;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Oldřich
 */
public class TotalDemo1 {

    public static void main(String[] args) {
        //ArrayList<OsobaPorovnatelna> pole = new ArrayList<>();
        Osoba pole[] = new Osoba[4];
        pole[0]=(new Osoba("Pytel Jan", 180, 200));
        pole[1]=(new Osoba("Sysel Pytel", 160, 54));
        pole[2]=(new Osoba("Čohn Boy", 200, 97));
        pole[3]=(new Osoba("Lína Huba", 176, 66));
        System.out.println(Arrays.asList(pole));
        //Collections.sort(pole);
        Arrays.sort(pole, new KomparatorDleJmenaCesky());
        System.out.println(Arrays.asList(pole));
    }
}
