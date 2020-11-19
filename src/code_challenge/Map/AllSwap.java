package code_challenge.Map;
//wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}

import java.util.HashMap;
import java.util.Map;

public class AllSwap {
    public static void main(String[] args) {

        System.out.println();


    }
public Map<String,Integer> map(String[] strings){
        Map<String,Integer> map = new HashMap<>(); //random output no ascending or inserted order
    for(String letter : strings){
        if(!map.containsKey(letter)){
            map.put(letter,0);
        }
          map.put(letter,map.get(letter+1));
        //map.put("a"   ,map/get("a" +1   ));
    }
    return map;
}


}

