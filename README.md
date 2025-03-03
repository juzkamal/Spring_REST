# Spring Boot CRUD Operations

This is a simple Spring Boot application that demonstrates basic CRUD (Create, Read, Update, Delete) operations. The application provides endpoints to manage a resource (e.g., items). This project is built using Spring Boot and can be easily extended for more complex use cases.

## Features

- **GET** `/cloudVendor/{vendorId}` - Fetches an item by its ID.
- **POST** `/cloudVendor/vendor` - Creates a new item.
- **PUT** `/cloudVendor/{vendorId}` - Updates an existing item.
- **DELETE** `/cloudVendor/{Id}` - Deletes an item by ID.

## Technologies Used

- **Spring Boot** - For creating RESTful applications.
- **Spring Web** - For building RESTful web services.
- **Maven** - For build and dependency management.

## API Endpoints

### 1. `GET /api/items`
Fetches all items.

**Request:**
```http
GET /cloudvendor/{vendorId}
```

**Response:**
```json
[
    {
        "vendorId": 1,
        "vendorName": "Item 1",
        "vendorAddress": "Description of item 1",
        "vendorPhoneNumber": 7878917671,
    }
]
```

****
