/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package total;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/**
 *
 * @author Oldřich
 */
public class OsobaPorovnatelna implements Comparable<OsobaPorovnatelna> {

    private String jmeno;
    private double vyska;
    private double vaha;

    public OsobaPorovnatelna(String jmeno, int vyska, int vaha) {
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
    public int compareTo(OsobaPorovnatelna o) {
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

    public static final Comparator<OsobaPorovnatelna> DLE_VAHY = new Comparator<OsobaPorovnatelna>() {

        @Override
        public int compare(OsobaPorovnatelna o1, OsobaPorovnatelna o2) {
            return (int) (o1.vaha - o2.vaha);

        }

    };
    public static final Comparator<OsobaPorovnatelna> DLE_VYSKA = new Comparator<OsobaPorovnatelna>() {

        @Override
        public int compare(OsobaPorovnatelna o1, OsobaPorovnatelna o2) {
            return (int) (o1.vyska - o2.vyska);

        }

    };
    public static final Comparator<OsobaPorovnatelna> DLE_JMENA = new Comparator<OsobaPorovnatelna>() {

        @Override
        public int compare(OsobaPorovnatelna o1, OsobaPorovnatelna o2) {
            return o1.jmeno.compareTo(o2.jmeno);

        }

    };
    public static final Comparator<OsobaPorovnatelna> DLE_JMENA_CESKY = new Comparator<OsobaPorovnatelna>() {

        @Override
        public int compare(OsobaPorovnatelna o1, OsobaPorovnatelna o2) {
            Collator col = Collator.getInstance(new Locale("cs", "CZ"));
            return col.compare(o1.getJmeno(), o2.getJmeno());

        }

    };

}
