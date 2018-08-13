/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1;

/**
 *
 * @author Oldřich
 */
public class Bod {

    private int x;
    private int y;
    private double vzdalenost = 0;

    public Bod(int x, int y) {
        this.x = x;
        this.y = y;
        vratVzdalenostOdPocatku();
    }

    double vratVzdalenostOdPocatku() {

        vzdalenost = Math.sqrt(x * x + y * y);
        return vzdalenost;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "[ " + x + ", " + y + "; " + vzdalenost + " ]";
    }

}
