package baseball.constant;

/**
 * 게임에 사용될 메세지
 */
public enum Messages {

    INPUT_MSG("숫자를 입력해주세요 : "),
    END_MSG("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    REPLAY_MSG("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    GAME_RESULT_BALL_MSG("%d볼"),
    GAME_RESULT_STRIKE_MSG("%d스트라이크"),
    GAME_RESULT_COMBINE_MSG("%d볼 %d스트라이크"),
    GAME_RESULT_NOTHING("낫싱");

    private final String msg;

    Messages(String msg) {
        this.msg = msg;
    }

    public String getMsg(){
        return this.msg;
    }
}
