package n1exercici2;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {

        HashSet<String> year = new HashSet<String>();
        year.add("Gener");
        year.add("Gener");
        year.add("Gener");
        year.add("Febrer");
        year.add("Febrer");
        year.add("Febrer");
        year.add("Març");
        year.add("Març");
        year.add("Març");
        year.add("Abril");
        year.add("Abril");
        year.add("Abril");
        year.add("Maig");
        year.add("Maig");
        year.add("Juny");
        year.add("Juny");
        year.add("Juny");
        year.add("Juliol");
        year.add("Juliol");
        year.add("Agost");
        year.add("Agost");
        year.add("Setembre");
        year.add("Setembre");
        year.add("Setembre");
        year.add("Novembre");
        year.add("Novembre");
        year.add("Novembre");
        year.add("Desembre");
        year.add("Desembre");
        year.add("Desembre");


        for (String str : year) {
            System.out.println(str);
        }

    }
}
