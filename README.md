# EcoWise: Waste Sorting Mobile Application<p align="left"> <img src="https://komarev.com/ghpvc/?username=sudo-della&label=Profile%20views&color=0e75b6&style=flat" alt="sudo-della" /> </p>

<h1 align="center">
    <img src="https://readme-typing-svg.herokuapp.com/?font=Righteous&size=35&center=true&vCenter=true&width=500&height=70&duration=4000&lines=Hi+There!+👋;+I'm+Daniella+Kalombo!;" />
</h1>

<h3 align="center">A passionate software engineering student at WeThinkCode_</h3>

<br/>

<div align="center">
 
 🔭 I’m currently working on **MitshStock**
 
 🌱 I’m currently learning **Docker, React**

💬 Ask me about **Python, sql**

⚡ Fun fact **Your brain uses 10 watts of energy to think, and does not feel pain**

 </div>
 
<div align="center"> 
  <a href="mailto:daniellamitsh@gmail.com">
    <img src="https://img.shields.io/badge/Gmail-333333?style=for-the-badge&logo=gmail&logoColor=red" />
  </a>
  <a href="https://www.linkedin.com/in/daniella-kalombo-se/" target="_blank">
    <img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank" />
  </a>
<!--   <a href="https://salesp07.github.io" target="_blank">
     <img src="https://img.shields.io/badge/Portfolio-FF5722?style=for-the-badge&logo=todoist&logoColor=white" target="_blank" /> <!-- sqlite, safari, google-chrome are other good icon options -->
<!--   </a> -->
</div>

 <hr/>
 
<h2 align="center">⚒️ Languages-Frameworks-Tools ⚒️</h2>
<br/>
<div align="center">
    <img src="https://skillicons.dev/icons?i=python,javascript,java,mysql,html,css,docker,c#,git" /><br>
</div>

<br/>
<hr/>

<div align="center">
  <h2>🐍 Stress Relief 🐍</h2>
  <br>
  <img alt="snake eating my contributions" src="https://raw.githubusercontent.com/salesp07/salesp07/output/github-contribution-grid-snake.svg" />
  
  <br/><br/><br/>
</div>

<hr/>

<h2 align="center">⚡ Stats ⚡</h2>
<br>
<div align="center">
  <p><img align="left" src="https://github-readme-stats.vercel.app/api/top-langs?username=sudo-della&show_icons=true&locale=en&layout=compact&theme=dark" alt="sudo-della" /></p>
  <p>&nbsp;<img align="center" src="https://github-readme-stats.vercel.app/api?username=sudo-della&show_icons=true&locale=en&theme=dark" alt="sudo-della" /></p>
</div>


<br/><br/>

<hr/>

<br/>



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
- Daniella Kalombo
