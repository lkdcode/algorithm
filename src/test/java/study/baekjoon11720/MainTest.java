package study.baekjoon11720;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

@DisplayName("BaekJoon11720 테스트")
class MainTest {

    @DisplayName("문자열을 숫자로 바꾼 총 합계 테스트")
    @Test
    void makeResultTest() {
        BaekJoon11720 baekJoon = new BaekJoon11720();
        String numbers = "10987654321";
        int result = 46;
        assertThat(result).isEqualTo(baekJoon.makeResult(numbers));
    }

    @DisplayName("1~100 사이의 값, 익셉션, 메시지 테스트")
    @Test
    void validate_Size_Test() {
        int input = 101;
        assertThatThrownBy(() -> new Validate11720().validateSize(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 숫자 범위는 1에서 100입니다.");
    }

    @DisplayName("입력받은 숫자의 갯수, 익셉션, 메세지 테스트")
    @Test
    void validate_numbers_length_Test() {
        int size = 12;
        String numbers = "1234567890";
        assertThatThrownBy(() -> new Validate11720().validateNumbers(size, numbers))
                .isInstanceOf(NumberFormatException.class)
                .hasMessageContaining("[ERROR] 숫자의 갯수가 다릅니다.");
    }

    public static class Validate11720 {
        public void validateNumbers(int size, String numbers) {
            if (size != numbers.length()) {
                throw new NumberFormatException("[ERROR] 숫자의 갯수가 다릅니다.");
            }
        }

        public void validateSize(int size) {
            if (!(size >= 1 && size <= 100)) {
                throw new NumberFormatException("[ERROR] 숫자 범위는 1에서 100입니다.");
            }
        }
    }

    public static class BaekJoon11720 {
        public int makeResult(String numbers) {
            int result = 0;
            for (int i = 0; i < numbers.length(); i++) {
                result += Integer.parseInt(String.valueOf(numbers.charAt(i)));
            }
            return result;
        }
    }

}