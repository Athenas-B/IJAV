/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Oldřich
 */
public class NaturalDemo1 {

    public static void main(String[] args) {
        ArrayList<Osoba> pole = new ArrayList<>();
        pole.add(new Osoba("Pytel Jan", 180, 200));
        pole.add(new Osoba("Sysel Pytel", 160, 54));
        pole.add(new Osoba("John Boy", 200, 97));
        pole.add(new Osoba("Lína Huba", 176, 66));
        System.out.println(pole);
        Collections.sort(pole);
        System.out.println(pole);
    }
}
