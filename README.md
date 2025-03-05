# **Card Deck Management System**

This Java project simulates a deck of 52 playing cards with various operations such as printing the deck, shuffling, dealing random cards, and finding specific cards based on rank and suit. The program follows **Object-Oriented Programming (OOP)** principles and uses **ArrayList** for managing the deck.

---

## **Project Structure**
The project consists of the following Java files:

### **1. `Card.java` (Represents a single playing card)**
- Defines a **Card** class with `rank` and `suit` attributes.
- Includes a constructor to initialize card values.
- Implements `toString()` to display card details.

### **2. `Deck.java` (Manages the deck and its operations)**
- Implements an **ArrayList** to store the deck of 52 cards.
- Provides the following methods:
    - `createDeck()` → Creates a full deck of 52 cards.
    - `printDeck()` → Displays all the cards in the deck.
    - `printCard(int index)` → Prints a specific card by index.
    - `sameCard(String suit)` → Finds and prints all cards of the same suit.
    - `compareCard(String rank)` → Finds and prints all cards of the same rank.
    - `findCard(String rank, String suit)` → Searches for a specific card.
    - `dealCard()` → Deals 5 random cards from the deck.
    - `shuffleDeck()` → Randomizes the deck using `Collections.shuffle()`.

### **3. `Main.java` (Menu-driven user interface)**
- Displays an interactive menu for users.
- Allows users to perform deck operations using a **switch-case** statement.
- Uses `Scanner` for user input.
- Includes clear prompts and separators (`*********`) for better readability.

---

## **How to Run the Program**
1. Clone the repository or download the files.
2. Open the project in an **IDE** (e.g., IntelliJ IDEA, Eclipse, or VS Code).
3. Compile and run `Main.java`.
4. Follow the on-screen menu instructions to interact with the deck.

---

## **Features**
✔ **Object-Oriented Design** – Uses encapsulation, classes, and objects.  
✔ **Menu-Driven Interface** – Provides an interactive experience.  
✔ **Efficient Data Storage** – Uses an **ArrayList** for easy manipulation.  
✔ **Randomization** – Implements shuffling and random card dealing.  
✔ **Error Handling** – Handles invalid inputs (e.g., incorrect index or non-existent card).

---

## **Example Output**
```
********* Creating Deck **********
Deck has been created successfully!

********* Card Deck Menu **********
1. Print Deck
2. Print a Card
3. Find Same Suit Cards
4. Find Same Rank Cards
5. Find a Specific Card
6. Deal 5 Random Cards
7. Shuffle Deck
8. Exit
Enter your choice: 6

********* Dealing 5 Random Cards **********
5 of Hearts
K of Spades
2 of Diamonds
J of Clubs
A of Hearts
```

---

## **Contributing**
Contributions are welcome! Feel free to fork the repository, make changes, and submit a pull request.

---

## **License**
This project is open-source under the **MIT License**.

---

**Happy Coding! 🚀**

