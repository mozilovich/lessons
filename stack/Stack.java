package stack;


public class Stack {
  private int capacity = 1;
  private int size = 0;
  private Object[] list = new Object[capacity];

  public void add(Object value) {
    if (size == capacity) {
      capacity = capacity * 2;
      Object[] list1 = new Object[capacity];
      for (int i = 0; i < size; i++) {
        list1[i] = list[i];
      }
      list = list1;
    }
    list[size] = value;
    size++;
  }

  public Object getAndDelete() {
    Object o = list[size - 1];
    list[size - 1] = null;
    size--;
    return o;
  }

  public void showLast() {
    System.out.println(list[size - 1]);
  }

  public int getSize() {
    return size;
  }
}
