# 5. JWT-handson
## Create authentication service that returns JWT
### Basic Spring Boot project that shows how to create a simple authentication system that returns a JWT token.


- Giving username(user) and password(pwd) using curl or Postman (-u user:pwd)
- It checks the credentials (default ones from application.properties)
- If correct, it returns a JWT token in the response

```
curl -s -u user:pwd http://localhost:8090/authenticate
 ```

### Output/Respone
```
{"token":"<...jwt_token...>"}
```