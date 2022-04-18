package baseball.game.validation;

/**
 * 입력값에 대한 유효성 검증 로직
 */
public class ValidationChecker {
    /**
     * 유저가 입력한 값에 대한 검증
     * @param input : 유저가 입력한 값
     * @return : 검증한 값이 맞는 값인지에 대한 결과(true = 검증 완료)
     */
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

    /**
     * 유저가 재실행 여부에 대해 입력한 값에 대한 검증
     * @param input : 유저가 입력한 값
     * @return : 검증한 값이 맞는 값인지에 대한 결과(true = 검증 완료)
     */
    public boolean validateReplayInput(String input) {
        return input.length() == 1 && Character.isDigit(input.charAt(0)) && Integer.parseInt(input) < 3 && Integer.parseInt(input) > 0;
    }
}
