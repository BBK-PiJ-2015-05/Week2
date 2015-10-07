/*
* Week 2, Day 4
* 4 - Binary and decimal
* converts binary to decimal and vice versa
*/
package binaryanddecimal;
import javax.swing.JOptionPane;
/**
 *
 * @author Sarah
 */
public class BinaryAndDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Binary and Decimal calculator.");
        System.out.println("1: For conversion from binary to decimal.");
        System.out.println("2: For conversion from decimal to binary.");
        System.out.println("0: Exit.");
        //String choice = System.console().readLine();
        String choice = JOptionPane.showInputDialog("Please input 1,2 or 0.");
        switch(choice){
            case "1":   String binary = JOptionPane.showInputDialog("Please enter the binary number: ");
                        System.out.println(binaryToDecimal(binary));
                        break;
            case "2":   String decimal = JOptionPane.showInputDialog("Please enter the number to convert to binary: ");
                        System.out.println(decimalToBinary(decimal));
                        break;
            default:    break;
        }
    }
    
    private static int binaryToDecimal(String n){
        int length = n.length();
	int total = 0;
	for (int i = 0; i < length; i++){
            String temp = n.substring(i, i+ 1);
            int m = Integer.parseInt(temp);
            int place = length - i - 1;
            total += (m * Math.pow(2.0, place));
        }
        return total;
    }
    
    private static String decimalToBinary(String n){
        String total = "";
	int deci = Integer.parseInt(n);
        while(deci != 0){
            int remainder = deci % 2;
            deci = (deci / 2);
            String binary = String.valueOf(remainder);
            total = binary + total;
        }
        return total;
    }
}
