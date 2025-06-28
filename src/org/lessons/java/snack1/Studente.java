package org.lessons.java.snack1;

public class Studente {

    private String nome;
    private String cognome;
    private int eta;

    public Studente(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String GetStudente() {
        return this.nome + " " + this.cognome + ", " + this.eta + " anni";
    }
}
