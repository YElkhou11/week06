package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;
    private int score;
    private String name;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.hand = new ArrayList<>();
    }

    // Method to describe the player and their hand
    public void describe() {
        System.out.println("Player: " + name);
        System.out.println("Score: " + score);
        System.out.println("Hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

    // Method to flip the top card from the hand
    public Card flip() {
        if (!hand.isEmpty()) {
            return hand.remove(0);
        } else {
            return null; // Hand is empty
        }
    }

    // Method to draw a card from the deck and add to the hand
    public void draw(Deck deck) {
        Card card = deck.draw();
        if (card != null) {
            hand.add(card);
        }
    }

    // Method to increment the player's score
    public void incrementScore() {
        score++;
    }

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}