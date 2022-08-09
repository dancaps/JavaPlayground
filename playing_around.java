import java.util.Scanner;

public class playing_around {
    
    public static void main(String[] args){

        int studentAge = 15;
        double gpa = 3.95;
        
        boolean hasPerfectAttendance = true;
        String studentName = "Danny";
        char studentInitial = studentName.charAt(0);

        System.out.println(studentAge);
        System.out.println(gpa);
        System.out.println(studentInitial);
        System.out.println(hasPerfectAttendance);

        System.out.println(studentName);

        System.out.println(studentName + " " + "has a GPA of " + gpa);
        System.out.println("Update the gpa: ");
        Scanner input = new Scanner(System.in);
        gpa = input.nextDouble();
        System.out.println(gpa);
    }

}
