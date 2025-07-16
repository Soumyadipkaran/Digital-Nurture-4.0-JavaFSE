# Create Eureka Discovery Server and register microservices

```
EurekaDiscoveryServer/
│
├── Code
│   ├── account (service)
│   ├── eureka-discovery-server
│   └── loan (service)
│
├── Output

```

### I created two different Spring Boot services:
- Account Service (on port 8080)
- Loan Service (on port 8081)

### Create a Eureka Discovery Server
- created on port 8761
- Both services are registered to Eureka (ACCOUNT-SERVICE & LOAN-SERVICE)
- Eureka dashboard shows both services as UP and registered

### URLs 
- Eureka Dashboard:	http://localhost:8761
- Account Service:	http://localhost:8080/accounts/{number}
- Loan Service:	http://localhost:8081/loans/{number}

