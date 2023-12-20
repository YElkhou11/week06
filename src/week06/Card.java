package week06;

public class Card {
	private int value;
    private String name;

    // Constructors, Getters, and Setters
    // Constructor
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    // Getters and Setters
    // Getter for value
    public int getValue() {
        return value;
    }

    // Setter for value
    public void setValue(int value) {
        this.value = value;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Method to describe a card
    public void describe() {
        System.out.println("Card: " + name + ", Value: " + value);
    }
}
