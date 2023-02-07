import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class baekJoon10845 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int size = Integer.parseInt(br.readLine());
        Queue<Integer> numbers = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            String input = br.readLine();

            if (input.contains("push")) {
                String[] inputSplit = input.split(" ");
                int pushNumber = Integer.parseInt(inputSplit[1]);
                numbers.offer(pushNumber);
            } else if (input.contains("pop")) {
                if (queuePop(numbers)) {
                    System.out.println(numbers.peek());
                    continue;
                }
                System.out.println("-1");
            } else if (input.contains("size")) {
                System.out.println(numbers.size());
            } else if (input.contains("empty")) {
                if (numbers.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (input.contains("front")) {
                // front
                if (numbers.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println(numbers.peek());
                }

            } else {
                // back
//                if (queueTop(numbers)) {
//                    System.out.println(numbers.);
//                } else {
//                    System.out.println("-1");
//                }
            }

        }
    }

    private static boolean queuePop(Queue<Integer> numbers) {
//    pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        if (numbers.size() == 0) {
            return false;
        }
        return true;
    }

    private static boolean queueTop(Queue<Integer> numbers) {
//    top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//        if (numbers.empty()) {
//            return false;
//        }
        return true;
    }

}
