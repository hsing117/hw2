package hw2;

public class Main {
    public static void main(String[] args) {
        // Create instances of Questions and Answers
        Questions questions = new Questions();
        Answers answers = new Answers();

        // Add some questions
        questions.addQuestion("What is Java?");
        questions.addQuestion("Explain Object-Oriented Programming.");
        
        // Display all questions
        System.out.println("All Questions:");
        for (Question q : questions.getAllQuestions()) {
            System.out.println(q.getId() + ": " + q.getText());
        }

        // Search for a question
        System.out.println("\nSearch Results for 'Java':");
        for (Question q : questions.searchQuestions("Java")) {
            System.out.println(q.getId() + ": " + q.getText());
        }

        // Add an answer to a question
        answers.addAnswer(1, "Java is a high-level programming language.");

        // Display answers to a question
        System.out.println("\nAnswers for Question 1:");
        for (Answer a : answers.getAnswersForQuestion(1)) {
            System.out.println(a.getId() + ": " + a.getText());
        }

        // Update and delete operations
        questions.updateQuestion(1, "What is Java Programming?");
        System.out.println("\nUpdated Question 1: " + questions.getQuestion(1).getText());

        answers.updateAnswer(1, "Java is used for building applications.");
        System.out.println("\nUpdated Answer 1: " + answers.getAnswersForQuestion(1).get(0).getText());

        questions.deleteQuestion(2);
        System.out.println("\nAll Questions after deletion:");
        for (Question q : questions.getAllQuestions()) {
            System.out.println(q.getId() + ": " + q.getText());
        }
    }
}
