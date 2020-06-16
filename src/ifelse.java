import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input an integer.");
        int num = sc.nextInt();

        if (num == 10)
        {
            System.out.println("The number entered is equal to 10.");
        }

        else if(num > 10)
        {
            System.out.println("The number entered is greater than 10.");
        }
        else {
            System.out.println("The number entered is less than 10.");
        }

        System.out.println("Application finished.");
    }
}
