package org.acme;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class GreetingService {
    public LocalDate getData(final String dataTexto) {
        var df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dataTexto, df);
    }

    public int somar(final int numero1, final int numero2) {
        return numero1 + numero2;
    }

    public double multiplicar(final double numero1, final double numero2) {
        return numero1 * numero2;
    }
}
