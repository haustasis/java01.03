package n1exercici6;

import java.util.LinkedList;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>() ;
        getIterator(list).add(1);
        getIterator(list).add(2);
        getIterator(list).add(3);
        getIterator(list).add(4);
        getIterator(list).add(5);
        getIterator(list).add(6);
        getIterator(list).add(7);
        getIterator(list).add(8);

        for(Integer i : list) {
            System.out.println(i);
        }
    }

    private static ListIterator<Integer> getIterator(LinkedList<Integer> list) {
        return list.listIterator( list.size() / 2 );
    }

}

