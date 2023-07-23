package org.acme;

import java.time.LocalDate;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
@ApplicationScoped
public class GreetingResource {
    @Inject
    GreetingService greetingService;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        final LocalDate data = greetingService.getData("23/07/2023");
        final int resultadoSomatoria = greetingService.somar(1, 3);
        final double resultaMultiplicacao = greetingService.multiplicar(2, 3);
        final String texto = String.format("Olá Quarkus %s , soma: %d , multiplicação: %f", 
            data, 
            resultadoSomatoria, 
            resultaMultiplicacao);

        return texto;
    }
}
