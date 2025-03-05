// Main.java

// Name: Amitkumar Racha
// PRN:  24070126501
// Batch: A1 (2023-2027)


// Entry point of the program with menu-driven functionality
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();// Create a deck object

        System.out.println("\n********* Creating Deck **********");
        deck.createDeck();
        System.out.println("Deck has been created successfully!\n");

        while (true) {
            // Display menu options
            System.out.println("\n********* Card Deck Menu **********");
            System.out.println("1. Print Deck");
            System.out.println("2. Print a Card");
            System.out.println("3. Find Same Suit Cards");
            System.out.println("4. Find Same Rank Cards");
            System.out.println("5. Find a Specific Card");
            System.out.println("6. Deal 5 Random Cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("\n********* Printing Deck **********");
                    deck.printDeck();
                    break;
                case 2:
                    System.out.print("Enter card index (0-51): ");
                    int index = scanner.nextInt();
                    System.out.println("\n********* Printing Selected Card **********");
                    deck.printCard(index);
                    break;
                case 3:
                    System.out.print("Enter suit (Clubs, Spades, Diamonds, Hearts): ");
                    String suit = scanner.nextLine();
                    System.out.println("\n********* Finding Cards with Same Suit **********");
                    deck.sameCard(suit);
                    break;
                case 4:
                    System.out.print("Enter rank (2-10, J, Q, K, A): ");
                    String rank = scanner.nextLine();
                    System.out.println("\n********* Finding Cards with Same Rank **********");
                    deck.compareCard(rank);
                    break;
                case 5:
                    System.out.print("Enter rank (2-10, J, Q, K, A): ");
                    String findRank = scanner.nextLine();
                    System.out.print("Enter suit (Clubs, Spades, Diamonds, Hearts): ");
                    String findSuit = scanner.nextLine();
                    System.out.println("\n********* Searching for the Card **********");
                    deck.findCard(findRank, findSuit);
                    break;
                case 6:
                    System.out.println("\n********* Dealing 5 Random Cards **********");
                    deck.dealCard();
                    break;
                case 7:
                    System.out.println("\n********* Shuffling Deck **********");
                    deck.shuffleDeck();
                    System.out.println("Deck shuffled successfully!");
                    break;
                case 8:
                    System.out.println("\n********* Exiting Program **********");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
