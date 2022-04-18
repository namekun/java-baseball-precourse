package baseball.input;

import baseball.game.validation.ValidationChecker;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

/**
 * 사용자에게 값을 입력받기 위한 로직
 */
public class InputTool {

    ValidationChecker validationChecker = new ValidationChecker();

    /**
     * 사용자에게 야구 게임의 정답값을 입력받는 메서드
     * @return : 사용자에 의해 입력된 값 리스트
     */
    public List<Integer> answerInput() {
        List<Integer> numberInput = new ArrayList<>();
        String input = readLine();

        if (!validationChecker.validateUserInput(input)) {
            throw new IllegalArgumentException();
        }

        for (String num : input.split("")) {
            numberInput.add(Integer.parseInt(num));
        }

        return numberInput;
    }

    /**
     * 사용자에게 재실행을 하기 위한 값을 입력을 받는 메서드
     * @return
     */
    public boolean replayInput(){
        String input = readLine();

        if(!validationChecker.validateReplayInput(input)){
            throw new IllegalArgumentException();
        }

        return Integer.parseInt(input) == 1;
    }
}
