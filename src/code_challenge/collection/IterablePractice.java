package code_challenge.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterablePractice {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,2,3,3,4));

        for (Integer each : list1){
         //   System.out.print(each+" ");
        }
        System.out.println();
        for (int i = 0; i <list1.size() ; i++) {
         //   System.out.print(list1.get(i)+" ");
            list1.remove(i);

        }
        System.out.println();


ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,2,3,3,4));

list3.removeIf(p->p<5);
    //    System.out.println(list3);


        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,2,3,3,4));
        Iterator<Integer> it = list4.iterator();

        while(it.hasNext()){
            if(it.next()<5){
                it.remove();
            }
        }
        System.out.println(list4);



ArrayList<Integer> list6 = new ArrayList<>((Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,2,3,3,4)));
Iterator<Integer> it1 = list6.iterator();

while (it.hasNext()){
    if(it.next()<5){
        it.remove();
    }
}
        System.out.println(list6);



















    }
}
