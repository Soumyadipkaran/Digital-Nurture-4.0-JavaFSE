# spring-rest-handson 2

## #3 Hello World RESTful Web Service
- Method: GET
- URL: http://localhost:8083/hello
- Return: "Hello World!!"

## #4 REST - Country Web Service
- Method: GET
- URL: http://localhost:8083/country
- Return: {
  "code": "IN",
  "name": "India"
  }

## #5 REST - Get country based on country code
- Method: GET
- URL: http://localhost:8083/countries/{code}
- Example: http://localhost:8083/countries/in
- Return: {
  "code": "IN",
  "name": "India"
  }
## REST - Get All Countries
- Method: GET
- URL: http://localhost:8083/countries
```
Return: [
  { "code": "IN", "name": "India" },
  { "code": "US", "name": "United States" },
  { "code": "JP", "name": "Japan" },
  { "code": "DE", "name": "Germany" }
]
```

