package n1exercici5;

import java.util.*;

public class App {

    public static void main(String[] args) {
        List<Integer> stack0 = new Stack<>();
        stack0.add(1);
        stack0.add(2);
        stack0.add(3);
        stack0.add(4);
        stack0.add(5);

        List<Integer> arrList0 = new ArrayList<>();
        arrList0.add(10);
        arrList0.add(20);
        arrList0.add(30);
        arrList0.add(40);
        arrList0.add(50);


        ListIterator<Integer> listIterator = stack0.listIterator(stack0.size());


        while (listIterator.hasPrevious()) {
            arrList0.add(listIterator.previous());
        }

        for(Integer i : arrList0) {
            System.out.println(i);
        }
    }
}
