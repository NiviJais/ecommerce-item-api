# 🛒 Ecommerce Item REST API

A simple Spring Boot RESTful API for managing ecommerce items.
This project demonstrates REST API development using in-memory storage with proper validation and global exception handling.

---

## 🚀 Tech Stack

- Java 21
- Spring Boot 3
- Maven
- Lombok
- Bean Validation (Jakarta Validation)
- In-memory storage using ArrayList

---

## 📂 Project Architecture

This project follows layered architecture:

Controller → Service → Repository

- Controller: Handles HTTP requests
- Service: Contains business logic
- Repository: Manages in-memory data storage

---

##  How to Run the Application Locally

### 1️ Clone the repository

```bash
2️ Build the project
mvn clean install

3️ Run the application
mvn spring-boot:run

OR

java -jar target/ecommerce-item-api-0.0.1-SNAPSHOT.jar

4️ Application will start at:
http://localhost:8080

📌 API Endpoints
 1. Add Item

POST /api/items

Request Body:

{
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000,
  "quantity": 5
}


Success Response:

{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000,
  "quantity": 5
}


Validation Errors:

Name cannot be blank

Price must be greater than 0

Quantity cannot be negative

 2. Get Item By ID

GET /api/items/{id}

Example:

GET /api/items/1


Success Response:

{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000,
  "quantity": 5
}
git clone https://github.com/your-username/ecommerce-item-api.git
cd ecommerce-item-api
# ecommerce-item-api
