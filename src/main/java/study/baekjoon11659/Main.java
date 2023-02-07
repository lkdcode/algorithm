package study.baekjoon11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private final Solution solution = new Solution();

    private void run() throws IOException {
        solution.inputSizeAndQuestion();
        solution.makeNumbers();
        solution.makeSumNumbers();
        resultPrint();
    }

    private void resultPrint() throws IOException {
        for (int i = 0; i < solution.getQuestion(); i++) {
            solution.input();
            int startIndex = Integer.parseInt(solution.getInput()[0]);
            int endIndex = Integer.parseInt(solution.getInput()[1]);

            System.out.println(
                    solution.getRangeSum(startIndex, endIndex));
        }
    }

    public static void main(String[] args) throws IOException {
        new Main().run();
    }
}

class Solution {
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private int size;
    private int question;
    private int[] numbers;
    private int[] sumNumbers;
    private String[] input;

    public void inputSizeAndQuestion() throws IOException {
        input();
        this.size = Integer.parseInt(this.input[0]) + 1;
        this.question = Integer.parseInt(this.input[1]);
        input();
    }

    public void input() throws IOException {
        this.input = bufferedReader.readLine().split(" ");
    }

    public void makeNumbers() {
        this.numbers = new int[this.size];
        this.numbers[0] = 0;

        for (int i = 1; i < this.size; i++) {
            this.numbers[i] = Integer.parseInt(this.input[i - 1]);
        }
    }

    public void makeSumNumbers() {
        this.sumNumbers = new int[this.size];
        this.sumNumbers[0] = 0;

        for (int i = 1; i < this.size; i++) {
            this.sumNumbers[i] = this.sumNumbers[i - 1] + this.numbers[i];
        }
    }

    public int getRangeSum(int startIndex, int endIndex) {
        return this.sumNumbers[endIndex] - this.sumNumbers[startIndex - 1];
    }

    public int getQuestion() {
        return question;
    }

    public String[] getInput() {
        return input;
    }
}
