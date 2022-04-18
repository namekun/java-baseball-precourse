package baseball.generator;

import baseball.constant.Numbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RandomNumberGenerator{
    public List<Integer> generate() {
        Set<Integer> numberSet = new HashSet<>();

        while(numberSet.size() < 3) {
            numberSet.add(pickNumberInRange(Numbers.RANGE_MIN_NUMBER.getNumber(), Numbers.RANGE_MAX_NUMBER.getNumber()));
        }

        return new ArrayList<>(numberSet);
    }
}
