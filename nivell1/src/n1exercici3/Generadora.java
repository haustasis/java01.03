package n1exercici3;

import java.util.ArrayList;

public class Generadora {
    static ArrayList<String> personatges = new ArrayList<String>();

    static {
        personatges.add("Genny Savastano");
        personatges.add("Imma Savastano");
        personatges.add("Pietro Savastano");
        personatges.add("Ciro Di Marzio");
        personatges.add("Salvatore Conte");
    }

    static int contador = 0;

    static String seguentPersonatge() {

        String personatge = "";
        if(contador < (personatges.size() - 1)) {
            personatge = personatges.get(contador);
            contador++;
        } else {
            personatge = personatges.get(personatges.size() - 1);
            contador = 0;
        }

        return personatge;
    }

}
