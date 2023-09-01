import java.util.Arrays;
import java.util.stream.IntStream;

public class New2 {
    // Return a string of the number here!
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

        return (Arrays.stream(classPoints).average().orElse(0) < yourPoints);

        // Your code here
    }


    public static void main(String[] args) {
        int[] better = {1, 2, 3};
        System.out.println(betterThanAverage( better, 5));
    }

    }
