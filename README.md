# 📸 Social Media API (Spring Boot + MySQL)

This is a simple **RESTful API** for managing social media posts, built using **Spring Boot** and **MySQL**.

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **MySQL Database**
- **Lombok**
- **Postman (for testing)**

---

## 🌐 API Base URL

http://localhost:8080/api/posts

yaml
Copy code

---

## 📬 API Endpoints

### 🔹 Create a Post

**POST** `/api/posts`

Create a new post.

**Request Body:**


{
  "username": "john_doe",
  "content": "This is a new post",
  "imageUrl": "http://example.com/image.jpg"
}
🔹 Get All Posts
GET /api/posts
Returns all posts.

🔹 Get Post by ID
GET /api/posts/{id}
Returns a specific post by ID.

🔹 Update Post (Full)
PUT /api/posts/{id}

json
Copy code
{
  "username": "john_doe",
  "content": "Updated content",
  "imageUrl": "http://example.com/updated.jpg",
  "edited": true
}
🔹 Update Post Content Only
PATCH /api/posts/{id}

Request body (as plain text):

arduino
Copy code
"New content only"
🔹 Delete Post
DELETE /api/posts/{id}
Deletes a post by ID.

📦 How to Run
Clone the repo

Configure application.properties for your MySQL DB

Run the app using IntelliJ or terminal:

bash
Copy code
./mvnw spring-boot:run
Use Postman or any REST client to test the endpoints

✅ Example MySQL Configuration
properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/socialmedia_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
