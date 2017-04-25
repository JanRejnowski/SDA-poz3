package zajecia1.oop.quiz;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-25.
 */
public class QuizInterface {

    private Scanner scanner;

    public QuizInterface() {
        this.scanner = new Scanner(System.in);
    }

    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Start");
        System.out.println("2. Wyniki");
        System.out.println("0. Koniec");
        int answer = this.scanner.nextInt();
        this.scanner.nextLine();
        return answer;
    }

    public String insertName(){
        System.out.println("Insert your name: ");
        return this.scanner.nextLine();
    }

    public void beforeStart() {
        System.out.println("Insert any key to start");
        this.scanner.nextLine();
    }

    public boolean showQuestion(Question question) {
        System.out.println(question.getQuestion());
        String[] possibleAnswers = question.getAnswers();
        for (int i = 0; i < possibleAnswers.length; i++) {
            System.out.print((i + 1) + ". " + possibleAnswers[i]);
        }
        int answerFromUser = scanner.nextInt();
        scanner.nextLine();
        return question.checkAnswer(answerFromUser - 1);
    }

    public void correctAnswer(){
        System.out.println("Correct answer!");
        scanner.nextLine();
    }

    public void incorrectAnswer() {
        System.out.println("Incorrect answer!");
        scanner.nextLine();
    }

    public static void showResult(String name, int result){
        System.out.println("Congratulations " + name + "You finished game with score: " + result);
    }
}
