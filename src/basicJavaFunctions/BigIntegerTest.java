package basicJavaFunctions;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("How many numbers you need to draw? ");
        int n = a.nextInt();

        System.out.println("What's the highest number you can draw?");
        int hs = a.nextInt();

        /*
        compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
        */
        //  BigInteger  is from java.math class
        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for(int i=1; i<=n; i++){
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
        }
        System.out.println("Your odds are 1 out of: "+lotteryOdds+".\nGood Luck ! ");
    }
}
