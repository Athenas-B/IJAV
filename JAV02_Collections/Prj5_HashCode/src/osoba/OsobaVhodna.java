/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package osoba;

/**
 *
 * @author Oldřich
 */
public class OsobaVhodna extends Osoba {

    @Override
    public int hashCode() {
        return (int) (13 * prijmeni.hashCode() + 17 * vyska + 37 * vaha);
    }
}
