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

        System.out.println(credits);
        System.out.println(grade);

        sc.close();
    }
}
