package n1exercici3;

import java.util.*;

public class App {

    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> arrList0 = new ArrayList<>();
        do {
                arrList0.add(Generadora.seguentPersonatge());
        } while(Generadora.contador != 0);
        System.out.println("ArrayList");
        for(String str : arrList0) {
            System.out.println(str);
        }
        System.out.println("----------");

        // LinkedList
        LinkedList<String> linkList0 = new LinkedList<>();
        do {
                linkList0.add(Generadora.seguentPersonatge());
        } while(Generadora.contador != 0);
        System.out.println("LinkedList");
        for(String str : linkList0) {
            System.out.println(str);
        }
        System.out.println("----------");

        // HashSet
        HashSet<String> hashSet0 = new HashSet<>();
        do {
            if(Generadora.seguentPersonatge().length() != 0) {
                hashSet0.add(Generadora.seguentPersonatge());
            }
        } while(Generadora.contador != 0);
        System.out.println("HashSet");
        for(String str : hashSet0) {
            System.out.println(str);
        }
        System.out.println("----------");

        // LinkedHashSet
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<>();
        do {
            if(Generadora.seguentPersonatge().length() != 0) {
                linkedHashSet0.add(Generadora.seguentPersonatge());
            }
        } while(Generadora.contador != 0);
        System.out.println("LinkedHashSet");
        for(String str : linkedHashSet0) {
            System.out.println(str);
        }
        System.out.println("----------");

        // TreeSet
        TreeSet<String> treeSet0 = new TreeSet<>();
        do {
            if(Generadora.seguentPersonatge().length() != 0) {
                treeSet0.add(Generadora.seguentPersonatge());
            }
        } while(Generadora.contador != 0);
        System.out.println("TreeSet");
        for(String str : treeSet0) {
            System.out.println(str);
        }
        System.out.println("----------");

    }
}
