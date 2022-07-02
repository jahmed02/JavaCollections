package loopsForCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLoops {


    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<Integer>();

        arrList.add(12);
        arrList.add(19);
        arrList.add(96);
        arrList.add(13);

        //using for loop to iterate arraylist
        System.out.println("For Loop");

        for(int i=0; i<arrList.size(); i++){
            System.out.println(arrList.get(i));
        }

        //advanced for loop (for eacch loop)
        System.out.println("Advanced For Loop");
        for(Integer num:arrList){
            System.out.println(num);
        }

        //using while loop
        System.out.println("While Loop");
        int  count=0;
        while(arrList.size()>count){
            System.out.println(arrList.get(count));
            count++;
        }

        //using Iterator
        System.out.println("Iterator");
        Iterator itr = arrList.iterator();
        while (itr.hasNext()){             // have to use while syntax to get the whole loop
            System.out.println(itr.next());
        }






    }
}
