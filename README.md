# Spring Boot with Polymer 1.x

This app uses Spring MVC to create REST Resources that is consumed by a Polymer SPA

##### Prerequisites

Install [Gradle] or use the gradlew bash script ./gradlew build.

Install [Bower]   

##### Build and run the app
    
    cd [app root directory]
    gradle build
    gradle run

### On browser

Spring Boot serves the app at `http://localhost:8080`

### POSTing to the REST API using curl:

    curl -i -X POST -H "Content-Type:application/json" https://localhost:8080/api/v1/books -d '{"title":"novotitulo","author":"novoautor","date":"2017-01-01","pages":200}'