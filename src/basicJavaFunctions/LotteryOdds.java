package basicJavaFunctions;

import java.util.Scanner;

public class LotteryOdds {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int n = a.nextInt();

        System.out.println("What's the highest number you can draw?");
        int hs = a.nextInt();

        /*
        compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
        */

        int lotteryOdds = 1;
        for(int i=1; i<=n;i++){
            lotteryOdds = lotteryOdds * (n-i+1)/i;
        }
        System.out.println("Your odds are 1 in " +lotteryOdds+".\n Goodluck!");
    }
}
