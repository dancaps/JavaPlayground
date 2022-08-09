import java.util.Scanner;

public class fortuneTeller {
    
    public static void main(String[] args){
        int userNum;

        System.out.println("Enter a number between 1 and 10.");
        Scanner input = new Scanner(System.in);
        userNum = input.nextInt();

        if (userNum > 0 && userNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you.");
        } else if (userNum >= 5 && userNum <= 10) {
            System.out.println("Here is a different fortune.");
        } else {
            System.out.println("Opps. That was an incorrect number.");
        }

    while (userNum == 99){
        System.out.println(userNum);
        System.out.println("Enter a new number to exit the loop.");
        userNum = input.nextInt();
    } 
    }
}
