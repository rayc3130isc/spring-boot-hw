# HW 5 - Campus Taskboard API

This project is a Spring Boot API for managing tasks, and it allows users to create, read, update, and delete tasks with validation.

## How to Run Application
1. Clone the repository
2. Navigate to the project folder
3. Run: mvnw spring-boot:run
4. Open: http://localhost:8080

## Endpoints
- GET /api/tasks --> Get all tasks  
- - GET /api/tasks/{id} --> Get task by ID  
- POST /api/tasks --> Create a task  
- PUT /api/tasks/{id} --> Update a task  
- DELETE /api/tasks/{id} --> Delete a task

## Technologies Used
- Java 21
- Spring Boot
- Lombok
- Postman