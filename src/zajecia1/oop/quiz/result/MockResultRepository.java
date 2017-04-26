package zajecia1.oop.quiz.result;

/**
 * Created by RENT on 2017-04-25.
 */
public class MockResultRepository {
    private Result[] results;

    public MockResultRepository() {
        this.results = new Result[4];
        this.results[0] = new Result("Andrzej",3);
        this.results[1] = new Result("Jan", 2);
        this.results[2] = new Result("Sebastian", 1);
        this.results[3] = new Result("Seba", 1);
    }

    public Result[] getAllResults(){return results;}

    public Result[] getTopResults(int n){
        Result[] resultsToReturn = new Result[n];
        int loopSize = n < results.length ? n : results.length;
        for (int i = 0; i < loopSize; i++) {
            resultsToReturn[i] = results[i];
        }
        return resultsToReturn;
    }
}
