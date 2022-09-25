# The School Management Project
This repository contains my learning steps related to Spring Boot.

### Used Technologies
- Java Spring Boot
- PostgreSQL
### Functionalities in project
- Database seeds
- API Layer-Business Layer-Data Access Layer
- CRUD Operations
- You can send requests to your local application with curl  
  - Gets Students: curl http[]()://localhost:8080/api/v1/students
  - Posts Student: curl -d "{\"name\":\"student name\",\"email\":\"studentmail@[]()gmail.com\",\"dob\":\"1995-12-17\"}" -H "Content-Type: application/json" -X POST http[]()://localhost:8080/api/v1/students
  - Deletes Student: curl -X DELETE http[]()://localhost:8080/api/v1/students/1
  - Updates Students: curl -X PUT "http[]()://localhost:8080/api/v1/students/3?name=changed%20student%20name&email=changedstudentmail@[]()gmail.com"
