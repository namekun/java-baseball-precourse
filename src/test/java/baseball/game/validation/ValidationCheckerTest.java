package baseball.game.validation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidationCheckerTest {

    ValidationChecker validationChecker = new ValidationChecker();

    @ParameterizedTest(name = "야구 게임에서 정답을 맞추기 위한 값은 조건에 맞아야한다. - 틀린 값에 대한 테스트 - {index} : {0}")
    @ValueSource(strings = {"ABC", "12", "300", "181", ""})
    void userInputValueTest_01(String input) {
        assertFalse(validationChecker.validateUserInput(input));
    }

    @ParameterizedTest(name = "야구 게임에서 정답을 맞추기 위한 값은 조건에 맞아야한다. - 맞는 값에 대한 테스트 - {index} : {0}")
    @ValueSource(strings = {"123", "456", "789"})
    void userInputValueTest_02(String input) {
        assertTrue(validationChecker.validateUserInput(input));
    }

    @ParameterizedTest(name = "야구 게임을 재실행할지에 대한 입력값은 1 또는 2 여야만 한다. - 틀린 값에 대한 테스트 - {index} : {0}")
    @ValueSource(strings = {"A", "12", "3", "0", ""})
    void replayInputValueTest_01(String input) {
        assertFalse(validationChecker.validateReplayInput(input));
    }

    @ParameterizedTest(name = "야구 게임을 재실행할지에 대한 입력값은 1 또는 2 여야만 한다. - 맞는 값에 대한 테스트 - {index} : {0}")
    @ValueSource(strings = {"1", "2"})
    void replayInputValueTest_02(String input) {
        assertTrue(validationChecker.validateReplayInput(input));
    }
}