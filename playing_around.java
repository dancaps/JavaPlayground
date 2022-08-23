import java.util.Scanner;

public class playing_around {
    
    public static void main(String[] args){
        String correct = "10:34";
        String current = "09:41";

        int operations = 0;
        int correctHour = Integer.parseInt(correct, 0, 2, 10);
        int correctMin = Integer.parseInt(correct, 3, 5, 10);
        int currentHour = Integer.parseInt(current, 0, 2, 10);
        int currentMin = Integer.parseInt(current, 3, 5, 10);
        int dHour = correctHour - currentHour;
        int dMin; // = Math.abs(correctMin - currentMin);

        if(currentMin > correctMin){
            dMin = (60 - currentMin) + correctMin;
            dHour--;
        } else {
            dMin = correctMin - currentMin;
        }

        System.out.println(dMin);
        
        while(dHour > 0){
            dHour--;
            operations++;
        }

        while(dMin > 0){
            if(dMin >= 15){
                dMin = dMin - 15;
                operations++;
            } else if(dMin >= 5){
                dMin = dMin - 5;
                operations++;
            } else {
                dMin--;
                operations++;
            }
        }
        System.out.println(operations);
            
        // while differenceMinutes > 0 
        //     if differenceMinutes is >= 15
        //         differenceMinutes = differenceMinutes - 15
        //         operations++
        //     else if differenceMinutes >= 5
        //         differenceMinutes - 5
        //         operations++
        //     else differenceMinutes > 0
        //         differenceMinutes - 1
        //         operations++

        // int studentAge = 15;
        // double gpa = 3.95;
        
        // boolean hasPerfectAttendance = true;
        // String studentName = "Danny";
        // char studentInitial = studentName.charAt(0);

        // System.out.println(studentAge);
        // System.out.println(gpa);
        // System.out.println(studentInitial);
        // System.out.println(hasPerfectAttendance);

        // System.out.println(studentName);

        // System.out.println(studentName + " " + "has a GPA of " + gpa);
        // System.out.println("Update the gpa: ");
        // Scanner input = new Scanner(System.in);
        // gpa = input.nextDouble();
        // System.out.println(gpa);






    }

}
