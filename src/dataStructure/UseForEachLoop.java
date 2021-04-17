package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class UseForEachLoop {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();



        list.add("NY");
        list.add("NY");
        list.add("NY");
        list.add("NY");
        list.add("NY");

        for (String st: list) {
            System.out.println(st);
        }
    }
}
