package org.lessons.java.snack2;

import java.math.BigDecimal;

public class ContoBancario {

    private int numeroConto;
    private BigDecimal saldoConto;

    public ContoBancario(int numeroConto) {
        if (numeroConto > 0) {
            this.numeroConto = numeroConto;
            this.saldoConto = new BigDecimal(0).setScale(2);
        }
    }

    public BigDecimal getSaldoConto() {
        return saldoConto;
    }

    public int getNumeroConto() {
        return this.numeroConto;
    }

    public void Deposita(BigDecimal soldi) {
        if (soldi.compareTo(BigDecimal.ZERO) > 0) {
            this.saldoConto = this.saldoConto.add(soldi);
        } else {
            System.out.println("Somma di denaro inserita non valida!");
        }
    }

    public void Preleva(BigDecimal soldi) {
        if (soldi.compareTo(BigDecimal.ZERO) > 0) {
            this.saldoConto = this.saldoConto.subtract(soldi);
        } else {
            System.out.println("Somma di denaro inserita non valida!");
        }
    }

}
