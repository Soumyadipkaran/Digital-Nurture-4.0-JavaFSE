# Creating Microservices for Account and Loan

```
Creating_Microservices_for_account_and_loan/
│
├── Code
│   ├── account (service)
│   └── loan (service)
│
├── Output

```

### I created two different Spring Boot services:
- Account Service (on port 8080)
- Loan Service (on port 8081)

### Each service has its own route:
- /accounts/{number} ...returns dummy account response
- /loans/{number} ...returns dummy loan response

#### As per the hands-on, I didn’t use the "/{number}" from the URL just a Dummy response
#### Both services return static responses using Map (later updated to LinkedHashMap to maintain key order). No backend is connected.