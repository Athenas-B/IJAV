/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package total;

/**
 *
 * @author Oldřich
 */
public class Osoba implements Comparable<Osoba> {

    private String jmeno;
    private double vyska;
    private double vaha;

    public Osoba(String jmeno, int vyska, int vaha) {
        this.jmeno = jmeno;
        this.vyska = vyska;
        this.vaha = vaha;
    }

//    @Override
//    public int compareTo(Osoba o) {
//        return this.jmeno.compareTo(o.getJmeno());
//    }
//    @Override
//    public int compareTo(Osoba o) {
//        double osVaha = o.getVaha();
//        if (this.vaha > osVaha) {
//            return 1;
//        } else if (this.vaha == osVaha) {
//            return 0;
//        } else {
//            return -1;
//        }
//    }
    @Override
    public int compareTo(Osoba o) {
        double osVyska = o.getVyska();
        if (this.vyska > osVyska) {
            return 1;
        } else if (this.vyska == osVyska) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Osoba{" + "jmeno=" + jmeno + ", vyska=" + vyska + ", vaha=" + vaha + '}';
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public double getVyska() {
        return vyska;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }

    public double getVaha() {
        return vaha;
    }

    public void setVaha(int vaha) {
        this.vaha = vaha;
    }

}
