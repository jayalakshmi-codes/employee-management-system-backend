# Employee Management System - Backend

This is a REST API backend for the Employee Management System developed using **Spring Boot** and **MySQL**.
The API provides CRUD operations to manage employee records.

## 🌐 Base URL

👉 https://employee-management-system-backend-production-b85a.up.railway.app/api/employees

---

## 🚀 Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* REST API

## ✨ Features

- 📋 Get all employees  
- 🔍 Get employee by ID  
- ➕ Add new employee  
- ✏️ Update employee details  
- ❌ Delete employee  
- 🛡️ Exception handling  
- ✅ Input validation  
- 🔐 Basic security implementation  
- 🔗 Integrated with frontend application  

---

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

---

## ⚙️ Installation & Setup

### 1. Clone the repository
```bash
git clone <your-backend-repo-url>
```

### 2. Navigate to project folder
```bash
cd employee-management-system-backend
```

### 3. Configure database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 4. Run the application
```bash
mvn spring-boot:run
```

---

## 🗄️ Database

- MySQL database is used for storing employee data  
- Hosted on Railway (cloud database)  

---

## 🚀 Deployment

- Backend deployed on Railway  
- Public API доступ via live URL  
- Integrated with frontend deployed on Vercel  

---

## 👩‍💻 Author

**Jayalakshmi S**  
🔗 GitHub: https://github.com/jayalakshmi-codes

