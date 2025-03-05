// Deck.java
// Represents a deck of 52 playing cards
import java.util.*;

class Deck {
    private ArrayList<Card> deck; // ArrayList to store the deck of cards

    // Constructor automatically creates the deck
    public Deck() {
        this.deck = new ArrayList<>();
        createDeck(); // Call createDeck() during object creation
    }

    // Method to create a standard deck of 52 cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // Method to print all cards in the deck
    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // Method to print a specific card based on its index
    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println(deck.get(index));
        } else {
            System.out.println("Invalid card index!");
        }
    }

    // Method to find and print all cards of the same suit
    public void sameCard(String suit) {
        for (Card card : deck) {
            if (card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println(card);
            }
        }
    }

    // Method to find and print all cards with the same rank
    public void compareCard(String rank) {
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank)) {
                System.out.println(card);
            }
        }
    }

    // Method to search for a specific card by rank and suit
    public void findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println("Card found: " + card);
                return;
            }
        }
        System.out.println("Card not found!");
    }

    // Method to deal 5 random cards from the deck
    public void dealCard() {
        Collections.shuffle(deck);
        System.out.println("Dealing 5 random cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
    }

    // Method to shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled!");
    }
}