/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osoba;

import com.sun.org.apache.xpath.internal.operations.Equals;
import java.util.Random;

/**
 *
 * @author Oldřich
 */
public class Osoba implements Comparable<Osoba> {

    protected String prijmeni;
    protected int vyska;
    protected double vaha;
    private static Random rg = new Random();

    public Osoba() {
        this.vyska = 150 + rg.nextInt(41);
        this.vaha = 50 + 70 * rg.nextDouble();
        byte[] bajty = new byte[7];
        for (int i = 0; i < 7; i++) {
            bajty[i] = (byte) ('A' + rg.nextInt(26));
        }
        this.prijmeni = new String(bajty);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Osoba == false) {
            return false;
        }
        Osoba os = (Osoba) o;
        boolean bPrijmeni = this.prijmeni.equals(os.prijmeni);
        boolean bVyska = this.vyska == os.vyska;
        boolean bVaha = this.vaha == os.vaha;
        return bPrijmeni && bVaha && bVyska;

    }

    @Override
    public String toString() {
        return "Osoba{" + "prijmeni=" + prijmeni + ", vyska=" + vyska + ", vaha=" + vaha + '}';
    }

    @Override
    public int compareTo(Osoba o) {
        return this.prijmeni.compareTo(o.prijmeni);
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getVyska() {
        return vyska;
    }

    public double getVaha() {
        return vaha;
    }

}
