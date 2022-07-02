package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {

        Map<String, String> mp = new HashMap<String,String>();

        mp.put("jk","kj");

        //how to implement a for loop to print a hashmap from map interface ( Key and Value pair)
        for (Map.Entry<String,String> lt: mp.entrySet()){
            System.out.println(lt.getKey());
        }
    }
}
