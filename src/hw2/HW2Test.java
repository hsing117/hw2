package hw2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

// Test class for Questions and Answers CRUD operations
public class HW2Test {
    private Questions questions;
    private Answers answers;

    // Setup before each test
    @BeforeEach
    void setUp() {
        questions = new Questions();
        answers = new Answers();
    }

    // Test: Create and Read Question
    @Test
    void testCreateAndReadQuestion() {
        questions.addQuestion("What is polymorphism?");
        Question q = questions.getQuestion(1);
        assertNotNull(q);
        assertEquals("What is polymorphism?", q.getText());
    }

    // Test: Update a question
    @Test
    void testUpdateQuestion() {
        questions.addQuestion("Initial question");
        questions.updateQuestion(1, "Updated question");
        assertEquals("Updated question", questions.getQuestion(1).getText());
    }

    // Test: Delete a question
    @Test
    void testDeleteQuestion() {
        questions.addQuestion("To be deleted");
        questions.deleteQuestion(1);
        assertNull(questions.getQuestion(1));
    }

    // Test: Retrieve all questions
    @Test
    void testGetAllQuestions() {
        questions.addQuestion("What is OOP?");
        questions.addQuestion("Explain inheritance.");
        List<Question> allQuestions = questions.getAllQuestions();
        assertEquals(2, allQuestions.size());
    }

    // Test: Search questions by keyword
    @Test
    void testSearchQuestions() {
        questions.addQuestion("What is Java?");
        questions.addQuestion("Explain Java interfaces.");
        List<Question> searchResults = questions.searchQuestions("Java");
        assertEquals(2, searchResults.size());
    }

    // Test: Create and Read Answer
    @Test
    void testCreateAndReadAnswer() {
        questions.addQuestion("Explain inheritance");
        answers.addAnswer(1, "Inheritance allows code reuse.");
        List<Answer> answerList = answers.getAnswersForQuestion(1);
        assertFalse(answerList.isEmpty());
        assertEquals("Inheritance allows code reuse.", answerList.get(0).getText());
    }

    // Test: Delete all answers for a question
    @Test
    void testDeleteAllAnswersForQuestion() {
        questions.addQuestion("What is polymorphism?");
        answers.addAnswer(1, "It allows method overloading.");
        answers.addAnswer(1, "It enables dynamic method dispatch.");
        answers.deleteAllAnswersForQuestion(1);
        assertTrue(answers.getAnswersForQuestion(1).isEmpty());
    }

    // Test: Update an answer
    @Test
    void testUpdateAnswer() {
        questions.addQuestion("Define abstraction");
        answers.addAnswer(1, "Abstraction hides details.");
        answers.updateAnswer(1, "Abstraction simplifies complexity.");
        assertEquals("Abstraction simplifies complexity.", answers.getAnswersForQuestion(1).get(0).getText());
    }

    // Test: Delete an answer
    @Test
    void testDeleteAnswer() {
        questions.addQuestion("Explain encapsulation");
        answers.addAnswer(1, "Encapsulation protects data.");
        answers.deleteAnswer(1);
        assertTrue(answers.getAnswersForQuestion(1).isEmpty());
    }

    // Test: Ensure invalid questions are rejected
    @Test
    void testValidationOnEmptyQuestion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            questions.addQuestion("");
        });
        assertEquals("Question text cannot be empty.", exception.getMessage());
    }
}
