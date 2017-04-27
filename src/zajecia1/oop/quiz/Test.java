package zajecia1.oop.quiz;

import zajecia1.oop.quiz.question.FileQuestionsRepository;
import zajecia1.oop.quiz.question.Question;
import zajecia1.oop.quiz.question.QuestionsRepository;
import zajecia1.oop.quiz.result.FileResultsRepository;
import zajecia1.oop.quiz.result.Result;

/**
 * Created by RENT on 2017-04-26.
 */
public class Test {
    public static void main(String[] args) {
//        FileResultsRepository repository = new FileResultsRepository("C:\\Users\\RENT\\IdeaProjects\\projekt\\SDA-poz3\\result.txt");
//        Result[] allResults = repository.getAllResults();
//        repository.add(new Result("Agnieszka", 2));
//        Result[] allResults1 = repository.getAllResults();

        QuestionsRepository questionsRepository =
                new FileQuestionsRepository("C:\\Users\\RENT\\IdeaProjects\\projekt\\SDA-poz3\\quizQuestions");
        Question[] questions = questionsRepository.getQuestions();
    }
}
