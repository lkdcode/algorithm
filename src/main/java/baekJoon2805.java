import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class baekJoon2805 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String input = br.readLine();
        String[] inputSplit = input.split(" ");

        int size = Integer.parseInt(inputSplit[0]);
        int needTree = Integer.parseInt(inputSplit[1]);

        int cutter = 1;
        List<Integer> tree = new ArrayList<>();

        input = br.readLine();
        inputSplit = input.split(" ");
        for (String add : inputSplit) {
            tree.add(Integer.parseInt(add));
        }

        Collections.sort(tree, Collections.reverseOrder());

        System.out.println(tree);

        int result = 0;

        while (result < needTree) {

        }

    }
}