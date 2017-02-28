package queue;

import java.util.LinkedList;

/**
 * Created by Admin on 26.02.2017.
 */
public class Queue {
    LinkedList list = new LinkedList();

    public void addFirst(Object value) {
        list.add(0, value);
    }

    public Object getAndDeleteLast() {
        Object o = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return o;
    }

    public void showLast() {
        System.out.println(list.size() - 1);
    }

    public int getSize() {
        return list.size();
    }

}
