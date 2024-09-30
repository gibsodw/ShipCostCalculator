import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        double totalTax = 0.0;

        System.out.print("What is the cost of your product? ");

        totalCost = in.nextInt();
        in.nextLine();
        if(totalCost >= 100)
        {
            System.out.println("Your shipping is free! Your cost is " + totalCost);
        }
        else
        {
            totalTax = totalCost * 1.02;
            System.out.println("Your total cost with tax is " + totalTax);
        }

    }

}