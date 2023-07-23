package org.acme;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.inject.Inject;

@QuarkusTest
public class GreetingServiceTest {
    @Inject
    GreetingService greetingService;

    @Test
    public void getDataTest() {
        var df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        final var dataEsperada = LocalDate.parse("23/07/2023", df);

        final var dataResultado = greetingService.getData("23/07/2023");
        Assertions.assertEquals(dataEsperada, dataResultado);
    }

    @Test
    public void somarTest() {
        final var somatoria = greetingService.somar(2, 5);
        Assertions.assertEquals(7, somatoria);
    }

    @Test
    public void multiplicarTest() {
        final var multiplicacao = greetingService.multiplicar(2, 5);
        Assertions.assertEquals(10, multiplicacao);
    }

}