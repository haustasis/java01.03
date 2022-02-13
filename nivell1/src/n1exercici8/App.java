package n1exercici8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class App {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm0 = new LinkedHashMap<String, String>();
        lhm0.put("uno", "Rusia");
        lhm0.put("dos", "Ucrania");
        lhm0.put("tres", "USA");
        lhm0.put("cuatro", "Estonia");
        lhm0.put("cinco", "Israel");
        lhm0.put("seis", "Singapur");

        ArrayList<String> lmh0Keys = new ArrayList<>(lhm0.keySet());

        Collections.sort(lmh0Keys);

        for(String str: lmh0Keys){
            System.out.println(str);
        }

    }
}
