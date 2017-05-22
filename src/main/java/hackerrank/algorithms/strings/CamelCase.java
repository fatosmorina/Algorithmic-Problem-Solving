/**
 * Alice wrote a sequence of words in CamelCase as a string of letters, , having the following properties:
 * 
 * It is a concatenation of one or more words consisting of English letters.
 * All letters in the first word are lowercase.
 * For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
 * Given , print the number of words in  on a new line.
 * 
 * Input Format
 * 
 * A single line containing string s.

 * Constraints
 * 1 <= |s| <= 10^5
 * Output Format
 * 
 * Print the number of words in string .
 * 
 * Sample Input
 * saveChangesInTheEditor
 * Sample Output
 * 
 * 5
 * Explanation
 * 
 * String  contains five words:
 * 
 * save
 * Changes
 * In
 * The
 * Editor
 * Thus, we print  on a new line.
 */

// https://www.hackerrank.com/challenges/camelcase

package hackerrank.algorithms.strings;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(getNumberOfWords(input.nextLine()));
    }

    public static int getNumberOfWords(String word) {
        int count = 1;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count += 1;
            }
        }
        return count;
    }
}
