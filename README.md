# 🛒 Ecommerce Item REST API

A simple Spring Boot RESTful API for managing ecommerce items.  
This project demonstrates REST API development using in-memory storage with proper validation and global exception handling.

---

## 🚀 Tech Stack

- Java 21
- Spring Boot 3
- Maven
- Lombok
- Jakarta Bean Validation
- In-memory storage using ArrayList

---

## 📂 Project Architecture

Controller → Service → Repository

- **Controller**: Handles HTTP requests
- **Service**: Business logic layer
- **Repository**: Manages in-memory data storage

---

## ▶️ How to Run the Application Locally

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/NiviJais/ecommerce-item-api.git
cd ecommerce-item-api
2️⃣ Build the Project
mvn clean install
3️⃣ Run the Application
mvn spring-boot:run
OR

java -jar target/ecommerce-item-api-0.0.1-SNAPSHOT.jar
4️⃣ Application URL
http://localhost:8080
📌 API Endpoints
🔹 Add Item
POST /api/items

Request Body
{
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000,
  "quantity": 5
}
Success Response
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000,
  "quantity": 5
}
Validation Rules
Name cannot be blank

Price must be greater than 0

Quantity cannot be negative

🔹 Get Item By ID
GET /api/items/{id}

Example:

GET /api/items/1
Success Response
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000,
  "quantity": 5
}
If item is not found:
Item not found with id: 5

Important Implementation Details
Data is stored in-memory using ArrayList.

Data will be lost when the application restarts.

IDs are auto-generated starting from 1.

Validation is implemented using @Valid, @NotBlank, @NotNull, and @Min.

Global exception handling is implemented using @RestControllerAdvice.
