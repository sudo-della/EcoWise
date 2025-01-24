# EcoWise: Waste Sorting Mobile Application


## Overview

EcoWise is a Spring Boot-based backend application designed for a waste sorting mobile app at Enviro365. The project promotes sustainable waste management by providing users with functionalities such as waste category lookup, disposal guidelines retrieval, and recycling tips display. This backend serves as the API layer, facilitating communication between the mobile frontend and the data layer.


## Features
- RESTful APIs to manage and retrieve waste categories, disposal guidelines, and recycling tips.
- Input validation for request payloads using Spring Boot validation annotations.
- In-memory database (H2) for development and testing.
- Preloaded database entries for seamless testing and demonstration.
- JSON-formatted responses for structured data exchange.


## Prerequisites
To run this project, ensure you have the following:
- Java Development Kit (JDK 11 or higher)
- Maven (for building the project)
- IntelliJ IDEA IDE


## Installation and Setup

- Clone the Repository
  (```git clone git@github.com:sudo-della/EcoWise.git```) 

- Build the Project
  (`mvn clean install`)

- Run the Application
  (`mvn spring-boot:run`)

- Access the H2 Console
  Open your browser and go to: (`http://localhost:8080/h2-console`)
  - JDBC URL: jdbc:h2:mem:testdb
  - Username: sa
  - Password: password


## Endpoints
- Waste Categories
  - Retrieve All Categories
    - GET /api/waste-categories
      - Response:
      (```[
        {
          "id": 1,
          "wasteName": "Plastic",
          "description": "Materials made of plastic."
        },
        {
          "id": 2,
          "wasteName": "Organic",
          "description": "Biodegradable materials."
        }
      ]```)
  
  - Add a New Category
    - POST /api/waste-categories
    - Request Body:
      (```{
        "wasteName": "Metal",
        "description": "Recyclable metal materials."
      }```)

- Disposal Guidelines
  - Retrieve All Guidelines
  - GET /api/disposal-guidelines

- Recycling Tips
  - Retrieve All Tips
  - GET /api/recycling-tips


### WasteCategoryModel
| Field        | Type   | Description                        |
|--------------|--------|------------------------------------|
| id           | Long   | Auto-generated unique identifier. |
| wasteName    | String | Name of the waste category.       |
| description  | String | Description of the category.      |


### DisposalGuidelineModel
| Field        | Type   | Description                        |
|--------------|--------|------------------------------------|
| id           | Long   | Auto-generated unique identifier. |
| category     | String | Category associated with the guideline. |
| guidelines   | String | Disposal guidelines.              |


### RecyclingTipModel
| Field        | Type   | Description                        |
|--------------|--------|------------------------------------|
| id           | Long   | Auto-generated unique identifier. |
| tip          | String | Recycling tip content.            |


## Technologies Used
- Spring Boot: For building the RESTful API.
- H2 Database: In-memory database for development and testing.
- Maven: Dependency management and project building.
- Java: Programming language for the backend logic.


## Development Workflow
- Implement new features in the respective controllers, configurations, services, and repositories.
- Preload database entries using CommandLineRunner or data.sql.
- Test endpoints using Postman or an equivalent API client.
- Debug using the H2 console and verify database state.


## Future Improvements
- Enhanced error handling and custom exception responses.

## Contributors
- Daniella
