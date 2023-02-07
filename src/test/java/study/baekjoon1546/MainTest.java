package study.baekjoon1546;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.*;

/**
 * 1. 과목 수 입력 받기 -> validateSize
 * 2. 과목 점수 입력 받기 -> validateListBySize
 * 3. 과목의 최고 점수 구하기
 * 4. 새로운 과목 점수 구하기
 * ...... (기존 점수 / 최고 점수 * 100 -> 새로운 점수) / 과목 수
 * 5. 결과값 출력
 */

@DisplayName("BaekJoon1546 Test")
class MainTest {

    @DisplayName("과목 수 유효성 검사 테스트 (익셉션, 메시지)")
    @Test
    void 과목_수_테스트() {
        int size = 10123;
        assertThatThrownBy(() -> new SolutionValidate().validateSize(size))
                .isInstanceOf(NumberFormatException.class)
                .hasMessageContaining("[ERROR] 숫자의 범위는 1~1000 사이입니다.");
    }

    @DisplayName("과목 수와 성적 수가 일치하는지 테스트(익셉션, 메시지)")
    @Test
    void 과목_수와_성적_수_테스트() {
        int size = 4;
        List<Integer> subjectScoreList = List.of(99, 74, 82);
        assertThatThrownBy(() -> new SolutionValidate().validateListBySize(size, subjectScoreList))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 과목 수가 다릅니다.");

    }

    @DisplayName("최고 점수 테스트")
    @Test
    void 최고_점수_구하기() {
        List<Integer> subjectScoreList = new ArrayList<>();
        subjectScoreList.add(99);
        subjectScoreList.add(74);
        subjectScoreList.add(82);
        int maxScoreResult = 99;

        assertThat(maxScoreResult).isEqualTo(
                new Solution().getMaxScore(subjectScoreList));
    }

    @DisplayName("새로운 평균값 테스트")
    @Test
    void 새로운_과목_점수_구하기() {
        int maxScore = 70;
        int subjectScore = 50;
        double newAverageResult = 71.43;

        assertThat(newAverageResult).isEqualTo(
                new Solution().getNewScore(maxScore, subjectScore));
    }

}

class Solution {
    public int getMaxScore(List<Integer> subjectScoreList) {
        Collections.sort(subjectScoreList, Collections.reverseOrder());
        return subjectScoreList.get(0);
    }

    public double getNewScore(int maxScore, int subjectScore) {
        double score = (double) subjectScore / maxScore;
        return Math.round(score * 10000) / 100.0;
    }
}

class SolutionValidate {
    private final int MIN_SIZE = 1;
    private final int MAX_SIZE = 1000;
    private final String ERROR_SIZE_MESSAGE = "[ERROR] 숫자의 범위는 1~1000 사이입니다.";
    private final String ERROR_LIST_MESSAGE = "[ERROR] 과목 수가 다릅니다.";

    public void validateSize(int size) {
        if (!(size >= MIN_SIZE && size <= MAX_SIZE)) {
            throw new NumberFormatException(ERROR_SIZE_MESSAGE);
        }
    }

    public void validateListBySize(int size, List<Integer> subjectScoreList) {
        if (size != subjectScoreList.size()) {
            throw new IllegalArgumentException(ERROR_LIST_MESSAGE);
        }
    }
}