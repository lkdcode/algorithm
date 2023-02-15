package baekjooncompletion;

import java.io.IOException;
import java.util.Scanner;

public class BaekJoon1193 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int question = scanner.nextInt();
        int count = 1;
        int lineNumber = 1;

        out:
        for (int i = 1; i <= question; i++) {

            for (int j = 1; j <= i; j++) {

                if (count == question) {
                    lineNumber = i;
                    count = j;
                    break out;
                }
                count++;
            }
        }

        if (lineNumber % 2 == 0) { // 짝수
            // 분자가 커지고
            // 분모가 작아진다
            int numerator = 1 + count - 1;
            int denominator = lineNumber - count + 1;
            System.out.println(numerator + "/" + denominator);
        } else { // 홀수
            // 분모가 커지고
            // 분자가 작아진다
            int denominator = 1 + count - 1;
            int numerator = lineNumber - count + 1;
            System.out.println(numerator + "/" + denominator);
        }

    }

}
