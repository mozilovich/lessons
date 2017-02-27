package Stack;

import java.util.Arrays;

/**
 * Created by Admin on 26.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        /*s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        System.out.println(s1.getAndDelete());
        System.out.println(s1.getAndDelete());
        System.out.println(s1.getAndDelete());
        System.out.println(s1.getAndDelete());*/
        String s="[()]";
        System.out.println(proverka(s));

    }
    public static boolean proverka(String s) {
        Stack st = new Stack();
        char check;
        for (int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                st.add(c);
            } else {
                if (st.getSize() != 0) {
                    check = (char) st.getAndDelete();
                    if (c == '}' && check != '{') {
                        return false;
                    } else if (c == ']' && check != '[') {
                        return false;
                    } else if (c == ')' && check != '(') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return st.getSize() == 0;
    }
    }

