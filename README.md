# Student Management API

This is a sample Spring Boot project created to introduce myself to Spring API development. It implements a simple RESTful web service for managing student profiles, showcasing core concepts of Spring Boot, REST APIs, and Swagger UI for documentation.

## Project Overview

The project allows for basic CRUD operations on student data, with the following features:
- **GET /students**: Retrieve a list of all students.
- **GET /students/{id}**: Retrieve details of a specific student by their ID.
- **POST /students**: Add a new student profile.
- **PUT /students/{id}**: Update the profile, marks, or fees status of a student.
- **DELETE /students/{id}**: Delete a student profile.

## Technologies Used

- **Spring Boot**: For building the REST API.
- **Spring Web**: For handling web requests.
- **SpringDoc OpenAPI UI**: For API documentation and testing.
- **Hibernate Validator**: For input validation.

## Getting Started

### Prerequisites

- JDK 21 or later
- Maven

### Clone the Repository

```bash
git clone <repository-url>
cd student-management-api


