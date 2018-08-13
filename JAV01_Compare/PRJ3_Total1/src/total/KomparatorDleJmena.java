/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package total;

import java.util.Comparator;

/**
 *
 * @author Oldřich
 */
public class KomparatorDleJmena implements Comparator<Osoba> {

    @Override
    public int compare(Osoba o1, Osoba o2) {
        return o1.getJmeno().compareTo(o2.getJmeno());
    }

}
