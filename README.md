# teste-basico-quarkus
Projeto para testar o conhecimento básico em Java Quarkus.

## Requisitos
- Java JDK;
- Maven;

## Compilar projeto
- `./mvnw clean install`

## Rodar teste
- `./mvnw test`

## Subir projeto
- Modo normal: `./mvnw quarkus:dev`
- Modo debug: `./mvnw quarkus:dev -Dagentlib:jdwp=transport=dt_socket,server=y,address=5005`


## Objetivo
1. Compile o projeto, caso tenha erros de compilação ou de teste, resolva-os.
2. Acessar o endpoint </hello>.
