# The Wall

The Wall is a project designed to provide a platform for users to create walls and share messages on those walls. It offers a RESTful API for managing walls and messages.

## Features

- **Create Walls**: Users can create walls where they can post messages.
- **Post Messages**: Users can post messages on walls.
- **Update Messages**: Users can update their messages on walls.
- **Delete Messages**: Users can delete their messages from walls.
- **View Walls and Messages**: Users can view existing walls and messages.

## Technologies Used

- **Java**: The project is developed using Java programming language.
- **Spring Boot**: Spring Boot is used for building the RESTful API.
- **Lombok**: Lombok is used to reduce boilerplate code.
- **Spring Data JPA**: Spring Data JPA is used for data access.
- **Maven**: Maven is used for project management and dependency resolution.

## Project Structure

The project is structured into two main packages:

1. **Controller Package**: Contains REST API controllers for managing walls and messages.
2. **Service Package**: Contains service classes implementing business logic for managing walls and messages.

## API Endpoints

### Wall API

- **GET /api/v1/walls**: Get all walls.
- **POST /api/v1/walls**: Create a new wall.
- **GET /api/v1/walls/{id}**: Get a specific wall by ID.
- **DELETE /api/v1/walls/{id}**: Delete a wall by ID.
- **PUT /api/v1/walls/{id}**: Update a wall by ID.

### Wall Message API

- **GET /api/v1/walls/{wallId}/messages**: Get all messages for a specific wall.
- **POST /api/v1/walls/{wallId}/messages**: Post a message on a wall.
- **GET /api/v1/walls/{wallId}/messages/{messageId}**: Get a specific message by ID on a wall.
- **DELETE /api/v1/walls/{wallId}/messages/{messageId}**: Delete a message by ID on a wall.
- **PUT /api/v1/walls/{wallId}/messages/{messageId}**: Update a message by ID on a wall.

## Getting Started

To get started with the project, follow these steps:

1. Clone the repository: `git clone https://github.com/your_username/your_repository.git](https://github.com/ValeriiLindenPy/thewall.git`
2. Navigate to the project directory: `cd thewall`
3. Build the project using Maven: `mvn clean install`
4. Run the project: `mvn spring-boot:run`
5. Access the API endpoints using a tool like Postman or through a web browser.


