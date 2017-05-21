/**
 * Lily has a chocolate bar consisting of a row of  squares where each square has an integer written on it. She wants to share it with Ron for his birthday, which falls on month  and day . Lily only wants to give Ron a piece of chocolate if it contains  consecutive squares whose integers sum to .

Given , , and the sequence of integers written on each square of Lily's chocolate bar, how many different ways can Lily break off a piece of chocolate to give to Ron?

For example, if ,  and the chocolate bar contains  rows of squares with the integers written on them from left to right, the following diagram shows two ways to break off a piece:
 */
//https://www.hackerrank.com/challenges/the-birthday-bar

package hackerrank.algorithms.implementations;

import java.util.Scanner;

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
        for (int i = 0; i <= n - m; i++) {
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
