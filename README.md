# 🎮 Tic-Tac-Toe (Java Console Game)

A simple, text-based **Tic-Tac-Toe** game built in **Java**, where two human players — or one human against the computer 🤖 — take turns to mark spaces on the board.  
The game checks for a win, draw, and even allows players to continue playing multiple rounds while keeping score!

---

## 🧩 Features

✅ Play **Human vs Human** or **Human vs Computer**  
✅ Choose your own **player names**  
✅ Automatically uses a **3x3 board (default)**  
✅ Smart computer player that:
   - Tries to **win if possible**
   - **Blocks** your winning move if it can  
   - Chooses a **random** move if no better option  
✅ Keeps track of **player scores**  
✅ After each round, asks if you want to **play again or quit**  
✅ Full **input validation** to avoid crashes  
✅ Clean, **object-oriented design** using multiple classes  

---

## 🧱 Classes Overview

| Class Name | Description |
|-------------|-------------|
| **Main** | Entry point of the program. Handles setup, player creation, and starts the game. |
| **Game** | Controls the main game loop, turn order, score tracking, and replay option. |
| **Board** | Manages the game grid, placing symbols, checking wins, and printing the board. |
| **Player** | Abstract class defining a player’s name, symbol, and move method. |
| **HumanPlayer** | Handles user input from the terminal (row and column moves). |
| **ComPlayer** | Smart computer player that blocks or wins strategically. |
| **Move** | Represents a single move with `row` and `column` coordinates. |

---

## 🖥️ How to Run

### 1️⃣ Clone the project
```bash
git clone https://github.com/YOUR-USERNAME/tic-tac-toe-java.git
cd tic-tac-toe-java

## Gameplay Example
🎮 Welcome to Tic-Tac-Toe!
Default board size is 3x3
Enter Player 1 name: Alice
Play against computer? (y/n): y

Alice's turn (X)
Enter row and column (e.g. 1 1): 1 1

Computer (O) blocks at: 1 2

🎉 Alice wins!
🏆 Score → Alice: 1 | Computer: 0
Do you want to play again? (y/n): y
🔄 Starting a new round...
```

## ⚙️ Project Structure
```bash
tic-tac-toe-java/
│
├── Board.java         # Handles board display and win checking
├── Move.java          # Stores move positions
├── Player.java        # Abstract player base class
├── HumanPlayer.java   # Human player logic
├── ComPlayer.java     # Smart computer player
├── Game.java          # Game loop and replay logic
└── Main.java          # Entry point (setup and start)
```

## 🧩 Programming Concepts Demonstrated

This project shows understanding of:

✅ Object-Oriented Programming (classes, inheritance, abstraction)

✅ Loops & conditionals (for, while, if-else)

✅ User input handling using Scanner

✅ Error handling and validation

✅ Code structure & modular design

✅ Continuous Git version control (commits, pushes, branches)


## 🌟 Future Improvements (Ideas)

Add difficulty levels for the computer (Easy / Hard)

Add colored output in terminal for better visuals

Add custom board sizes (4x4, 5x5)

## 👨‍💻 Author

### Your Name Here : Ibrahim Jasim Alsalih 
📚 Student Project — Object-Oriented Programming in Java
🕹️ “Learning Java one game at a time!”



