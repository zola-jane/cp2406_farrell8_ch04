/*
 * Created by Zola on 15/08/2016.
 */
public class Billing
{
    final static double TAX = 0.08;
    public static void main(String[] args)
    {
        double bill;
        bill = computeBill(16.75);
        System.out.println("The total bill for an item that costs $16.75 is $" + bill);
        bill = computeBill(10.90, 2);
        System.out.println("The total bill for 2 items worth $10.90 is " + bill);
        bill = computeBill(25.50, 3, 5.50);
        System.out.println("The total bill for 3 items worth $25.50 with a coupon worth $5.50 is " + bill);
    }

    public static double computeBill(double p)
    {
        double total =  p + (p*TAX);
        return total;
    }

    public static double computeBill(double p, int q)
    {
        double amount = p * q;
        double total = amount + (amount * TAX);
        return total;
    }

    public static double computeBill(double p, int q, double c)
    {
        double amount = (p * q) - c;
        double total = amount + (amount * TAX);
        return total;
    }

}
