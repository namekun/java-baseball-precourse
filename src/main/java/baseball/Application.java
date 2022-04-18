package baseball;

import baseball.controller.GameController;
import baseball.generator.RandomNumberGenerator;
import baseball.input.InputTool;
import baseball.view.GameView;

public class Application {
    public static void main(String[] args) {
        GameController gameController = new GameController(new RandomNumberGenerator(), new InputTool(), new GameView());
        gameController.playBall();
    }
}
