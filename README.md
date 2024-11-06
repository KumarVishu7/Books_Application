📚 Online Bookstore API
An API built with Spring Boot and Java that provides backend functionality for managing an online bookstore. This project includes essential operations like managing books, handling shopping carts, and processing orders.

🚀 Features
Book Management: Add, update, view, and delete books, along with stock tracking.
Shopping Cart: Users can add or remove books from their cart.
Order Processing: Place orders, update order status, and track order details.
🛠 Tech Stack
Java
Spring Boot
JPA (Java Persistence API) with Hibernate
MySQL for data storage
Lombok for reducing boilerplate code
Maven for dependency management
📁 Project Structure
The project is organized into the following packages:

model: Entity classes representing Book, Cart, and Order.
repository: Repositories for interacting with the database.
service: Business logic for managing books, carts, and orders.
controller: REST API endpoints for accessing the bookstore functionalities.
📄 Endpoints
Book Management
GET /books: Fetch all books
POST /books: Add a new book
PUT /books/{id}: Update book details
DELETE /books/{id}: Delete a book by ID
Cart Management
POST /cart/add: Add a book to the cart
POST /cart/remove: Remove a book from the cart
Order Management
POST /orders: Place an order
PUT /orders/{id}: Update order status
