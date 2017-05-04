package zajecia1.oop.quiz;

import zajecia1.oop.quiz.question.FileQuestionsRepository;
import zajecia1.oop.quiz.question.QuestionsRepository;
import zajecia1.oop.quiz.result.FileResultsRepository;
import zajecia1.oop.quiz.result.ResultsRepository;

/**
 * Created by RENT on 2017-04-25.
 */
public class Quiz {
    public static void main(String[] args) {
        //        QuestionsRepository questionsRepository =
//              new MockQuestionsRepository();
        QuestionsRepository questionsRepository =
                new FileQuestionsRepository("F:\\Program Files (x86)\\SDA\\idea\\SDA-poz3\\result.txt");
        ResultsRepository resultsRepository = new FileResultsRepository("F:\\Program Files (x86)\\SDA\\idea\\SDA-poz3\\quizQuestions");
        QuizInterface quizInterface = new QuizInterface();
    }
}
