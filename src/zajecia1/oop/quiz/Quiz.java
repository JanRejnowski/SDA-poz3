package zajecia1.oop.quiz;

import zajecia1.oop.quiz.question.FileQuestionsRepository;
import zajecia1.oop.quiz.question.MockQuestionsRepository;
import zajecia1.oop.quiz.question.Question;
import zajecia1.oop.quiz.question.QuestionsRepository;
import zajecia1.oop.quiz.result.FileResultsRepository;
import zajecia1.oop.quiz.result.Result;
import zajecia1.oop.quiz.result.ResultsRepository;

/**
 * Created by RENT on 2017-04-25.
 */
public class Quiz {
    public static void main(String[] args) {
        QuestionsRepository questionsRepository = new FileQuestionsRepository("C:\\Users\\RENT\\IdeaProjects\\projekt\\SDA-poz3\\quizQuestions");
        ResultsRepository resultsRepository = new FileResultsRepository("C:\\Users\\RENT\\IdeaProjects\\projekt\\SDA-poz3\\result.txt");
        QuizInterface quizInterface = new QuizInterface();

        boolean gameFlag = true;
        while(gameFlag){
            int decision = quizInterface.menu();
            switch (decision) {
                case 1:
                    String playerName = quizInterface.insertName();
                    quizInterface.beforeStart();

                    Question[] questions = questionsRepository.getQuestions();
                    int correctAnswersCounter = 0;
                    for (int i = 0; i < questions.length; i++) {
                        boolean result = quizInterface.showQuestion(questions[i]);
                        if(result) {
                            quizInterface.correctAnswer();
                            correctAnswersCounter++;
                        } else {
                            quizInterface.incorrectAnswer();
                        }
                    }

                    Result result = new Result(playerName, correctAnswersCounter);
                    quizInterface.showResult(result);
                    resultsRepository.add(result);
                    break;
                case 2:
                    quizInterface.showTopResults(resultsRepository.getTopResults(10));
                    break;
                case 0:
                    gameFlag = false;
                    break;
                default:
                    System.out.println("Wrong decision");
            }
        }

    }
}
