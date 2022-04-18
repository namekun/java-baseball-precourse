package baseball.view;

import baseball.constant.Messages;
import baseball.game.model.GameResult;

public class GameView {
    public void askInputView(){
        System.out.print(Messages.INPUT_MSG.getMsg());
    }

    public void resultView(GameResult gameResult){
        int ballCount = gameResult.getBallCount();
        int strikeCount = gameResult.getStrikeCount();

        if(ballCount == 0 && strikeCount == 0){
            System.out.println(Messages.GAME_RESULT_NOTHING.getMsg());
            return;
        }

        if(ballCount > 0 && strikeCount > 0){
            System.out.printf((Messages.GAME_RESULT_COMBINE_MSG.getMsg()) + "%n", ballCount, strikeCount);
            return;
        }

        if(ballCount > 0 && strikeCount == 0){
            System.out.printf((Messages.GAME_RESULT_BALL_MSG.getMsg()) + "%n", ballCount);
            return;
        }

        if(strikeCount > 0 && ballCount == 0){
            System.out.printf((Messages.GAME_RESULT_STRIKE_MSG.getMsg()) + "%n", strikeCount);
        }
    }

    public void replayView(){
        System.out.println(Messages.END_MSG.getMsg());
        System.out.println(Messages.REPLAY_MSG.getMsg());
    }
}
