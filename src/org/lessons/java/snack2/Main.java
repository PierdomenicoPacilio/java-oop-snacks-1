package org.lessons.java.snack2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ContoBancario prova = new ContoBancario(365937493);

        System.out.println(prova.getSaldoConto());

        prova.Deposita(new BigDecimal(1000));

        System.out.println(prova.getSaldoConto());

        prova.Preleva(new BigDecimal(100));

        System.out.println(prova.getSaldoConto());
    }
}
