package org.lessons.java.snack3;

public class RegistroStudenti {

    private String[] listaStudenti;

    public RegistroStudenti() {
        String[] nuovaLista = {};
        this.listaStudenti = nuovaLista;
    }

    public void AddStudente(String studente) {
        String[] nuovaLista = new String[listaStudenti.length + 1];

        for (int i = 0; i < listaStudenti.length; i++) {
            nuovaLista[i] = listaStudenti[i];
        }

        nuovaLista[nuovaLista.length - 1] = studente;

        this.listaStudenti = nuovaLista;
    }

    public String[] GetRegistro() {
        if (listaStudenti.length != 0 && listaStudenti != null) {
            return listaStudenti;
        }
        return null;
    }

}
