package baseball.controller;

import baseball.game.counter.Counter;
import baseball.game.model.GameResult;
import baseball.generator.RandomNumberGenerator;
import baseball.input.InputTool;
import baseball.view.GameView;

import java.util.List;

public class GameController {

    private final RandomNumberGenerator randomNumberGenerator;
    private final InputTool inputTool;
    private final GameView gameView;

    public GameController(RandomNumberGenerator randomNumberGenerator, InputTool inputTool, GameView gameView) {
        this.randomNumberGenerator = randomNumberGenerator;
        this.inputTool = inputTool;
        this.gameView = gameView;
    }

    public void playBall() {
        List<Integer> targetNumberList = randomNumberGenerator.generate();

        gameView.askInputView();
        List<Integer> inputNumberList = inputTool.answerInput();

        Counter counter = new Counter(targetNumberList, inputNumberList);
        GameResult gameResult = counter.count();
        gameView.resultView(gameResult);

        while (!isGameEnd(gameResult)) {
            gameView.askInputView();
            inputNumberList = inputTool.answerInput();
            counter = new Counter(targetNumberList, inputNumberList);
            gameResult = counter.count();
            gameView.resultView(gameResult);
        }

        gameView.replayView();
        if (inputTool.replayInput()) {
            playBall();
        }
    }

    private boolean isGameEnd(GameResult gameResult){
        return gameResult.getStrikeCount() == 3;
    }
}