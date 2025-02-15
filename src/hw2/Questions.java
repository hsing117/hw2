package hw2;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Questions {
    private List<Question> questionList = new ArrayList<>();
    private int nextId = 1;

    // Create: Add a new question
    public void addQuestion(String text) {
        questionList.add(new Question(nextId++, text));
    }

    // Read: Get a question by ID
    public Question getQuestion(int id) {
        return questionList.stream().filter(q -> q.getId() == id).findFirst().orElse(null);
    }

    // Update: Modify the text of a question
    public void updateQuestion(int id, String newText) {
        Question q = getQuestion(id);
        if (q != null) q.setText(newText);
    }

    // Delete: Remove a question by ID
    public void deleteQuestion(int id) {
        questionList.removeIf(q -> q.getId() == id);
    }

    // Retrieve all questions
    public List<Question> getAllQuestions() {
        return new ArrayList<>(questionList);
    }

    // Search questions by keyword
    public List<Question> searchQuestions(String keyword) {
        return questionList.stream()
            .filter(q -> q.getText().toLowerCase().contains(keyword.toLowerCase()))
            .collect(Collectors.toList());
    }
}