package collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // ArrayList Declaration
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        int a = 10;
        System.out.println(list.size());
        System.out.println(list.get(2));

        // Iterating the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //  list.remove()
    }
}
