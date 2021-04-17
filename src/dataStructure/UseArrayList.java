package dataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UseArrayList {

    public static void main(String[] args) {
        int limit =100;
        Random random = new Random();

        List<Integer> list = new ArrayList<Integer>();

        for (int j=0; j<limit; j++) {
            list.add(random.nextInt(2000));
        }

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
