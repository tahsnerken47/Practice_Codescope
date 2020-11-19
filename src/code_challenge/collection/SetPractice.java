package code_challenge.collection;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {

        String str = "hellohellohello";

        String[] arr1 = str.split("");

      Set<String> set =new LinkedHashSet<>();
        set.addAll(Arrays.asList(arr1));

        Set<String> set3 = new LinkedHashSet<>(Arrays.asList(arr1));
   //     System.out.println(set3+" set3");
      str=  str.replace("[","").replaceAll(",","").replaceAll("]","");

   //    System.out.println(str+" set3 upate no bracket");


String str2= "hellohellohelllohelllo";
str2= new LinkedHashSet<>(Arrays.asList(str2.split(""))).toString();




String s1 = "abcabc";
String s2 = "cabbbc";

//String[] arr= s1.split("");

HashSet<String> b1 = new HashSet<>();
b1.addAll(Arrays.asList(s1.split("")));
//b1.addAll(Arrays.asList(arr));

  //      System.out.println(b1);

        HashSet<String> b2 = new HashSet<>();
        b2.addAll(Arrays.asList(s2.split("")));
       // System.out.println(b2);

        //System.out.println(b1.equals(b2));

        String x1 = "cacacabb";
        String x2 = "bbcaaaaa";

        Set<String> set1 = new HashSet<>(Arrays.asList(x1.split("")));
//
  //      System.out.println(set1);

        String[] names = {"Aalia", "Mustafa", "Elkem", "Aalia", "Aalia", "Virginia"};

  LinkedHashSet<String> set4 = new LinkedHashSet<>();
  set4.addAll(Arrays.asList(names));

   names = set4.toArray(new String[0]); // set4 turns to array

  //      System.out.println(Arrays.toString(names));

        Integer[] numbers= {1,1,1,2,2,2,2,0,0,0,0,0,1,1,1,2,3,4,5,6,7,8,9};

        Set<Integer> set6 = new TreeSet<>();
        set6.addAll(Arrays.asList(numbers));

        System.out.println(set6);

        numbers = set6.toArray(new Integer[0]);
        System.out.println(Arrays.toString(numbers));





















    }
}
