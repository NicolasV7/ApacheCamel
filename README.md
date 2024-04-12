# Camel-Enigma-Resolve-Api

## 🚀 Project Structure

Inside of your Astro project, you'll see the following folders and files:

```text
/
├── src/
│   ├── java\co\com\villota\microservice/
│   │   ├── api/
|   |   |   ├── ApiException.java
|   |   |   ├── ApiOriginFilter.java
|   |   |   ├── ApiResponseMessage.java
|   |   |   ├── GetStepApi.java
|   |   |   ├── GetStepApiController.java
|   |   |   └── NotFoundException.java
│   │   ├── config/
|   |   |   └── ResolveEnigmaApiApplication.java
│   │   ├── model/
|   |   |   ├── client/
|   |   |   |   ├── ClientGetEnigmaStepResponse.java
|   |   |   |   ├── ClientHeader.java
|   |   |   |   └── ClientJsonApiBodyResponseSuccess.java
|   |   |   ├── ErrorDetail.java
|   |   |   ├── GetEnigmaRequest.java
|   |   |   ├── GetEnigmaStepResponse.java
|   |   |   ├── Header.java
|   |   |   ├── JsonApiBodyRequest.java
|   |   |   ├── JsonApiBodyResponseErrors.java
|   |   |   └── JsonApiBodyResponseSuccess.java
│   │   ├── routes/
|   |   |   ├── GetStepOneClientRoute.java
|   |   |   ├── GetStepThreeClientRoute.java
|   |   |   ├── GetStepTwoClientRoute.java
|   |   |   ├── ResolveEnigmaTransactionErrorRoute.java
|   |   |   └── SaveLogsClientRoute.java
│   │   ├── strategy/
│   │   └── ResolveEnigmaApiApplication.java
│   ├── resources/
|   |   ├── templates/
|   |   |   ├── GetStepOneClientTemplate.ftl
|   |   |   ├── GetStepTwoClientTemplate.ftl
|   |   |   ├── GetStepThreeClientTemplate.ftl
|   |   |   ├── ResolveEnigmaTransactionError.ftl
|   |   |   └── ResolveEnigmaTransactionTemplate.ftl
│   │   └── application.yml
└── pom.xml
```
## 📚 Endpoints

| Endpoint | Description |
| :------- | :---------- |
| `/v1/getOneEnigma/`      | Home page   |
| `/v1/getOneEnigma/getStep` | Get steps page  |
| `/v1/getOneEnigma/swagger-ui.html` | Visual swagger page  |

## 🧞 Commands

All commands are run from the root of the project, from a terminal:

| Command                   | Action                                           |
| :------------------------ | :----------------------------------------------- |
| `mvn spring-boot:run`             | Run service                            |
| `mvn clean install`             | Build service                            |
