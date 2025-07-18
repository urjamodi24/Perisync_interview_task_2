You're almost there! Below is a **cleaned-up, well-formatted single `README.md` file** for your project. I've removed unnecessary artifacts like `yaml`, `arduino`, and `Copy code`, and formatted the sections properly:

---

```markdown
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

```

[http://localhost:8080/api/posts](http://localhost:8080/api/posts)

````

---

## 📬 API Endpoints

### 🔹 Create a Post

**POST** `/api/posts`  
Creates a new post.

**Request Body:**

```json
{
  "username": "john_doe",
  "content": "This is a new post",
  "imageUrl": "http://example.com/image.jpg"
}
````

---

### 🔹 Get All Posts

**GET** `/api/posts`
Returns all posts.

---

### 🔹 Get Post by ID

**GET** `/api/posts/{id}`
Returns a specific post by ID.

---

### 🔹 Update Post (Full)

**PUT** `/api/posts/{id}`
Updates the entire post.

**Request Body:**

```json
{
  "username": "john_doe",
  "content": "Updated content",
  "imageUrl": "http://example.com/updated.jpg",
  "edited": true
}
```

---

### 🔹 Update Post Content Only

**PATCH** `/api/posts/{id}`
Updates only the content of a post.

**Request Body (as plain text):**

```
"New content only"
```

---

### 🔹 Delete Post

**DELETE** `/api/posts/{id}`
Deletes a post by ID.

---

## 📦 How to Run

1. **Clone the repo**

```
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```

2. **Configure `application.properties`** for your MySQL DB

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/socialmedia_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

3. **Run the app** using IntelliJ or terminal:

```
./mvnw spring-boot:run
```

4. Use **Postman** or any REST client to test the endpoints.

---


