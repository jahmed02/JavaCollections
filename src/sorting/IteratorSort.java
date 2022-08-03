package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorSort {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();

        arr.add("John");
        arr.add("Mike");
        arr.add("Larry");
        arr.add("David");

        Collections.sort(arr);  // calling collections class and sort() to sort
        //sorting happening from bigger to small numbers

        Iterator itr = arr.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        ArrayList<Integer> ar2 = new ArrayList<Integer>();

        ar2.add(34);
        ar2.add(23);
        ar2.add(12);
        ar2.add(45);

        Collections.sort(ar2);

        Iterator itr2 = ar2.iterator();

        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }


        ArrayList<String> ut = new ArrayList<String>();

        ut.add("abcde");
        ut.add("abcd");
        ut.add("abc");
        ut.add("ab");

        Collections.sort(ut);  // this is sorting from small to big

        Iterator ot = ut.iterator();
        while (ot.hasNext()){
            System.out.println(ot.next());
        }

        //reverse sort of string
        Collections.sort(ut,Collections.reverseOrder());  // syntax for reverse sorting using COllections class
        Iterator we = ut.iterator();
        while(we.hasNext()){
            System.out.println(we.next());
        }

    }
}
