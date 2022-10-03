package org.acme;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        final String texto = "Olá Quarkus";
        final String dataAtualFormatada = dateTimeFormatter.format(LocalDate.now());

        return texto + " - " + dataAtualFormatada;
    }
}