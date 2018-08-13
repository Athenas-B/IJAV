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
public class KomparatorDleJmenaCesky implements Comparator<Osoba> {

    private Collator col = Collator.getInstance(new Locale("cs", "CZ"));

    @Override
    public int compare(Osoba o1, Osoba o2) {

        return col.compare(o1.getJmeno(), o2.getJmeno());
    }

}
