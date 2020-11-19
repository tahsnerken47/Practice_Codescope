package code_challenge.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Allswap1 {
    public static void main(String[] args) {

        String[] arr = {"juice", "car", "apple", "cat", "jump", "class", "airport", "carpet"};
        System.out.println(Arrays.toString(arr));

    }

    public static String[] allSwap(String[]  strings){
        Map<Character,Integer> map = new HashMap<>(); // help us to track each of our elements and index

        for (int i = 0; i <strings.length ; i++) {
            char key = strings[i].charAt(0);

            if(!map.containsKey(key)){
                map.put(key,1);
            }else{
                String temp = strings[i];
                strings[i] = strings[map.get(key)];
                strings[map.get(key) ] = temp;
                map.remove(key);
            }

        }
        return strings;
    }





}
