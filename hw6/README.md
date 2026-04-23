# HW 6 - Adding Database Persistence with Spring Data JPA

This project demonstrates using Spring Data JPA to showcase database operations, and how to use them to manage tasks using a database rather than in memory.

## How to Run Application
1. Clone the repository
2. Navigate to the project folder
3. Run: mvnw spring-boot:run
4. Open: http://localhost:8080 and http://localhost:8080/api/tasks
5. Open: http://localhost:8080/h2-console
6. Log into H2 with `jdbc:h2:mem:taskboarddb` as the JDBC URL and `sa` as the Username, and hit Connect.
- Make sure to leave password blank

## Endpoints
- `GET /api/tasks` --> Get all tasks  
- - `GET /api/tasks/{id}` --> Get task by ID  
- `POST /api/tasks` --> Create a task  
- `PUT /api/tasks/{id}` --> Update a task  
- `DELETE /api/tasks/{id}` --> Delete a task
- `GET /api/tasks/completed` --> Get completed tasks
- `GET /api/tasks/incomplete` --> Get incomplete tasks
- `GET /api/tasks/priority/{priority}` --> Filter by priority
- `GET /api/tasks/search?keyword={word}` --> Search tasks with the keyword in them (case-sensitive)
- `GET /api/tasks/paginated?page=0&size=5&sortBy=title` --> Pagination

## H2 Database
An H2 database is used, which runs with SQL commands.

Example:
```sql
SHOW TABLES;
SHOW COLUMNS FROM TASKS;
SELECT * FROM TASKS;
```

## Technologies Used
- Java 21
- Spring Boot
- Spring Data JPA
- Lombok
- H2 Database
- Postman

## Video Submission Link
> https://www.youtube.com/watch?v=cIUuWunn3CU