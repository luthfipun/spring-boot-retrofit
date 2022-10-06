# Documentation

Spring boot project application, using request http connection feature to the another restful API and consuming in our restful API with Retrofit and Coroutines Library

## TechStack
- Spring Boot
- Retrofit
- Coroutine

## APIs

This project call http request connection from the restful API website ``https://cataas.com``


### Request
- Method : ``GET``
- Endpoint : ``/v1/cat``
- Header :
  - accept : application/json

### Response
- Body :
```json
{
  "message": "string",
  "data": {
    "id" : "string",
    "createdAt": "string",
    "tags" : ["string"],
    "url": "string"
  }
}
```