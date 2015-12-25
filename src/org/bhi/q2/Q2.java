package org.bhi.q2;

/**
 *
 * @author carlo nino mabalatan
 */
public class Q2 {

    public static void main(String[] args) {

        final float moneybet = 10.0f;
        float number = 0.0f;
        int luckynumber = (int) (Math.random() * 38) + 1;

        if (luckynumber % 2 == 0 && luckynumber < 37) {
            number = (moneybet * 2);

        } else {
            number = (moneybet * 0);
        }

        System.out.println("The Roulette Wheel spun a:" + luckynumber);
        System.out.println("The amount in your kitty is now $" + number);
    }

}
