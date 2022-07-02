package loopsForCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapLoops {
    public static void main(String[] args) {


        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("ab",1);
        hm.put("bc",2);
        hm.put("cd",3);

        System.out.println(hm);

        Iterator hmItr = hm.entrySet().iterator();
        while (hmItr.hasNext()){
            Map.Entry mp = (Map.Entry)hmItr.next();
            int marks = ((int)mp.getValue()+10);
            System.out.println(mp.getKey()+" "+marks);
        }
    }
}
