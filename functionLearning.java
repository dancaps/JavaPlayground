import java.util.Scanner;

public class functionLearning {

    public static void teaTime() {
        System.out.println("Waiting to dev tea time.");
        System.out.println("Enter any key to continue:");
        Scanner input = new Scanner(System.in);
        String anyKey = input.nextLine();
        System.out.println(anyKey + " was entered. It's tea time!");
    }

    public static double calculateMealPrice(double listedPrice, double taxPercentage, double tipPercentage){
        double taxAmount = listedPrice * taxPercentage;
        double mealCost = listedPrice + taxAmount;
        double tipAmount = mealCost * tipPercentage;
        double totalMealPrice = mealCost + tipAmount;
        //System.out.println("The total cost of you meal is: " + totalMealPrice);
        return totalMealPrice;

    }

    public static void main(String[] args){
            // teaTime();

            System.out.println("Enter the listed price of your meal:");
            Scanner input = new Scanner(System.in);
            double listedPrice = input.nextDouble();
            System.out.println("Enter the decimal percentage tax rate:");
            double taxPercentage = input.nextDouble();
            System.out.println("Enter the decimal percentage that you want to tip:");
            double tipPercentage = input.nextDouble();
            double mealAmount = calculateMealPrice(listedPrice, taxPercentage, tipPercentage);
            System.out.println("This is the total amount of your bill as a group: " + mealAmount);
            System.out.println("Enter the number of people in your party to split the bill:");
            Scanner partyNumInput = new Scanner(System.in);
            int partyNum = partyNumInput.nextInt();
            System.out.println(mealAmount / partyNum);
    }
}
