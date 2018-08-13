import java.util.LinkedList;
import java.util.Queue;
public class L03_WithInner {

//... 1. vnitrni trida - STACK

    public class Zasobnik {
        private LinkedList zasob = new LinkedList();

        public Zasobnik() {
            System.out.println("Stack (LIFO) is Ready ...");
        }

//... Overriding add()/push(), remove()/pop()
        public void push(Object o) {
            zasob.addFirst(o);
        }

        public Object pop() {
            return zasob.remove();
        }

        public void tisk() {
            System.out.println(zasob);
        }
    }

//... 2. vnitrni trida - QUEUE 
    public class Fronta {
//        private LinkedList que = new LinkedList();
        private Queue que = new LinkedList();

        public Fronta() {
            System.out.println("Queue (FIFO) is Ready ...");
        }

//... Overriding add()/push(), remove()/pop()
        public void push(Object o) {
//            que.addLast(o);
            que.add(o);
        }

        public Object pop() {
            return que.remove();
        }

        public void tisk() {
            System.out.println(que);
        }

    }

    public static void main(String[] args) {
        System.out.println("Pøíklad na použití vnitøních tøíd:");

        L03_WithInner wi = new L03_WithInner(); //.. nutné - vlastni instance

//  Pristup ke STACKU        
        L03_WithInner.Zasobnik stack = wi.new Zasobnik(); //... asi takto!!!
        stack.tisk(); //... zasobnik je prazdny
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.tisk();
        stack.pop();
        stack.tisk();
        stack.pop();
        stack.tisk();

        stack.push(3.14159);
        stack.tisk();

//  Pristup do QUEUE
        L03_WithInner.Fronta front = wi.new Fronta();

        front.tisk();
        front.push(1);
        front.push(2);
        front.push(3);
        front.push(4);
        front.push(5);

        front.tisk();
        front.pop();
        front.tisk();
        front.pop();
        front.tisk();

        front.push("Nazdar");
        front.tisk();
    }
}
