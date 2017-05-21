package hackerrank.algorithms.implementations;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/the-birthday-bar
public class BirthdayChocolate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = input.nextInt();
        }
        int d = input.nextInt();
        int m = input.nextInt();
        int count = 0;
        for (int i = 0; i <= n-m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += values[j];
            }
            if (sum == d) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
