import java.util.Scanner;

/*
 total point / total credits
 points for a class = grade value * credits
 A = 5, B = 3.....
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of credits:");
        String credits = sc.nextLine();

        System.out.println("Enter grade:");
        String grade = sc.nextLine();

        Integer gradeValue = 0;
        if (grade.equalsIgnoreCase("A")) {
            gradeValue = 4;
        } else if (grade.equalsIgnoreCase("B")) {
            gradeValue = 3;
        } else if (grade.equalsIgnoreCase("C")) {
            gradeValue = 2;
        } else if (grade.equalsIgnoreCase("D")) {
            gradeValue = 1;
        } else if (grade.equalsIgnoreCase("F")) {
            gradeValue = 0;
        } else {
            System.out.println("Invalid grade");
        }

        Integer points = gradeValue * Integer.parseInt(credits);
        Integer gpa = points / Integer.parseInt(credits);

        System.out.println("Credits: " + credits);
        System.out.println("Grade: " + grade);
        System.out.println("Points: " + points);
        System.out.println("GPA: " + gpa);

        sc.close();


    }
}
