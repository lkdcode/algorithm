package baekjooncompletion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekJoon1236 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // 행(row)에서 비어있는 값과
        // 열(column)에서 비어있는 값 중 큰 값이 부족한 경비 수 이다.
        String input = br.readLine();
        String[] inputSplit = input.split(" ");
        int row = Integer.parseInt(inputSplit[0]);
        int column = Integer.parseInt(inputSplit[1]);

        String[] tower = new String[row];

        for (int i = 0; i < row; i++) {
            tower[i] = br.readLine();
        }

        int rowCount = 0;
        for (int i = 0; i < row; i++) {
            String find = tower[i];
            if (!find.contains("X")) {
                rowCount++;
            }
        }

        int columnCount = 0;
        for (int i = 0; i < column; i++) {
            String find = new String();
            for (int j = 0; j < row; j++) {
                find += tower[j].charAt(i);
            }
            if (!find.contains("X")) {
                columnCount++;
            }
        }
        System.out.println(Math.max(columnCount, rowCount));
    }
}
