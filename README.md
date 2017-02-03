# Spring Boot RESTful Resource with Polymer

This is an example of Spring Boot RESTful Resource with polymer 1.x.

## Requirements

- Java 1.8
- Gradle
- NPM
- Bower

For Node.js/NPM installation visit [https://nodejs.org]. 

Install bower:
 
 ```npm install -g bower```
 
## Running
Install required bower components:

```bower install```

Start the application locally by running:
 
```gradle bootRun```

Or:

```gradle run```

Open [http://localhost:8080/] in your browser.

## POSTing to the REST API using curl:

    curl -i -X POST -H "Content-Type:application/json" https://localhost:8080/api/v1/books -d '{"title":"novotitulo","author":"novoautor","date":"2017-01-01","pages":200}'



