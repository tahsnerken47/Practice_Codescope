package code_challenge.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorPractice2 {
    public static void main(String[] args) {
        String[] names = {"Ahmed", "Aalia", "Abzal", "Ahmed", "Virginia", "Ahmed", "Ahmed"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        Iterator<String> it = namesList.iterator();

        while(it.hasNext()){
            if(it.next().equals("Ahmed")){
                it.remove();
            }
        }
        System.out.println(namesList);

        for(Iterator<String> it2 = namesList.iterator();it2.hasNext();){
            if(it2.next().equals("Aalia"));
            it2.remove();
        }

        System.out.println(namesList);

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(p->p.equals("Ahmed"));
        System.out.println(list);



















    }
}
