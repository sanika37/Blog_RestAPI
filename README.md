# Blog REST API - Spring Boot Application

## Overview
The **Blog REST API** is a Spring Boot application that provides a powerful backend service for a blogging platform. It enables users to create, read, update, and delete blog posts and comments while incorporating robust authentication and authorization mechanisms. This project serves as a foundational backend for any blog-based application, facilitating seamless user interaction with blog content. This project is implemented using **Spring Boot Maven Framework** within **Intellij Idea** and testing was implemented using **Postman and MYSQL**

## Technologies & Tools Used
- **Java 21** – The primary programming language.
- **Spring Boot** – Simplifies Java application development with pre-configured settings.
- **Spring Data JPA** – Enables efficient database interactions using JPA.
- **MySQL** – The relational database used for storing user, post, and comment data.
- **Spring Security** – Ensures secure authentication and authorization.
- **Maven** – Manages project dependencies and builds the application.
- **Lombok** – Reduces boilerplate code with auto-generated getter, setter, and other methods.

## Project Dependencies
The following dependencies are included in the `pom.xml` file:
- `spring-boot-starter-web` – Supports building RESTful APIs.
- `spring-boot-starter-data-jpa` – Enables database operations.
- `spring-boot-starter-validation` – Facilitates request validation.
- `mysql-connector-j` – Connects the application to MySQL.
- `spring-boot-starter-security` – Provides authentication and authorization features.
- `spring-boot-starter-test` – Supports application testing.
- `lombok` – Reduces repetitive code.

## Features
### **User Authentication & Management**
- User registration with unique username and email verification.
- Secure password hashing using **BCrypt**.
- Login using a username or email with session management.

### **Post Management**
- Create, retrieve, update, and delete blog posts.
- Fetch all posts or a specific post by ID.
- Each post contains a title, content, and description.

### **Comment Management**
- Add comments to blog posts.
- Retrieve all comments for a post or a specific comment.
- Edit or delete comments as needed.

### **Error Handling**
- Custom exceptions for handling resource-not-found scenarios.
- Consistent error messages for better debugging and user experience.

## API Endpoints & Usage
### **Authentication**
#### **User Registration**
**Method:** `POST`
**URL:** `http://localhost:8080/api/auth/register`
**Request Body (JSON):**
```json
{
  "name": "John Doe",
  "username": "johndoe",
  "email": "john@example.com",
  "password": "password123"
}
```

#### **User Login**
**Method:** `POST`
**URL:** `http://localhost:8080/api/auth/login`
**Request Body (JSON):**
```json
{
  "usernameOrEmail": "johndoe",
  "password": "password123"
}
```

### **Post Operations**
#### **Create a Post**
**Method:** `POST`
**URL:** `http://localhost:8080/api/posts`
**Request Body (JSON):**
```json
{
  "title": "My First Post",
  "content": "This is the content of my first post.",
  "description": "A brief description of my first post."
}
```

#### **Retrieve All Posts**
**Method:** `GET`
**URL:** `http://localhost:8080/api/posts`

#### **Retrieve a Post by ID**
**Method:** `GET`
**URL:** `http://localhost:8080/api/posts/{id}`

#### **Update a Post**
**Method:** `PUT`
**URL:** `http://localhost:8080/api/posts/{id}`
**Request Body (JSON):**
```json
{
  "title": "Updated Title",
  "content": "Updated content.",
  "description": "Updated description."
}
```

#### **Delete a Post**
**Method:** `DELETE`
**URL:** `http://localhost:8080/api/posts/{id}`

### **Comment Operations**
#### **Add a Comment**
**Method:** `POST`
**URL:** `http://localhost:8080/api/posts/{postId}/comments`
**Request Body (JSON):**
```json
{
  "name": "Jane Doe",
  "email": "jane@example.com",
  "body": "This is a comment."
}
```

#### **Retrieve Comments for a Post**
**Method:** `GET`
**URL:** `http://localhost:8080/api/posts/{postId}/comments`

#### **Update a Comment**
**Method:** `PUT`
**URL:** `http://localhost:8080/api/posts/{postId}/comments/{commentId}`
**Request Body (JSON):**
```json
{
  "name": "Updated Name",
  "email": "updated@example.com",
  "body": "Updated comment."
}
```

#### **Delete a Comment**
**Method:** `DELETE`
**URL:** `http://localhost:8080/api/posts/{postId}/comments/{commentId}`

## Testing the API with Postman
To test the API endpoints, follow these steps:
1. **Download and install Postman** from the [official site](https://www.postman.com/).
2. Set the **Base URL**: `http://localhost:8080/api`
3. Use the provided endpoint details to send requests and verify responses.

## Conclusion
This **Blog REST API** project offers a complete backend solution for a blogging platform. With well-structured user authentication, post and comment management, and robust error handling, it provides a strong foundation for building scalable and secure blog applications. Contributions and enhancements are always welcome!

---
### 📌 Feel free to fork, contribute, and improve this project!
🚀 Happy Coding! 🎯

