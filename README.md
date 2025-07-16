\# 📚 Online Book Store – Backend (Spring Boot)



This is the \*\*backend API\*\* for the Online Book Store full stack project, built using \*\*Spring Boot (Java)\*\*. It provides RESTful endpoints for managing books and interacts with a MySQL database. The backend is designed to work with a React.js frontend.



---



\## 🚀 Tech Stack



\- Java 17+

\- Spring Boot

\- Spring Data JPA

\- MySQL

\- RESTful APIs



---



\## 📌 Features



\- View all books

\- Add a new book

\- REST API integration with React frontend

\- Database operations using Spring Data JPA



---



\## 📂 Project Structure



online-bookstore-backend/

├── src/

│   └── main/

│       ├── java/

│       │   └── com/onlinebookstore/

│       │       ├── controller/

│       │       │   └── BookController.java

│       │       ├── model/

│       │       │   └── Book.java

│       │       ├── repository/

│       │       │   └── BookRepository.java

│       │       └── OnlineBookstoreApplication.java

│       └── resources/

│           └── application.properties

├── .gitignore

├── pom.xml

├── mvnw / mvnw.cmd







---



\## 📡 API Endpoints



| Method | Endpoint       | Description       |

|--------|----------------|-------------------|

| GET    | `/books`       | Get all books     |

| POST   | `/books`       | Add a new book    |

| DELETE | `/books/{id}`  | Delete a book     |



> JSON Example:

```json

{

&nbsp; "id": 1,

&nbsp;   "title": "Too Good to Be True",

&nbsp;   "author": "Prajakta",

&nbsp;   "price": 267,

&nbsp;   "category": "Rom-Com"

}





Steps:

1\. Clone the repository

2\. Open in Eclipse or IntelliJ

3\. Configure `application.properties` with your MySQL credentials

4\. Run the main class: OnlineBookstoreApplication.java





Backend will start at:

http://localhost:8080





🔗 Frontend Repo

React Frontend: Online Bookstore Frontend





👩‍💻 Author

Vaishnavi Bakka

Java Full Stack Developer | React | Spring Boot | MySQL

GitHub: vaishu003







---



\### ✅ How to Add It to Your Repo:



1\. In your backend project folder:

&nbsp;  ```bash

&nbsp;  cd E:\\demo\\demo

&nbsp;  notepad README.md





