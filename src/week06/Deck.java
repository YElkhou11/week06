package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    // Constructor to populate the deck with 52 cards
    public Deck() {
        cards = new ArrayList<>();
        populateDeck();
    }

    // Method to populate the deck with standard 52 cards
    private void populateDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (int i = 2; i <= 14; i++) {
                String cardName = names[i - 2] + " of " + suit;
                cards.add(new Card(i, cardName));
            }
        }
    }

    // Method to shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Method to draw the top card from the deck
    public Card draw() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        } else {
            return null; // Deck is empty
        }
    }
}