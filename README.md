Journal App 📓
A simple and intuitive journal application built with Spring Boot. This project allows users to create, view, edit, and delete journal entries, providing a secure and user-friendly platform for personal journaling.

Features
User authentication and authorization.
Create, read, update, and delete (CRUD) journal entries.
Timestamped entries for easy tracking.

Tech Stack
Backend: Spring Boot, Spring Security, Hibernate, JPA
Database: MongoDB
Build Tools: Maven

Feel free to clone and customize the app for your own journaling needs!

Configuration
To run the application, users must specify their MongoDB connection URI in the application.properties file.

spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<cluster-url>/<database>?retryWrites=true&w=majority
