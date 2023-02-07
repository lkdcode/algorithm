package study.baekjoon11659;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * logic
 * 1. 수의 갯수와 문제의 갯수를 입력 받는다.
 * 2. 숫자를 입력 받아 배열에 저장한다.
 * 3. 합 배열 공식으로 합 배열을 생성한다. -> Test
 * 4. 합을 구해야하는 범위를 입력 받는다
 * 5. 구간 합 공식으로 결과를 구한다 -> Test
 */

@DisplayName("baekjoon 11659 Test")
public class MainTest {

    @DisplayName("합 배열 생성 테스트")
    @Test
    void 합_배열_생성_테스트() {
        int[] numbers = {0, 5, 4, 3, 2, 1};
        int[] sumResult = {0, 5, 9, 12, 14, 15};

        int[] sumNumbers = new Solution().makeSumNumbers(numbers);

        assertThat(Arrays.equals(sumNumbers, sumResult)).isTrue();
    }

    @DisplayName("구간 합 공식 테스트")
    @Test
    void 구간_합_공식_테스트() {
        int[] numbers = {0, 5, 4, 3, 2, 1};
        int[] sumNumbers = new Solution().makeSumNumbers(numbers);

        int startIndex = 2;
        int endIndex = 4;

        int result = 9;

        int resultTest = new Solution().getRangeSum(sumNumbers, startIndex, endIndex);
        assertThat(result).isEqualTo(resultTest);
    }
}

class Solution {

    public int[] makeSumNumbers(int[] numbers) {
        int[] sumNumbers = new int[numbers.length];
        sumNumbers[0] = 0;

        for (int i = 1; i < numbers.length; i++) {
            sumNumbers[i] = sumNumbers[i - 1] + numbers[i];
        }

        return sumNumbers;
    }

    public int getRangeSum(int[] sumNumbers, int startIndex, int endIndex) {
        return sumNumbers[endIndex] - sumNumbers[startIndex - 1];
    }
}