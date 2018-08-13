/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package total;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Oldřich
 */
public class TotalDemo3 {

    public static void main(String[] args) {
        //ArrayList<OsobaPorovnatelna> pole = new ArrayList<>();
        OsobaPorovnatelna pole[] = new OsobaPorovnatelna[4];
        pole[0] = (new OsobaPorovnatelna("Pytel Jan", 180, 200));
        pole[1] = (new OsobaPorovnatelna("Sysel Pytel", 160, 54));
        pole[2] = (new OsobaPorovnatelna("Čohn Boy", 200, 97));
        pole[3] = (new OsobaPorovnatelna("Lína Huba", 176, 66));
        System.out.println(Arrays.asList(pole));
        System.out.println("1: serad dle jmena");
        System.out.println("2: serad dle jmena cesky");
        System.out.println("3: serad dle vahy");
        System.out.println("4: serad dle vysky)");
        System.out.print("vyberte moznost:");
        int volba = 0;
        Scanner reader = new Scanner(System.in);
        volba = reader.nextInt();
        switch (volba) {
            case 1:
                Arrays.sort(pole, OsobaPorovnatelna.DLE_JMENA);
                break;
            case 2:
                Arrays.sort(pole, OsobaPorovnatelna.DLE_JMENA_CESKY);
                break;
            case 3:
                Arrays.sort(pole, OsobaPorovnatelna.DLE_VAHY);
                break;
            case 4:
                Arrays.sort(pole, OsobaPorovnatelna.DLE_VYSKA);
                break;
            default:
                Arrays.sort(pole, OsobaPorovnatelna.DLE_JMENA);
                System.out.println("spatna volba, srovnam dle jmena");
                break;

        }
        //Collections.sort(pole);

        System.out.println(Arrays.asList(pole));
    }
}
