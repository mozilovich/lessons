package Deque;

/**
 * Created by Admin on 26.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Deque d1 = new Deque();
        d1.addFirst(1);
        d1.addFirst(2);
        d1.addFirst(3);
        d1.addFirst(4);
        d1.addFirst(5);
        System.out.println(d1.getAndDeleteLast());
        System.out.println(d1.getAndDeleteLast());
        System.out.println(d1.getAndDeleteLast());
        System.out.println(d1.getAndDeleteLast());
        System.out.println(d1.getAndDeleteLast());
    }
}
