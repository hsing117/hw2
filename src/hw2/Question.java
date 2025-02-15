package hw2;

// Class representing a single Question
public class Question {
    private int id;
    private String text;

    // Constructor for a question
    public Question(int id, String text) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Question text cannot be empty.");
        }
        this.id = id;
        this.text = text;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getText() { return text; }

    // Method to update question text
    public void setText(String text) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Updated question text cannot be empty.");
        }
        this.text = text;
    }
}

