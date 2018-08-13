import java.util.HashMap;
/*
 *  Ukazka Mapy - pro default hodnoty (napr. nastaveni okna) a zmena
 *                  techto hodnot uzivatelem.
 */

public class HmPraktic1 {
    static String[] klice = {"jmeno", "barva", "delka", "sirka"};
    static String[] defaultHodnoty = {null, "bila", "0", "0"};
    
    public static void main(String[] args) {

        HashMap defa = nastaveni(defaultHodnoty);   //... i takto lze priradit
        System.out.print("Default:\t\t");
        System.out.println(defa);

        //... uzivatelske hodnoty lze nacist do pole napr. z klavesnice 
        String[] userHodnoty = {"Wokno", "modra", "200", "150"};
        HashMap user = nastaveni(userHodnoty);
        System.out.print("User:\t\t");
        System.out.println(user);
        
        defa = user;    //... nahrada - prepis
        System.out.print("Default(new):\t");
        System.out.println(defa);
    }

    private static HashMap nastaveni(String[] hodnoty) {
        HashMap hm = new HashMap();
        for (int i = 0; i < klice.length; i++)  {
            hm.put(klice[i],hodnoty[i]);
        }
        return hm;
    }
}
