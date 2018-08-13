//... Kucharske recepty
import java.util.HashMap;
import java.util.Iterator;
public class HmPraktic2 {
    public static void main(String[] args) {
//... pouziti tzv. generickych typu (v C++ - sablony)!!!!
        HashMap<String, String[]> recepty = new HashMap<String, String[]>();

        String[] r1 = { "brambory", "veprove", "cibule", "pivo!" };
        String[] r2 = { "mouka", "cukr", "vejce", "cokolada" };
        String[] r3 = { "... nech si ji donest ..." };

        recepty.put("Gulas", r1);
        recepty.put("Kolac", r2);
        recepty.put("Pizza", r3);

//... tisk klicu - receptu           
        System.out.println("Tisk nazvu receptu:");
        Iterator<String> it = recepty.keySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
 //... tisk hodnot - vytahni pole retezcu a ty pak v cyklu vypis!
        System.out.println("\nTisk obsahu receptu:");
        String[] pomPoleStr = new String[1];
        for (Iterator it2 = recepty.values().iterator(); it2.hasNext(); ) {
            pomPoleStr = (String[])it2.next();
            for (int i = 0; i < pomPoleStr.length; i++) {
                System.out.print(pomPoleStr[i] + ", ");
            }
            System.out.println();
        }

//... ziskani konkretniho receptu:
        String jidlo = "Gulas"; //... zadej ze vstupu
        if (recepty.containsKey(jidlo)) {
            System.out.print("\n" + jidlo + " obsahuje: ");
            pomPoleStr = recepty.get(jidlo);
            for (int i = 0; i < pomPoleStr.length; i++) {
                System.out.print(pomPoleStr[i] + ", ");
            }
        } else {
            System.out.println("\nRecept <" + jidlo + "> v seznamu neni!");
            System.exit(1);
        }

    }
}

