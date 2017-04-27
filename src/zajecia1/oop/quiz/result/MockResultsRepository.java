package zajecia1.oop.quiz.result;

/**
 * Created by RENT on 2017-04-25.
 */
public class MockResultsRepository implements ResultsRepository {

    private Result[] results;

    private int resultsCounter;

    public MockResultsRepository() {
        this.resultsCounter = 0;
        this.results = new Result[100];
    }

    public void add(Result result) {
        this.results[resultsCounter] = result;
        resultsCounter++;
    }

    public Result[] getAllResults() {
        Result[] resultsToReturn = new Result[resultsCounter];
        for(int i = 0; i < resultsCounter; i++){
            resultsToReturn[i] = results[i];
        }
        return resultsToReturn;
    }

    public Result[] getTopResults(int n) {
        Result[] resultsToReturn = new Result[n];
        int loopSize = n < resultsCounter ? n : resultsCounter;
        for (int i = 0; i < loopSize; i++) {
            resultsToReturn[i] = results[i];
        }
        return resultsToReturn;
    }
}
