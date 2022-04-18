package baseball.generator;

import baseball.constant.Numbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

/**
 * 무작위의 세 자리 수를 생성하는 로직
 */
public class RandomNumberGenerator{

    /**
     * 무작위의 세 자리 수를 생성하는 메서드
     * @return : 무작위의 세 자리수 리스트.
     */
    public List<Integer> generate() {
        Set<Integer> numberSet = new HashSet<>();

        while(numberSet.size() < 3) {
            numberSet.add(pickNumberInRange(Numbers.RANGE_MIN_NUMBER.getNumber(), Numbers.RANGE_MAX_NUMBER.getNumber()));
        }

        return new ArrayList<>(numberSet);
    }
}
