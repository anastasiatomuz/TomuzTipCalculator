import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){
        //set ups
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        //intro stuff
        System.out.println("Welcome to the tip calculator");
        System.out.print("How many people are in your group? ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();

        double tipDecimal = (double) tipPercentage / 100; //turn percentage to decimal
        double billNoTip = 0; //initialize with zero so you can add item costs later

        //prompts user to enter one item cost
        System.out.print("Enter a cost in dollar and cent, e.g. 12.50 (-1 to end): ");
        double newItem = scan.nextDouble();
        scan.nextLine();
        billNoTip += newItem; //adds cost of item to total cost

        //loop for user to put in item costs
        while (newItem != -1){
            System.out.print("Enter a cost in dollar and cent, e.g. 12.50 (-1 to end): ");
            newItem = scan.nextDouble();
            scan.nextLine();
            //if user inputs -1, stop/break out of the loop
            if (newItem == -1){
                break;
            }
            billNoTip += newItem;
        }

        //calculations
        double tipAmount = billNoTip * tipDecimal;
        double billWithTip = billNoTip + tipAmount;
        double perPersonNoTip = billNoTip/numPeople;
        double tipPerPerson = tipAmount / numPeople;
        double perPersonWithTip = billWithTip / numPeople;

        //formatting
        String formatTipAmount = formatter.format(tipAmount);
        String formatBillWithTip = formatter.format(billWithTip);
        String formatPerPersonNoTip = formatter.format(perPersonNoTip);
        String formatTipPerPerson = formatter.format(tipPerPerson);
        String formatPersonWithTip = formatter.format(perPersonWithTip);


        //printing information
        System.out.println("Total Bill Before Tip: " + billNoTip);
        System.out.println("Tip Percentage: " + tipPercentage);
        System.out.println("Total Tip: " + formatTipAmount);
        System.out.println("Total Bill with Tip: " + formatBillWithTip);
        System.out.println("Per Person Cost Before Tip: " + formatPerPersonNoTip);
        System.out.println("Tip Per Person: " + formatTipPerPerson);
        System.out.println("Total Cost Per Person: " + formatPersonWithTip);





    }
}
