# ToDo API REST with Spring Boot and H2 Database
This project consists of a simple To-Do API built with the Springboot Java Framework, using the H2 embedded database.

This is a simple and practical example, which can help those developers who are starting in the world of springboot to build an API with Spring boot following good development practices.

For this project, version 2.5 of Springboot has been used, this is because the Swagger library has been incorporated into the project and due to compatibility problems with Spring boot 3, I had to create this project with Spring boot 2.5

As I mentioned, the Swagger library has been used in its version 2.9.2

### but... What is this library for?

Swagger is a library that we can use in Springboot to analyze the entire project and auto-document all the REST services that our project have, automatically. In this way, we can save ourselves a lot of documentation work.

I also implemented Swagger UI. This is a built-in solution that makes user interaction with the Swagger-generated API documentation much easier because it implements a simple and dynamic user interface for showing the documentation and testing the API.

Also, I've used H2 Database to work with the data. 

### H2 Database
H2 is an open-source lightweight Java database. It can be embedded in Java applications or run in the client-server mode. Mainly, H2 database can be configured to run as inmemory database, which means that data will not persist on the disk.

As H2 is a database that does not store data permanently, it has been used in this project as a database for testing purposes. You can change the database to another one you want if you want your data to persist.

For more information about H2 database: https://h2database.com

Enjoy this project and share it!
