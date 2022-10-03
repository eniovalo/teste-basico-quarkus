package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@QuarkusTest
public class GreetingResourceTest {

    final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Test
    public void testHelloEndpoint() {
        final String texto = "Olá Quarkus";
        final String dataAtualFormatada = dateTimeFormatter.format(LocalDate.now());

        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is(texto + " - " + dataAtualFormatada));
    }

}