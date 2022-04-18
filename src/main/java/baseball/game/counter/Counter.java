package baseball.game.counter;

import baseball.game.model.GameResult;

import java.util.List;
import java.util.Objects;

public class Counter {

    private final List<Integer> targetNumbers;
    private final List<Integer> inputNumbers;

    public Counter(List<Integer> targetNumbers, List<Integer> inputNumbers) {
        this.targetNumbers = targetNumbers;
        this.inputNumbers = inputNumbers;
    }

    /**
     *  생성된 숫자와 입력된 숫자를 비교해서 볼과 스트라이크의 개수를 세는 메서드
     */
    public GameResult count() {
        int ballCount = 0;
        int strikeCount = 0;

        for (int i = 0; i < targetNumbers.size(); i++) {
            ballCount = isContained(ballCount, targetNumbers.get(i), inputNumbers.get(i));
            strikeCount = compare(strikeCount, targetNumbers.get(i), inputNumbers.get(i));
        }

        return new GameResult(ballCount, strikeCount);
    }

    /**
     * 볼 판단 여부
     * @param ballCount : 세어진 스트라이크 카운트
     * @param targetNum : 생성된 번호중, 비교되어야 하는 자리수의 번호
     * @param inputNum : 입력된 번호중, 비교되어야 하는 자시루의 번호
     * @return : 볼 카운트
     */
    private int isContained(int ballCount,  int targetNum, int inputNum) {
        if (inputNumbers.contains(targetNum) && !Objects.equals(targetNum, inputNum)) {
            ballCount++;
        }
        return ballCount;
    }

    /**
     *
     * @param strikeCount : 세어진 스트라이크 카운트
     * @param targetNum : 생성된 번호중, 비교되어야 하는 자리수의 번호
     * @param inputNum : 입력된 번호중, 비교되어야 하는 자시루의 번호
     * @return : 스트라이크 카운트
     */
    private int compare(int strikeCount, int targetNum, int inputNum) {
        if (targetNum == inputNum) {
            strikeCount++;
        }
        return strikeCount;
    }
}

