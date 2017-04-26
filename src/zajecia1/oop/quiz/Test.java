package zajecia1.oop.quiz;

import zajecia1.oop.quiz.result.FileResultRepository;
import zajecia1.oop.quiz.result.Result;

/**
 * Created by RENT on 2017-04-26.
 */
public class Test {
    public static void main(String[] args) {
        FileResultRepository repository = new FileResultRepository("C:\\Users\\RENT\\IdeaProjects\\projekt\\SDA-poz3\\result.txt");
        Result[] allResults = repository.getAllResults();
//        repository.add(new Result("Agnieszka", 2));
//        Result[] allResults1 = repository.getAllResults();
    }
}
