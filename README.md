Spring Boot Restful API for Email Sending

This project provides a sample implementation of a Restful API using Spring Boot for sending emails. It allows you to send emails by making HTTP requests to the API endpoints.

Prerequisites
Before getting started, make sure you have the following:

Java Development Kit (JDK) installed (version 8 or higher)
Maven installed
An SMTP server (eg: sendinblue) credentials for sending emails
Getting Started
Clone the repository to your local machine:

shell
Copy code
git clone https://github.com/Asitha-Muthumala/SpringBoot-Restful-Mail-API.git
Navigate to the project directory:

shell
Copy code
cd SpringBoot-Restful-Mail-API
Open the src/main/resources/application.properties file and configure the SMTP server settings:

properties
Copy code
# SMTP Server Configuration
spring.mail.host=your-smtp-server
spring.mail.port=your-smtp-port
spring.mail.username=your-email-username
spring.mail.password=your-email-password
Build the project using Maven:

shell
Copy code
mvn clean install
Run the application:

shell
Copy code
mvn spring-boot:run
The API will start running on http://localhost:8080.

API Endpoints
The API provides the following endpoints for sending emails:

Send a Simple Email
Endpoint: POST api/mail/send

Request Body:

json
Copy code
{
"toMail": "example@gmail.com",
"subject": "example",
"message": "example"
}

Author
This project was created by Asitha Muthumala.
