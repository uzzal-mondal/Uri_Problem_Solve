package Hacker_Rank.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(25);
        list.add(30);
        list.add(15);


        list.removeIf(i -> i < 20);
        System.out.println(list);

       /* while (it.hasNext()) {
            Integer i = it.next();
            if (i < 20) {
                it.remove();
            }
        }
        System.out.println(list);*/
    }
}
