package code_challenge.Map;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public String wordAppend(String[] strings){
        String result = "";

        Map<String ,Integer> map = new HashMap<>();

        for(String each : strings){
            if(!map.containsKey(each)){
                result+=each;
                map.put(each,1);
            }
        }

        return result;


    }

}
