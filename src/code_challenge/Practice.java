package code_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {


        List<String> color = new ArrayList<String>();
        color.add("brown");
        color.add("green");
   //     System.out.println(color);
        ////////////////
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
     //   System.out.println(list_Strings);

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Aalia", "Mustafa", "Elkem", "Aalia", "Aalia", "Virginia"));

      //  ArrayList<String> newc1 = (ArrayList<String>)names.clone();
       // System.out.println(newc1);

     //   names.removeAll(names);
        names.clear();
        System.out.println(names);

        if(names.size()==0){
            System.out.println("is empty");
        }

    }
}
