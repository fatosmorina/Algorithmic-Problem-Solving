package hackerrank.algorithms.warmup;

import static java.lang.System.exit;

import java.util.Arrays;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/mini-max-sum
public class MiniMaxSum {
    static void solve() throws Exception {
        Scanner input = new Scanner(System.in);
        String[] line = input.nextLine()
            .split(" ");
        long[] array = new long[line.length];
        for (int i = 0; i < line.length; i++) {
            array[i] = Long.valueOf(line[i]);
        }
        long[] result = getSums(array);
        System.out.println(result[0] + " " + result[1]);
        input.close();
    }

    public static long[] getSums(long[] array) {
        Arrays.sort(array);
        long min = 0;
        long max = 0;
        for (int i = 0; i < 4; i++) {
            min = min + array[i];
        }
        for (int i = 1; i < 5; i++) {
            max = max + array[i];
        }
        return new long[] { min, max };
    }

    public static void main(String[] args) {
        try {
            solve();
        } catch (Throwable e) {
            e.printStackTrace();
            exit(0);
        }
    }

}
