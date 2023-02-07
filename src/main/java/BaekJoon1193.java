import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJoon1193 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        int index = scanner.nextInt();
//        answer(index);

//        1부터 N 까지의 합 = N * (N + 1) / 2
        // index 가 몇번째 위치에 있는지
        System.out.println(4 * (4 + 1) / 2);

//        1 부터 N -1까지의 합 = (N - 1) * N / 2
        System.out.println((4 - 1) * 4 / 2);
    }

    private static void answer(int index) {
        int startNumber = 1;
        int count = 0;

        String result = "";
        int i;
        int j;

        while (true) {
            if (count >= index) {
                break;
            }

            if (startNumber % 2 != 0) {
                for (i = 1, j = startNumber; i <= startNumber; i++, j--) {
                    result = j + "/" + i;
                    count++;
                    if (count >= index) {
                        break;
                    }
                }
            }

            if (startNumber % 2 == 0) {
                for (i = 1, j = startNumber; i <= startNumber; i++, j--) {
                    result = i + "/" + j;
                    count++;
                    if (count >= index) {
                        break;
                    }
                }
            }

            startNumber++;
        }

        System.out.println(result);

    }

}
