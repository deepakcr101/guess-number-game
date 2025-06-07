# 🎯 Guess The Number Game

A simple web-based game built with **Spring Boot** and **Java** where users try to guess a randomly generated number. This project demonstrates basic Spring Boot REST API features, session handling, and form interaction.

---

## 🚀 Features

- 🎲 Random number generated per user session
- 📬 User submits guesses via a simple web form
- ✅ Feedback on each guess: Too High, Too Low, or Correct
- 🔁 Game resets upon correct guess
- 🧠 Stateless frontend, session-based backend logic

---

## 🛠️ Tech Stack

- **Backend**: Java 17, Spring Boot 3.5.0
- **Frontend**: HTML, CSS, JavaScript
- **Build Tool**: Maven

---

## 📂 Project Structure

guess_number_game/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/example/guess_number_game/
│ │ │ ├── controller/
│ │ │ └── GuessNumberGameApplication.java
│ │ └── resources/
│ │ ├── static/
│ │ │ ├── index.html
│ │ │ └── style.css
│ │ └── application.properties
├── pom.xml
└── README.md
---
## ▶️ Run Locally

### Prerequisites

- Java 17+
- Maven

### Commands

git clone https://github.com/your-username/guess-number-game.git
cd guess-number-game
./mvnw spring-boot:run
App will run at: http://localhost:8080

### 🧪 Sample Usage
Open http://localhost:8080

Enter a number between 1 and 100

Get feedback like:

"Too High"

"Too Low"

"Correct! You guessed it in X tries."

---

## 📸 Screenshots

![Game Start](src/main/resources/images/Screenshot%20from%202025-06-08%2001-52-17.png)
*Game start screen*

![Guess Correct](src/main/resources/images/Screenshot%20from%202025-06-08%2001-52-44.png)
*Feedback after a guess*

---

## 📬 Contact
Developer: Deepak Kumar
Feel free to connect or give feedback!

## 📄 License
This project is open-source and free to use under the MIT License.

Let me know if you'd like:
- A matching `LICENSE` file
- A `demo.webm` or GIF for the UI
- A badge-filled GitHub README version

Happy coding! 💻🔥
