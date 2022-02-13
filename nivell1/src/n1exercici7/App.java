package n1exercici7;

import java.util.*;

public class App {

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap0 = new TreeMap<Integer, String>();

        treeMap0.put(1, "Barcelona");
        treeMap0.put(2, "Girona");
        treeMap0.put(3, "Tarragona");
        treeMap0.put(4, "Lleida");
        treeMap0.put(5, "Andorra");

        System.out.println("TREEMAP");
        for(Map.Entry m : treeMap0.entrySet()){
            System.out.println(m.getKey() + " "+ m.getValue());
        }
        System.out.println("----------");

        LinkedHashMap<Integer, String> linkedHashMap0 = new LinkedHashMap<Integer, String>(treeMap0);
        System.out.println("LINKEDHASHMAP");
        for(Map.Entry m : linkedHashMap0.entrySet()){
            System.out.println(m.getKey() + " "+ m.getValue());
        }
        System.out.println("----------");


        HashSet<Integer> hashSet0 =new HashSet<Integer>(linkedHashMap0.keySet());
        Iterator hashSet0Iterator = hashSet0.iterator();
        System.out.println("HASHSET");
        while (hashSet0Iterator.hasNext()) {
            System.out.println(hashSet0Iterator.next());
        }
        System.out.println("----------");

        LinkedHashSet<Integer> linkedHashSetSet0 = new LinkedHashSet<Integer>(linkedHashMap0.keySet());
        Iterator linkedHashSetSet0Iterator = linkedHashSetSet0.iterator();
        System.out.println("LINKEDHASHSET");
        while (linkedHashSetSet0Iterator.hasNext()) {
            System.out.println(linkedHashSetSet0Iterator.next());
        }
        System.out.println("----------");

    }
}

