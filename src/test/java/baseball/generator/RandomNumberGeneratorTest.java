package baseball.generator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomNumberGeneratorTest {

    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
    List<Integer> randomNubers = randomNumberGenerator.generate();

    @Test
    @DisplayName("생성된 숫자는 3자리 수여야 한다.")
    void randomNumberLengthTest() {
        assertEquals(3, randomNubers.size());
    }

    @Test
    @DisplayName("생성된 숫자는 중복되는 숫자가 있으면 안 된다.")
    void duplicateTest(){
        assertEquals(randomNubers.size(), new HashSet<>(randomNubers).size());
    }

    @Test
    @DisplayName("생성된 숫자는 1과 9 사이의 숫자로만 이루어져 있어야 한다.")
    void randomNumberRangeTest() {
        for(int i : randomNubers){
            assertTrue(i > 0 && i < 10);
        }
    }
}