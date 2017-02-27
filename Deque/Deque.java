package Deque;

import java.util.LinkedList;

/**
 * Created by Admin on 26.02.2017.
 */
public class Deque {
    LinkedList list = new LinkedList();
    public void addFirst(Object value){
        list.add(0,value);
    }
    public void addLast(Object value){
        list.add(value);
    }
    public Object getAndDeleteFirst(){
        Object o = list.get(0);
        list.remove(0);
        return o;
    }
    public Object getAndDeleteLast(){
        Object o = list.get(list.size()-1);
        list.remove(list.size()-1);
        return o;
    }
    public void showFirst(){
        System.out.println(list.get(0));
    }
    public void showLast(){
        System.out.println(list.get(list.size()-1));
    }
    public int getSize(){
        return list.size();
    }
}
