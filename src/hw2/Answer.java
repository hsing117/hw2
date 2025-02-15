package hw2;

public class Answer {
    private int id;
    private int questionId;
    private String text;

    // Constructor for an answer
    public Answer(int id, int questionId, String text) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Answer text cannot be empty.");
        }
        this.id = id;
        this.questionId = questionId;
        this.text = text;
    }

    // Getters and Setters
    public int getId() { return id; }
    public int getQuestionId() { return questionId; }
    public String getText() { return text; }

    // Method to update answer text
    public void setText(String text) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Updated answer text cannot be empty.");
        }
        this.text = text;
    }
}