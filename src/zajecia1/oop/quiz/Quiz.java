package zajecia1.oop.quiz;

import zajecia1.oop.quiz.question.MockQuestionsRepository;
import zajecia1.oop.quiz.question.Question;
import zajecia1.oop.quiz.result.MockResultRepository;

/**
 * Created by RENT on 2017-04-25.
 */
public class Quiz {
    public static void main(String[] args) {
        MockQuestionsRepository questionsRepository = new MockQuestionsRepository();
        QuizInterface quizInterface = new QuizInterface();
//        Question[] questions = questionsRepository.getQuestions();
//        for (int i = 0; i < questions.length; i++) {
//            System.out.println(questions[i]);
        MockResultRepository resultRepository = new MockResultRepository();
//        }

        int decision = quizInterface.menu();
        if (decision == 1){
            String playerName = quizInterface.insertName();
            quizInterface.beforeStart();

            Question[] questions = questionsRepository.getQuestions();
            int correctAnswersCounter = 0;
            for (int i = 0; i < questions.length ; i++) {
                boolean result = quizInterface.showQuestion(questions[i]);
                if(result) {
                    quizInterface.correctAnswer();
                    correctAnswersCounter++;
                } else {
                    quizInterface.incorrectAnswer();
                }
            }

            quizInterface.showResult(playerName, correctAnswersCounter);

        } else if (decision == 2){
            quizInterface.showResults(resultRepository.getAllResults());
        } else {
            System.out.println("End of the game!");
        }
    }
}
