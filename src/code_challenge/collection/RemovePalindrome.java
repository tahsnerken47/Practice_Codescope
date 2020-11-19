package code_challenge.collection;

import java.util.*;

public class RemovePalindrome {
    public static void main(String[] args) {
        String[] words = {"Java", "Python", "Level", "Kayak", "Cybertek", "Zaman", "Ana", "Batch20"};

        List<String> list = new ArrayList<>();
        list.addAll( Arrays.asList(words ) );

        System.out.println(list);

        Iterator<String> it = list.iterator();

        while( it.hasNext() ){
            String each = it.next(); // "ABC"
            String reverse = "";
            for(int i = each.length()-1; i >= 0; i-- ){
                reverse += each.charAt(i);
            }

            if(each.equalsIgnoreCase(reverse)){
                it.remove();
            }

        }


        System.out.println(list);


    }

}
