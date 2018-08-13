package pr3;


import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Oldřich
 */
public class L01_Fronta {

    private Queue que = new LinkedList();

    public L01_Fronta() {
        System.out.println("FIFO ready");
    }

    public void push(Object o) {
        que.add(o);
    }

    public Object pop() {
        return que.remove();
    }

    public void tisk() {
        System.out.println(que);
    }

    public static void main(String[] args) {
        L01_Fronta front = new L01_Fronta();

        front.push("Ahoj");
        front.push(2);
        front.push(3);
        front.push(4);
        front.push(5);

        front.tisk();
        front.pop();
        front.tisk();
        front.pop();
        front.tisk();

        front.push("Nzdat");
        front.tisk();
    }
}
