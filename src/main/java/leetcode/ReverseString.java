package leetcode;

//https://leetcode.com/problems/reverse-string/
public class ReverseString {

    public String reverseString(String s) {
	return new StringBuilder(s).reverse().toString();
    }

}
