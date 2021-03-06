[![Build Status](https://travis-ci.org/andrelemos2/airlinesflights-api.svg?branch=master)](https://travis-ci.org/andrelemos2/airlinesflights-api)

Airlines Flights API (Informações aéreas)
==========================
Simples Projeto consumo disponibilidade aerea.

Última Versão
==========================

https://github.com/andrelemos2/airlinesflights-api.git

Link App
==========================

https://airlinesflights-api.herokuapp.com/aereos

## Pré requisito

Banco MYSQL na porta padrão (3306).

Porta padrão web container livre, caso não esteja configurar no arquivo `application.properties` com a linha a seguir: `server.port=xxxx` escolher a porta.

## Construindo na sua máquina

Execute `mvn spring-boot:run` assim que configurar o banco.

Técnologias utilizadas
==========================

- Spring Boot (https://projects.spring.io/spring-boot)
- Spring Data JPA (https://projects.spring.io/spring-data-jpa)
- Flyway (https://flywaydb.org)
- MYSQL (https://www.mysql.com)
- Maven 3 (https://maven.apache.org/docs/3.0/release-notes.html)
- JUnit 4 (http://junit.org)
- Java 8 (https://www.java.com/pt_BR/download/faq/java8.xml)

