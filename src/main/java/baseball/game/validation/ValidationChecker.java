package baseball.game.validation;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class ValidationChecker {
    public boolean validateUserInput(String input) {

        if (input.length() != 3) {
            return false;
        }

        if (!Character.isDigit(input.charAt(0)) || !Character.isDigit(input.charAt(1)) || !Character.isDigit(input.charAt(2))) {
            return false;
        }

        if (input.charAt(0) == input.charAt(1) || input.charAt(1) == input.charAt(2) || input.charAt(0) == input.charAt(2)) {
            return false;
        }

        if (input.charAt(0) == 0 || input.charAt(1) == 0 || input.charAt(2) == 0) {
            return false;
        }

        return true;
    }

    public boolean validateReplayInput(String input) {
        return Character.isDigit(input.charAt(0)) && input.length() == 1 && Integer.parseInt(input) < 3 && Integer.parseInt(input) > 0;
    }
}
