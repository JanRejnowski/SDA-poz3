package zajecia1.oop.quiz;

import zajecia1.oop.quiz.question.MockQuestionsRepository;
import zajecia1.oop.quiz.question.Question;
import zajecia1.oop.quiz.result.MockResultRepository;
import zajecia1.oop.quiz.result.Result;

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
            switch (decision) {
                case 1:
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
                        Result result = new Result(playerName, correctAnswersCounter);
                        quizInterface.showResult(result);
                        resultsRepository.add(new Result(playerName, correctAnswersCounter));
                        break;
//                        case 2:
//                            quizInterface.showTopResults(resultsRepository.getTopResults(10));
//                            break;
//                        case 3:
//
//                        case 0:
//                            gameFlag = false;
//                            break;
//                        default:
//                            System.out.println("Wrong decision");
                    }
            }
            quizInterface.afterGameEnded();
        }
    }
}
