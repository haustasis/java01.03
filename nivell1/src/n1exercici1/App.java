package n1exercici1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Month> year = new ArrayList<Month>();
        year.add(new Month("Gener"));
        year.add(new Month("Febrer"));
        year.add(new Month("Març"));
        year.add(new Month("Abril"));
        year.add(new Month("Maig"));
        year.add(new Month("Juny"));
        year.add(new Month("Juliol"));
        year.add(new Month("Setembre"));
        year.add(new Month("Octubre"));
        year.add(new Month("Novembre"));
        year.add(new Month("Desembre"));
        year.add(new Month("Agost"));

        for (int i = 0; i < year.size(); i++) {
            System.out.println("Ordre " + i + ": " + year.get(i).getName());
        }

    }
}
