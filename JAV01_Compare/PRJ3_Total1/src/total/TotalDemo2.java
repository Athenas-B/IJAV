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
public class TotalDemo2 {

    public static void main(String[] args) {
        //ArrayList<OsobaPorovnatelna> pole = new ArrayList<>();
        OsobaPorovnatelna pole[] = new OsobaPorovnatelna[4];
        pole[0]=(new OsobaPorovnatelna("Pytel Jan", 180, 200));
        pole[1]=(new OsobaPorovnatelna("Sysel Pytel", 160, 54));
        pole[2]=(new OsobaPorovnatelna("Čohn Boy", 200, 97));
        pole[3]=(new OsobaPorovnatelna("Lína Huba", 176, 66));
        System.out.println(Arrays.asList(pole));
        //Collections.sort(pole);
        Arrays.sort(pole, OsobaPorovnatelna.DLE_JMENA);
        System.out.println(Arrays.asList(pole));
    }
}
