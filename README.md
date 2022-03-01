# API Spec

## Authentication

All API must use this authentication

Request :
- Header : 
  - X-Api-Key : "Your secret api key"
  

## Create product

Request :
- Method : POST
- Endpoint : `/api/products`
- Header :
  - Content-Type: application/json
  - Accept: application/json 
- Body :

```json
{
    "id" : "string, unique",
    "name" : "string",
    "price" : "long",
    "quantity" : "integer"
}
```

Response :

```json
{
  "code" : "number",
  "status" : "string",
  "data" : {
    "id" : "string, unique",
    "name" : "string",
    "price" : "long",
    "quantity" : "integer",
    "createdAt" : "date",
    "updatedAt" : "date"
  }
}
```

## Get Product

Request : 
- Method : POST
- Endpoint : `/api/products/{id_poduct}`
- Header : 
    - Accept: application/json

Response : 

```json
{
  "code" : "number",
  "status" : "string",
  "data" : {
    "id" : "string, unique",
    "name" : "string",
    "price" : "long",
    "quantity" : "integer",
    "createdAt" : "date",
    "updatedAt" : "date"
  }
}
```

## Update Product

Request :
- Method : POST
- Endpoint : `/api/products/{id_poduct}`
- Header :
  - Content-Type: application/json
  - Accept: application/json
- Body :

```json
{
  "name" : "string",
  "price" : "long",
  "quantity" : "integer"
}
```

Response :

```json
{
  "code" : "number",
  "status" : "string",
  "data" : {
    "id" : "string, unique",
    "name" : "string",
    "price" : "long",
    "quantity" : "integer",
    "createdAt" : "date",
    "updatedAt" : "date"
  }
}
```

## List Product

Request :
- Method : GET
- Endpoint : `/api/products/`
- Header :
    - Accept: application/json
- Query Param : 
    - size : number,
    - page : number

Response :

```json
{
  "code" : "number",
  "status" : "string",
  "data" : [
    {
      "id" : "string, unique",
      "name" : "string",
      "price" : "long",
      "quantity" : "integer",
      "createdAt" : "date",
      "updatedAt" : "date"
    },
    {
      "id" : "string, unique",
      "name" : "string",
      "price" : "long",
      "quantity" : "integer",
      "createdAt" : "date",
      "updatedAt" : "date"
    }
  ]
}
```

## Delete Product

Request :
- Method : DELETE
- Endpoint : `/api/products/{id_poduct}`
- Header :
    - Accept: application/json

Response :

```json
{
  "code" : "number",
  "status" : "string"
}
```