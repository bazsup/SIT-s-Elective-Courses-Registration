# SIT’s Elective Courses Registration (SIT-ECR)
The enrollment option is set to first-come-first-serve. When the course is full, it must be closed immediately.

## Document

## Requirements
- java 8
- node.js
- npm or yarn

## Setup
### User-service
1. Change directory to `User-service`
```bash
cd User-service
```
2. Install dependencies and build by using this command
```bash
mvnw clean package
```
3. run by using this command
```bash
java -jar target/User-service-0.0.1-SNAPSHOT.jar
```

### Course service
1. Change directory to `User-service`
```bash
cd User-service
```
2. Install dependencies and build by using this command
```bash
mvnw clean package
```
3. run by using this command
```bash
java -jar target/Course-service-0.0.1-SNAPSHOT.jar
``` 

start development server


## Testing
Testing in `Postman` directory
1. Change directory to `Postman`
```bash
cd Postman
```
2. Install node dependencies by using this command
```bash
yarn install
```
or
```bash
npm install
```
3. Test API using `newman` by using this command
```bash
yarn test
```
or
```bash
npm run test
```

> It can apply in automate test using CI tools

## Configuration
setting up these configuration environment before running the server
```bash
# configuration env for User-service
USER_SERVICE_PORT=8080
USER_SERVICE_DB_DRIVER=com.mysql.jdbc.Driver
USER_SERVICE_DB_HOST=jdbc:mysql://bassup.tk/cloudnative-user
USER_SERVICE_DB_USERNAME=bazsup
USER_SERVICE_DB_PASSWORD=wowthisisapassword

# configuration env for Course-service
COURSE_SERVICE_PORT=8081
COURSE_SERVICE_DB_DRIVER=com.mysql.jdbc.Driver
COURSE_SERVICE_DB_HOST=jdbc:mysql://bassup.tk/cloudnative-course
COURSE_SERVICE_DB_USERNAME=bazsup
COURSE_SERVICE_DB_PASSWORD=wowthisisapassword

# configuration env for Enrollment-service
ENROLLMENT_SERVICE_PORT=8082
ENROLLMENT_SERVICE_DB_DRIVER=com.mysql.jdbc.Driver
ENROLLMENT_SERVICE_DB_HOST=jdbc:mysql://bassup.tk/cloudnative-enrollment
ENROLLMENT_SERVICE_DB_USERNAME=bazsup
ENROLLMENT_SERVICE_DB_PASSWORD=wowthisisapassword
```

## Owner
author: Supawit Ruenruetaikul  
email: supawit.ruen@mail.kmutt.ac.th  
github: bazsup

