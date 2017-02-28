package queue;

/**
 * Created by Admin on 26.02.2017.
 */
public class Main {
  public static void main(String[] args) {
    Queue q1 = new Queue();
    q1.addFirst(1);
    q1.addFirst(2);
    q1.addFirst(3);
    q1.getAndDeleteLast();
    q1.showLast();
    System.out.println(q1.getSize());
    System.out.println(q1.getAndDeleteLast());
    System.out.println(q1.getAndDeleteLast());
  }
}
