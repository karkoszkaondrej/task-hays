# Example Task for  [Hays](https://hays.jobs.cz/)

In a call with [Lucas Ferrario](https://www.linkedin.com/in/lucas-e-ferrario/) in 8.3.20223 we have decided to advance in recruitment process for employer. In 13.3.2023 I have start of this assignment.

## Assignment specification

Implement:
- Spring Boot micro-service written in Java
- Build with Maven
- Data will be stored in embeded H2 database
- micro-service will be able to run locally without any other external DB (etc.) dependencies
- provide source code to us preferably with link publicly available on the internet or via ZIP file attached to the email

Create endpoint for creation of Quotation.

Quotation has business attributes:
- beginingOfInsurance
- insuredAmount
- dateOfSigningMortgage
- Customer

Create endpoint for creation of Subscription.
Create endpoint for retrieving single Subscription object.

Subscription has business attributes:
- Quotation
- startDate
- validUntil


Create endpoint for updating Customer attributes.
Endpoint for updating Customer should be able to update and/or remove existing values of any/all attributes.

Customer has business attributes:
- firstName
- lastName
- middleName
- email
- phoneNumber
- birthDate

## Development steps

- [x] [Short REST Description](#short-rest-description)
- [x] [OpenAPI Specification](#openapi-specification)
- [x] [Creation of Project](#creation-of-project)
- [x] [OpenAPI Generation](#openapi-generation)
- [x] [Run Program](#run-program)
- [x] [Implementation](#implementation)

## Short REST Description

Order of parts point to creation of specifications in OpenAPI. 

### Objects

Customer:
- firstName
- lastName
- middleName
- email
- phoneNumber
- birthDate

Quotation:
- beginingOfInsurance
- insuredAmount
- dateOfSigningMortgage
- Customer

Subscription:
- Quotation
- startDate
- validUntil

### Addresses

Pointed out with [Http requests](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods) in  mind.

- /quotation/ POST
- /subscription/ POST
- /subscription/{id} GET
- /customer/{id} GET
- /customer/ POST
- /customer/{id} DELETE


## OpenAPI Specification

Written in [VSCode](https://code.visualstudio.com/) using [Spectral linter](https://stoplight.io/open-source/spectral) resulting to [definitions file](openapi/openapi.yaml) with use of a [Swagger Pet store template](https://editor.swagger.io/).

## OpenAPI Generation

Used file and written dependencies according to [tutorial](https://www.baeldung.com/java-openapi-generator-server). Added new dependencies that were missing. 

## Run Program

Functional package of Spring Boot with H2 DB was found in [Javatpoint tutorial](https://www.javatpoint.com/spring-boot-h2-database).
Executed program run and is suitable for modification. 

## Implementation

Implemented in [IntelliJ Idea](https://www.jetbrains.com/idea/) and tested in [Postman](https://www.postman.com/).
Prototypes for data inserted to db are in the [prototypes folder](prototypes). Postman project definitions are in [postman folder](postman).