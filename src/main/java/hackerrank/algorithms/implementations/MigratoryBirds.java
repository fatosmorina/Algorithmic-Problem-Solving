/**
 * A flock of  birds is flying across the continent. Each bird has a type, and the different types are designated by the ID numbers , , , , and .
 * 
 * Given an array of  integers where each integer describes the type of a bird in the flock, find and print the type number of the most common bird. If two or more types of birds are equally common, choose the type with the smallest ID number.
 * 
 * Input Format
 * 
 * The first line contains an integer denoting  (the number of birds). 
 * The second line contains  space-separated integers describing the respective type numbers of each bird in the flock.
 * 
 * Constraints
 * 
 * It is guaranteed that each type is , , , , or .
 * Output Format
 * 
 * Print the type number of the most common bird; if two or more types of birds are equally common, choose the type with the smallest ID number.
 * 
 * Sample Input 0
 * 
 * 6
 * 1 4 4 4 5 3
 * Sample Output 0
 * 
 * 4
 * Explanation 0
 * 
 * The different types of birds occur in the following frequencies:

 * Type :  bird
 * Type :  birds
 * Type :  bird
 * Type :  birds
 * Type :  bird
 * The type number that occurs at the highest frequency is type , so we print  as our answer.
 */

//https://www.hackerrank.com/challenges/migratory-birds

package hackerrank.algorithms.implementations;

import java.util.Scanner;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] basics = new int[n - 1];
        for (int types_i = 0; types_i < n; types_i++) {
            int currentValue = in.nextInt();
            basics[currentValue - 1] += 1;
        }
        int max = basics[0];
        int currentMaxIndex = 0;
        for (int i = 1; i < basics.length; i++) {
            if (max < basics[i]) {
                max = basics[i];
                currentMaxIndex = i;
            } else if (max == basics[i] && currentMaxIndex > i) {
                currentMaxIndex = i;
            }
        }
        System.out.println(currentMaxIndex + 1);
    }
}
