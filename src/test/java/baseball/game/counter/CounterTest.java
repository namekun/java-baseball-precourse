package baseball.game.counter;

import baseball.game.model.GameResult;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    @Test
    @DisplayName("주어진 조건에 알맞게 판별하는지 확인한다.")
    void threeStrikeValidation(){
        List<Integer> targetNumberList = new ArrayList<>();
        List<Integer> inputNumberList = new ArrayList<>();

        for(int i = 1; i < 4; i++){
            targetNumberList.add(i);
            inputNumberList.add(4 - i);
        }

        Counter counter = new Counter(targetNumberList, inputNumberList);
        GameResult gameResult = counter.count();
        assertEquals(2, gameResult.getBallCount());
        assertEquals(1, gameResult.getStrikeCount());
    }
}