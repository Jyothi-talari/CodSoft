package Internship;
import java.util.*;

class QuizQuestion {
    private String question;
    private List<String> options;
    private int correctAnswer;
    
    public QuizQuestion(String question, List<String> options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
    
    public String getQuestion() {
        return question;
    }
    
    public List<String> getOptions() {
        return options;
    }
    
    public int getCorrectAnswer() {
        return correctAnswer;
    }
}

class Quiz {
    private List<QuizQuestion> questions;
    private int currentQuestionIndex;
    private int score;
    private Scanner scanner;
    
    public Quiz(List<QuizQuestion> questions) {
        this.questions = questions;
        this.currentQuestionIndex = 0;
        this.score = 0;
        this.scanner = new Scanner(System.in);
    }
    
    public void startQuiz() {
        Timer timer = new Timer();
        int questionNumber = 1;
        
        for (QuizQuestion question : questions) {
            System.out.println("Question " + questionNumber + ": " + question.getQuestion());
            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }
            
            System.out.print("Enter your answer (1-" + options.size() + "): ");
            int userAnswer = scanner.nextInt();
            
            if (userAnswer == question.getCorrectAnswer()) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect! The correct answer is: " + question.getOptions().get(question.getCorrectAnswer() - 1));
            }
            
            questionNumber++;
        }
        
        System.out.println("\nQuiz completed!");
        System.out.println("Your score: " + score + "/" + questions.size());
    }
}

public class Task_4 {
    public static void main(String[] args) {
        // Create quiz questions
        List<QuizQuestion> quizQuestions = new ArrayList<>();
        
        // Add questions with options and correct answers
        quizQuestions.add(new QuizQuestion("What is the capital of India?",
                Arrays.asList("Lucknow", "New Delhi", "Hyderabad", "Mumbai"), 2));
        quizQuestions.add(new QuizQuestion("First Prime minister in India?  ",
                Arrays.asList("Narendra Modi", "KCR", "Gandhi", "Jawaharlal Nehru"), 4));
        quizQuestions.add(new QuizQuestion("Which is the longest river in India?",
                Arrays.asList("Krishna", "Kaveri", "Ganga", "Godavari"), 3));
        quizQuestions.add(new QuizQuestion("How many planets ?",
                Arrays.asList("one", "Five", "Eight", "Nine"), 3));
        quizQuestions.add(new QuizQuestion("who invented computer?",
                Arrays.asList("Knrad Zuse", "Charles Babbege", "Alan Turing", "Vint Cerf"), 2));
        
        
        // Create a quiz instance and start the quiz
        Quiz quiz = new Quiz(quizQuestions);
        quiz.startQuiz();
       
    }
}
