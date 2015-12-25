package org.bhi.q1;

/**
 *
 * @author carlo nino mabalatan
 */
public class Q1 {

    public static void main(String[] args) {
        final float PAY_PER_MINUTE = 1.3f;
        final int MINUTES_IN_HOUR = 60;

        int hoursworked = (int) (Math.random() * 16) + 10;

        float salary = (float) (PAY_PER_MINUTE * MINUTES_IN_HOUR * hoursworked);

        System.out.println("Number of hours worked: " + hoursworked);
        System.out.println("Number of minutes worked: " + hoursworked * MINUTES_IN_HOUR);
        System.out.println("Pay for lecturer: $" + salary);
    }

}
