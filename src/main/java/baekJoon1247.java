import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baekJoon1247 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final Scanner scanner = new Scanner(System.in);
    private static List<BigInteger> results = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 3; i++) {
            makeResult();
        }

        System.out.println(results);
        for (BigInteger show : results) {
        }

    }

    private static void makeResult() throws IOException {
        int size = Integer.parseInt(br.readLine());

        BigInteger result = new BigInteger("0");

        for (int i = 0; i < size; i++) {
            result = result.add(scanner.nextBigInteger());
        }

        results.add(result);
    }
}
