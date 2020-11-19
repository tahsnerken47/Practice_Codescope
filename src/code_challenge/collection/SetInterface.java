package code_challenge.collection;

import java.util.*;

public class SetInterface {


    public Set<Integer> hello(){

        return hello();
    }




    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(8,5,4,99,8,9,7,6,5,null));
        set1.addAll(Arrays.asList(8,5,4,8,9,7,6,5));

      //  System.out.println(set1);

        Set<Integer> s2 = new LinkedHashSet<>();
        s2.addAll(Arrays.asList(8,5,4,99,8,9,7,6,5,null));
        s2.addAll(Arrays.asList(8,5,4,99,8,9,7,6,5,null));
        //System.out.println(s2);

        Set<Integer> s3 = new TreeSet<>();
        s2.addAll(Arrays.asList(8,5,4,99,8,9,7,6,5,null,null));
        s2.addAll(Arrays.asList(8,5,4,99,8,9,7,6,5,null));
        System.out.println(s2);


        String s5 = null;

        System.out.println( s5.toUpperCase() );//Exception in thread "main" java.lang.NullPointerException

















    }
}
