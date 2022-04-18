package baseball.input;

import baseball.game.validation.ValidationChecker;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputTool {

    ValidationChecker validationChecker = new ValidationChecker();

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

    public boolean replayInput(){
        String input = readLine();

        if(!validationChecker.validateReplayInput(input)){
            throw new IllegalArgumentException();
        }

        return Integer.parseInt(input) == 1;
    }
}
