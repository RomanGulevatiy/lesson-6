# Product Manager (lesson-6)

A simple REST application for managing products. You can create, view, update and delete products.

---

## Tech. Stack

- Java 21+
- Spring Boot 3.5
- Spring Data JPA
- Spring Web
- PostgreSQL
- Validation
- Lombok
- Maven

---

## API Endpoints
 
### Base URL: `/api/products`
 
| Method   | URL                  | What it does           | Response status                    |
|----------|----------------------|------------------------|------------------------------------|
| `POST`   | `/api/products`      | Create a new product   | `201 Created`                      |
| `GET`    | `/api/products`      | Get all products       | `200 OK`                           |
| `GET`    | `/api/products/{id}` | Get one product by ID  | `200 OK` / `404 Not Found`         |
| `PUT`    | `/api/products/{id}` | Update a product by ID | `200 OK` / `404 Not Found`         |
| `DELETE` | `/api/products/{id}` | Delete a product by ID | `204 No Content` / `404 Not Found` |

---
