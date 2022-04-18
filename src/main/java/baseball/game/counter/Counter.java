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

    public GameResult count() {
        int ballCount = 0;
        int strikeCount = 0;

        for (int i = 0; i < targetNumbers.size(); i++) {
            ballCount = isContained(ballCount, i);
            strikeCount = compare(strikeCount, targetNumbers.get(i), inputNumbers.get(i));
        }

        return new GameResult(ballCount, strikeCount);
    }

    private int isContained(int count, int num) {
        if (inputNumbers.contains(targetNumbers.get(num)) && !Objects.equals(targetNumbers.get(num), inputNumbers.get(num))) {
            count++;
        }
        return count;
    }

    private int compare(int count, int a, int b) {
        if (a == b) {
            count++;
        }
        return count;
    }
}

