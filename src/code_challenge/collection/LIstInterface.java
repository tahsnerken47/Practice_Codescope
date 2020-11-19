package code_challenge.collection;

import java.util.*;

public class LIstInterface {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));
        list1.addAll(Arrays.asList(1,2,3,4,5));
         list1.add(1);
       // System.out.println(list1);
      //  System.out.println(list1.get(2));
        System.out.println("/////////////////////////////");

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(1,2,3,8,9,5,4,3));
        list2.addAll(Arrays.asList(1,2,3,8,9,5,4,3));

      //  System.out.println(list2);

     //  System.out.println(list2.get(5));

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,45,78,99));
        list3.addAll(Arrays.asList(1,2,3,4,5,6,45,78,99));
    //    System.out.println(list3);
      //  System.out.println(list3.get(0));



        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(1,2,3,4,5,6,45,78,99));
        list4.addAll(Arrays.asList(1,2,3,4,5,6,45,78,99));
/*
        System.out.println(list4);
        System.out.println(list4.get(2));


        System.out.println( (( Stack)list4).pop());
        System.out.println(list4);

        System.out.println(((Stack)list4).pop());


        */

        int[] arr1 = {1,2,4,5,6,6};
        int[][] arr2 = { {1,2,3,4}, {5,6,7,8,9} }; // multidimensional

        List<Integer> list10= new LinkedList<>();
      // list10.addAll(Arrays.asList())

        List<List<Integer>> list5 = new ArrayList<>();
    //    list5.get(0).addAll(arr1);
      //  list5.addAll(Arrays.asList);


ArrayList<ArrayList<Integer>> list6 = new ArrayList<>();


ArrayList<ArrayList<Integer>> list7 = new ArrayList<>();
list7.add(new ArrayList<>(Arrays.asList(1,2,3,4,5)));
list7.add(new ArrayList<>(Arrays.asList(4,5,2,1)));

     /*   System.out.println(list7);
        System.out.println(list7.get(0).get(2));
        System.out.println(list7.get(1).add(88));
        System.out.println(list7);
        list7.remove(1);
        System.out.println(list7+" 0");

*/


List<List<String>> list8 = new ArrayList<>();
list8.addAll(Arrays.asList(new Stack<>(),new Stack<>(),new Stack<>(),new Stack<>(),new Stack<>()));
list8.get(0).addAll(Arrays.asList( "Alexey","Ana","Andrei","Busra Y","Busra O" ));
list8.get(1).addAll(Arrays.asList("Nickolas","Evgeniya","Aizhan","Kalbinur","Paola"));
list8.get(2).addAll(Arrays.asList("Ceren","Elizaveta","Heydar","Hunisddin","Kalbinur"));
list8.get(3).addAll(Arrays.asList("Murat", "Ayhan", "Uros", "Aysel", "Esra"));
list8.get(4).addAll(Arrays.asList("Ashenafi", "Ali", "Hamid", "Mokinur", "Nikola"));


   for(List eachList : list8){
       System.out.println(eachList.get(0));
   }










    }
}
