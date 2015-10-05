
import java.util.Scanner;

public class Calculator { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //1 - Calculator

        Double result = 0.0;
        System.out.println("Please enter a number: ");
        Double num1 = input.nextDouble();
        System.out.println("Please enter a second number: ");
        Double num2 = input.nextDouble();
        System.out.println("For addition, enter 1");
        System.out.println("For subtraction, enter 2");
        System.out.println("For multiplication, enter 3");
        System.out.println("For division, enter 4");
        System.out.println("To exit, enter 0");
        int choice = input.nextInt();
        switch(choice) {
            case 1:	result = num1 + num2;
                System.out.println(result);
                break;
            case 2:	result = num1 - num2;
                System.out.println(result);
                break;
            case 3:	result = num1 * num2;
                System.out.println(result);
                break;
            case 4:	result = num1/num2;
                System.out.println(result);
                break;
            default: break;
        }
    }
}