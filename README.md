# 📚 Online Bookstore Backend

A simple Spring Boot application to manage books for an online bookstore.

---

## 📌 Sample Book JSON

```json
{
  "id": 1,
  "title": "Too Good to Be True",
  "author": "Prajakta",
  "price": 267,
  "category": "Rom-Com"
}



🚀 How to Run the Project
Prerequisites
Java 17+

MySQL

Maven

Any IDE (Eclipse or IntelliJ)

---

🛠️ Steps
1.Clone the repository
    git clone https://github.com/vaishu003/online-bookstore-backend.git

2.Open the project in your IDE (Eclipse or IntelliJ)

3.Configure the database
    Go to src/main/resources/application.properties
    Add your MySQL username, password, and DB name

4.Run the project
    Run the file DemoApplication.java

---

📂 Project Structure

src/
 └── main/
     ├── java/
     │   └── com.onlinebookstore.demo/
     │       ├── entity/
     │       │   └── Book.java
     │       ├── repository/
     │       │   └── BookRepository.java
     │       ├── controller/
     │       │   └── BookController.java
     │       └── DemoApplication.java
     └── resources/
         └── application.properties


---


📡 API Endpoints


| Method | Endpoint | Description    |

| GET    | `/books` | Get all books  |
| POST   | `/books` | Add a new book |



