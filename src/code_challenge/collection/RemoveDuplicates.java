package code_challenge.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6));

    //    System.out.println(list);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

      list.clear();
      list.addAll(set);
        System.out.println(list);













    }
}
