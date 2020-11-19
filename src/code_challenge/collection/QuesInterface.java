package code_challenge.collection;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QuesInterface {
    public static void main(String[] args) {

        Queue<Integer> q1 = new ArrayDeque<>();
        q1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        q1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(q1);

        q1.poll();

        System.out.println(q1);








    }

}
