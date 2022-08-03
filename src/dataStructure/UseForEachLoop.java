package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class UseForEachLoop {
    public static void main(String[] args) {

        //String list
        List<String> list = new ArrayList<String>();

        list.add("NY");
        list.add("AZ");
        list.add("MT");
        list.add("PA");
        list.add("CA");

        System.out.println(list+"\n");   // without for loop it would print in an array

        //using normal for loop
        //normal for loop does the same function as for each loop for string values

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));   // printing the stored list values
        }
        System.out.println("\n");

        //using for each loop ( same as for loop)
        // loops would depend on List value types. for String List, loops would be string as well

        for (String st: list) {      //String type loop for List<String> type
            System.out.println(st);  //using for loop each values would print separately
        }
        System.out.println("\n");

        //integer list
        List<Integer> lt = new ArrayList<>();

        lt.add(315);
        lt.add(15);
        lt.add(14);
        lt.add(567);

        System.out.println(lt+"\n");  // printing values in an array without using loop

        // for each loop would print the same array for Integer values
        for (Integer rt: lt){         //Integer type loop for List<Integer>
            System.out.println(lt);
        }
        System.out.println("\n");

        // for loop would print each Integer values separately
        for (int j=0; j<lt.size();j++){
            System.out.println(lt.get(j));
        }

    }
}
