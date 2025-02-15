package hw2;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Answers {
    private List<Answer> answerList = new ArrayList<>();
    private int nextId = 1;

    // Create: Add a new answer to a question
    public void addAnswer(int questionId, String text) {
        answerList.add(new Answer(nextId++, questionId, text));
    }

    // Read: Get all answers for a specific question
    public List<Answer> getAnswersForQuestion(int questionId) {
        return answerList.stream()
            .filter(a -> a.getQuestionId() == questionId)
            .collect(Collectors.toList());
    }

    // Update: Modify the text of an answer
    public void updateAnswer(int id, String newText) {
        Answer a = answerList.stream().filter(ans -> ans.getId() == id).findFirst().orElse(null);
        if (a != null) a.setText(newText);
    }

    // Delete: Remove an answer by ID
    public void deleteAnswer(int id) {
        answerList.removeIf(a -> a.getId() == id);
    }

    // Delete all answers for a given question ID
    public void deleteAllAnswersForQuestion(int questionId) {
        answerList.removeIf(a -> a.getQuestionId() == questionId);
    }
}