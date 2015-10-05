
import java.util.Scanner;

public class Command { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        /*
* Command-line calculator
*/
        String numStr1 = null;
        String numStr2 = null;
        Double num1 = 0;
        Double num2 = 0;
        Double result = 0.0;
        System.out.println("Please enter what you want to calculate.");
        String formula = input.next();
        int length = formula.length();
        int add = formula.indexOf('+');
        int sub = formula.indexOf('-');
        int mult = formula.indexOf('*');
        int div = formula.indexOf('/');
        if (add !=1){
            numStr1 = formula.substring(0 add);
            num1 = Double.parseDouble(numStr1);
            numStr2 = formula.substring((add + 1) (length + 1));
            num2 = Double.parseDouble(numStr2);
            result = num1 + num2;
        }else if(sub !=1){
            numStr1 = formula.substring(0 sub);
            num1 = Double.parseDouble(numStr1);
            numStr2 = formula.substring((sub + 1) (length + 1));
            num2 = Double.parseDouble(numStr2);
            result = num1 - num2;
        }else if(mult !=1){
            numStr1 = formula.substring(0 mult);
            num1 = Double.parseDouble(numStr1);
            numStr2 = formula.substring((mult + 1) (length + 1));
            num2 = Double.parseDouble(numStr2);
            result = num1 * num2;
        }else if(div !=1){
            numStr1 = formula.substring(0 div);
            num1 = Double.parseDouble(numStr1);
            numStr2 = formula.substring( (div + 1) (length + 1));
            num2 = Double.parseDouble(numStr2);
            result = num1 / num2;
        }else{
            System.out.println("Please enter your formula using (+,-,*, or /)");
        }
    }
}