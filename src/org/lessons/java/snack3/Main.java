package org.lessons.java.snack3;

import org.lessons.java.snack1.Studente;

public class Main {
    public static void main(String[] args) {

        RegistroStudenti nuovoRegistro = new RegistroStudenti();

        // DICHIARAZIONE DEGLI STUDENTI
        Studente anselmo = new Studente("Anselmo", "Bitta", 24);
        Studente tommaso = new Studente("Tommaso", "Rossi", 30);
        Studente alberto = new Studente("Alberto", "Genovese", 28);
        Studente michele = new Studente("Michele", "Bianchi", 20);

        // AGGIUNTA AL REGISTRO
        nuovoRegistro.AddStudente(anselmo.GetStudente());
        nuovoRegistro.AddStudente(tommaso.GetStudente());
        nuovoRegistro.AddStudente(alberto.GetStudente());
        nuovoRegistro.AddStudente(michele.GetStudente());

        // VISIONE A SCHERMO DEL REGISTRO
        for (int i = 0; i < nuovoRegistro.GetRegistro().length; i++) {
            System.out.println(nuovoRegistro.GetRegistro()[i]);
        }

    }
}
