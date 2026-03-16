# Employee Management System - Backend

This is a REST API backend for the Employee Management System developed using **Spring Boot** and **MySQL**.
The API provides CRUD operations to manage employee records.

## 🚀 Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* REST API

## 📌 Features

* Add a new employee
* View all employees
* Get employee by ID
* Update employee details
* Delete employee

## 📂 Project Structure

```
controller  - REST API endpoints  
service     - Business logic  
repository  - Database operations  
entity      - Database model  
dto         - Data transfer objects  
mapper      - DTO mapping  
exception   - Global exception handling
```

## 🔗 API Endpoints

| Method | Endpoint            | Description        |
| ------ | ------------------- | ------------------ |
| POST   | /api/employees      | Create employee    |
| GET    | /api/employees      | Get all employees  |
| GET    | /api/employees/{id} | Get employee by ID |
| PUT    | /api/employees/{id} | Update employee    |
| DELETE | /api/employees/{id} | Delete employee    |

## 🛠️ How to Run

1. Clone the repository
2. Configure MySQL database in `application.properties`
3. Run the Spring Boot application
4. Test APIs using Postman

## 📌 Author

Jayalakshmi

