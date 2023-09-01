import java.sql.SQLOutput;
import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
        int[] array = {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};

        int x;
        boolean statusSort = false;
        while (!statusSort) {
            statusSort = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    statusSort = false;
                    x = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = x;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
