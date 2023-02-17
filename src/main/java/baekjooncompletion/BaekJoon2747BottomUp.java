package baekjooncompletion;

import java.io.IOException;
import java.util.Scanner;

public class BaekJoon2747BottomUp {

    private static final Scanner scanner = new Scanner(System.in);
    private static int[] D;

    public static void main(String[] args) throws IOException {
        int number = scanner.nextInt();
        D = new int[number + 1];
        for (int i = 0; i < D.length; i++) {
            D[i] = -1;
        }

        D[0] = 0;
        D[1] = 1;

        for (int i = 2; i < D.length; i++) {
            D[i] = D[i - 1] + D[i - 2];
        }

        System.out.println(D[number]);


    }


}
