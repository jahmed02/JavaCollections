package dataStructure;

import java.util.LinkedHashMap;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {

        Map<String,String> map = new LinkedHashMap<String,String>();

        map.put("USA","NY");
        map.put("Canada","Toronto");
        map.put("Australia","Sydney");

        for (Map.Entry<String, String> iterate: map.entrySet()) {
            System.out.println(iterate.getKey()+ "--->" + iterate.getValue());
        }
        System.out.println("\n");

        Map<Integer, String> list = new LinkedHashMap<Integer, String>();

        list.put(1, "Mango");
        list.put(2, "Watermelon");
        list.put (3, "papaya");

        for (Map.Entry<Integer, String> itr: list.entrySet()) {
            System.out.println(itr.getKey()+ "--->" + itr.getValue());
        }

    }
}
