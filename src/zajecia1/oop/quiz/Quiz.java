package zajecia1.oop.quiz;

import zajecia1.oop.quiz.question.MockQuestionsRepository;
import zajecia1.oop.quiz.question.Question;
import zajecia1.oop.quiz.result.MockResultRepository;

/**
 * Created by RENT on 2017-04-25.
 */
public class Quiz {
    public static void main(String[] args) {
        MockResultRepository resultsRepository = new MockResultRepository();
        MockQuestionsRepository questionsRepository = new MockQuestionsRepository();
        QuizInterface quizInterface = new QuizInterface();

        boolean gameFlag = true;
//        int decision = 0;
//        while(decision != 0){
        while (gameFlag) {
            int decision = quizInterface.menu();
            if (decision == 1) {
                String playerName = quizInterface.insertName();
                quizInterface.beforeStart();

                Question[] questions = questionsRepository.getQuestions();
                int correctAnswersCounter = 0;
                for (int i = 0; i < questions.length; i++) {
                    boolean result = quizInterface.showQuestion(questions[i]);
                    if (result) {
                        quizInterface.correctAnswer();
                        correctAnswersCounter++;
                    } else {
                        quizInterface.incorrectAnswer();
                    }
                }

                quizInterface.showResult(playerName, correctAnswersCounter);
            } else if (decision == 2) {
                quizInterface.showTopResults(resultsRepository.getTopResults(10));
            } else {
                gameFlag = false;
            }
        }
        quizInterface.afterGameEnded();
    }
}
