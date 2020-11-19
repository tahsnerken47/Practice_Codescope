package code_challenge.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveEvens {

    public static void main(String[] args) {
        Integer[] num = {111,113,100, 900, 90, 80, 76, 120, 55, 22, 23, 45, 65, 6, 9,9,9,9,9,9,9,9,9};

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(num));
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()){
            if(it.next() %2 ==0){
                it.remove();
            }
        }
     //   System.out.println(set);

        for(Iterator<Integer> it2= set.iterator() ; it2.hasNext();){
            if(it2.next() %2 ==0){
                it2.remove();
            }
        }

        System.out.println(set);
    }
}
