# Petmanager

Make sure you have downloaded Java version 19 and Node.js version 19.3.0.

## Development server

Before running you need to install Angular CLI by running `npm install -g @angular/cli` or just `npm install`.
Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`.

## Back-end

Run PetmanagerApplication.java to start. 
Navigate to `http://localhost:4200/pet` and use paths written in PetController.java file.

## H2 Database Engine
To access H2 console:\
Navigate to `http://localhost:8080/h2-console` and insert following:
JDBC URL: jdbc:h2:petmanager

User Name: sa

Password: password

OR look to application.properties file for information. 
