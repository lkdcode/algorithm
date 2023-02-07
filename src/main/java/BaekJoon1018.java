import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BaekJoon1018 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
//        String inputSize = br.readLine();
//        String[] inputSizeSplit = inputSize.split(" ");
//
//        int width = Integer.parseInt(inputSizeSplit[0]);
//        int length = Integer.parseInt(inputSizeSplit[1]);
//
//        List<String> questionPlate = new ArrayList<>();
//
//        for (int i = 0; i < width; i++) {
//            questionPlate.add(br.readLine());
//        }
//
//        makePlate(questionPlate, width, length);

        List<String> test = lineCut("BBBBBBBBW", 9);
        System.out.println(test);
    }

    private static void makePlate(List<String> questionPlate, int width, int length) {
        int start = 0;
        int end = 7;

        while (true) {

            for (int i = start; i < end; i++) {

            }
        }


    }

    private static List<String> lineCut(String linePlate, int length) {
        List<String> lineCutPlate = new ArrayList<>();

        int end = 7;
        int start = 0;

        while (true) {

            if (end == length) {
                break;
            }

            String input = "";

            for (int i = start; i <= end; i++) {
                input += linePlate.charAt(i);
            }

            lineCutPlate.add(input);
            end++;
            start++;
        }

        return lineCutPlate;
    }


}