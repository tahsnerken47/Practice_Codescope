package code_challenge.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class CountDupForAmazon {
    /*
     * Write a program to identify the frequency of duplicates words in a string.
     * Print duplicates words and their frequency.
     *
     * -> input: "java is java language is useful java"
     * -> output:
     *      java: 3
     *      is: 2
     *      language: 1
     *      useful: 1
     */

    public static void main(String[] args) {


        String str = "java is java language is useful java";

        String[] arr = str.split(" ");

        ArrayList<String> words = new ArrayList<>(Arrays.asList(arr)); // store the strings here

        for (String word : words) {   //finds each word
            int count = 0;
           for(String each : words){
               if(each.contains(word)){
                   count++;

        }


    }

            System.out.println(words+" "+count);
}






    }


}
