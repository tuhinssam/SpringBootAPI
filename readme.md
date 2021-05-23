This is a project developed in SpringBoot to explore API development using SpringBoot
Project contains following REST methods
- GET 
- POST
- PUT
- DELETE
- API versioning

How to run:
1. "clean" the maven project
2. "install" the maven project
3. Get the generated project_name.jar file
4. run from terminal using java -jar project_name.jar
5. explore the APIs from postman or any other tool

GET method:
-endpoint: 
/api/v1/students
api/v1/students/student/{studentId}

POST method:
- endpoint:
/api/v1/students
- body:
{
        "age": 32,
        "firstName": "Tuhin",
        "lastName": "Samanta",
        "course": "SpringBoot"
}

PUT method:
- endpoint:
/api/v1/students/{studentId}
- body:
{   
        "id": {studentId}
        "age": 32,
        "firstName": "Tuhin",
        "lastName": "Samanta",
        "course": "SpringBoot"
}

DELETE method:
- endpoint:
/api/v1/students/{studentId}
