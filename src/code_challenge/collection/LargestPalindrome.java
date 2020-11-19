package code_challenge.collection;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Create a method that will accept a String ArrayList and return the largest Palindrome String from it
 => Assume there is no Strings with the same length and there will be at least one element

 *   -> "dad", "abcba", "racecar", "cat", sdhodjsijiajsdijodsj
 */
public class LargestPalindrome {

    public static String palindrome(ArrayList<String> words) {

        String str = "";

        words = new ArrayList<>(Arrays.asList(str.split(" ")));

        for (String each : words) {
            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);

            }

            if (reverse.equalsIgnoreCase(each)) {

            }
        }

    return str;

}}


























