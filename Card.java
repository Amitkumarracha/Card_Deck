// Card.java
// Represents a single card with a rank and suit
public class Card {
    private String rank;
    private String suit;

    // Constructor to initialize the card with rank and suit
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Getter method for rank
    public String getRank() {
        return rank;
    }

    // Getter method for suit
    public String getSuit() {
        return suit;
    }

    // Overriding toString() method to display card details
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
