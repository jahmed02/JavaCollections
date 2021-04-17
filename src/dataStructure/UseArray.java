package dataStructure;

import java.util.Scanner;

public class UseArray {
    public static void main(String[] args) {

       // int [] number = {10,90, 100, 30, 20, 70};

        System.out.println("Please enter the array size: ");
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        int [] number = new int[limit];

        System.out.println("Please enter some numbers: ");

        for (int i=0; i<number.length; i++) {
            number[i] = sc.nextInt();
        }

        for (int i=0; i<number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
