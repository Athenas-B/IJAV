/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Oldřich
 */
public class A02_Arraylist {

    public static void main(String[] args) {
        A02_Arraylist a = new A02_Arraylist();
        List v = new ArrayList();
        //CeleCislo ci = a.new CeleCislo(25);
        Scanner scanner = new Scanner(System.in);
        Double ci = new Double(0);
        do {
            System.out.println("zadejte cislo:");
            ci = scanner.nextDouble();
            v.add(ci);
        } while (ci != 0);
//        v.add(ci);
//        ci = new Double(20.15);
//        v.add(ci);
//        ci = new Double(1.0005);
//        v.add(ci);
//        ci = new Double(3.14);
//        v.add(ci);
//        ci = new Double(-5.123456);
//        v.add(ci);

        tisk("obsah", v);

        Collections.sort(v);
        Collections.reverse(v);
        tisk("sort", v);
    }

    public static void tisk(String tit, List li) {
        System.out.println(tit + "{" + li.size() + "}: ");
        Iterator i = li.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + ", ");
        }
        System.out.println("");
    }

    class CeleCislo implements Comparable<Integer> {

        private int cislo;

        public CeleCislo(int cislo) {
            this.cislo = cislo;
        }

        public int getCislo() {
            return cislo;
        }

        public void setCislo(int cislo) {
            this.cislo = cislo;
        }

        @Override
        public String toString() {
            return "cislo=" + cislo;
        }

        @Override
        public int compareTo(Integer o) {
            return this.cislo - o;
        }

    }
}
