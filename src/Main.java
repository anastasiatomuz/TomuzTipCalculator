import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator");
        System.out.print("How many people are in your group? ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();
        double tipDecimal = (double) tipPercentage / 100;
        double billNoTip = 0;

        System.out.print("Enter a cost in dollar and cent, e.g. 12.50 (-1 to end): ");
        double newItem = scan.nextDouble();
        scan.nextLine();
        billNoTip += newItem;
        while (newItem != -1){
            System.out.print("Enter a cost in dollar and cent, e.g. 12.50 (-1 to end): ");
            newItem = scan.nextDouble();
            scan.nextLine();
            if (newItem == -1){
                break;
            }
            billNoTip += newItem;
        }

        //calculations
        double tipAmount = billNoTip * tipDecimal;
        double billWithTip = billNoTip + tipAmount;
        double perPersonNoTip = billNoTip/numPeople;


        System.out.println("user total: " + billNoTip);





    }
}
