# Requirements

- JDK (used here : Java 21)
- Maven

# Get started

If using Intellij Idea :
- Clone the project with "Get from VCS" > "Repository URL" and copy paste the repo URL
- Let Maven install the dependencies
- Run DemoApplication.java
- To view the demo web page : Open your web browser and type in the search bar `localhost:8080`
  
You can view the database at `localhost:8080/h2-console` => connect with these settings in the console :
- Driver Class : org.h2.Driver
- JDBC URL : copy and paste the given URL by the Spring Boot console (Where it reads : `H2 console available at '/h2-console'. Database available at '[url to copy]'`)
- Username : sa
- Password : (nothing, leave empty)

Then click on connect and you can display the database by running "SELECT * FROM STUDENTS;"
