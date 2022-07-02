package basicJavaFunctions;

import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //read inputs
        System.out.println("How much money do you need to retire? ");
        double goal = in.nextDouble();

        System.out.println("How much money will you contribute every year? ");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = in.nextDouble();

         double balance = 0;
         double years = 0;

         //update account balance while goal hasn't reached yet
        while (balance<goal) {

            //add this years payment and interest
            balance += payment;

            double interest = balance * interestRate/100;
            balance += interest;
            years++;
        }

        System.out.println("You can retire in: "+years+" years");
    }
}
