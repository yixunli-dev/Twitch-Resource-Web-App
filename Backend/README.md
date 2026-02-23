# Backend Service (Spring Boot)

This service provides the backend for the Twitch Resource Web App. It handles user authentication, data persistence, and integration with the Twitch API.

---

## Responsibilities

- User authentication and authorization
- RESTful API endpoints
- Business logic processing
- Database interaction (MySQL via JPA/Hibernate)
- Integration with Twitch external API

---

## Tech Stack

- Java
- Spring Boot
- Spring Security
- Hibernate / JPA
- MySQL

---

## Project Structure

controller/ → REST API endpoints
service/ → business logic
repository/ → database access layer
model/ → entity and DTO definitions
external/ → Twitch API integration


---

## API Endpoints (Examples)

POST /login
POST /register
GET /items
POST /favorite
DELETE /favorite
GET /recommendation


---

## How to Run

./gradlew bootRun


---

## Database

- Uses MySQL for persistence
- ORM handled via Hibernate / JPA
- Schema initialized via SQL scripts

---

## Key Design Decisions

- Layered architecture to separate concerns
- Stateless REST APIs for scalability
- JPA to simplify database operations
- Service layer abstraction for maintainability

---

## Future Improvements

- Add Redis caching layer
- Improve recommendation algorithm
- Add rate limiting for external API calls
- Introduce CI/CD pipeline
