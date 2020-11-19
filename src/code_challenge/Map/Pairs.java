package code_challenge.Map;

import java.util.HashMap;
import java.util.Map;
/****
 * pairs(["code", "bug"]) → {"b": "g", "c": "e"}
 * pairs(["man", "moon", "main"]) → {"m": "n"}
 * pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
 *
 */
public class Pairs {

    public Map<String,String> pairs(String[] strings){
        Map<String ,String> map = new HashMap<>();

        for(String eachWord : strings){
            map.put(eachWord.substring(0,1),eachWord.substring(eachWord.length()-1));
        }
        return map;
    }

}
