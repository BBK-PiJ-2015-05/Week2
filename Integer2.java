/*
 * Day 4 Exercise 7 Integer
* imitates a boxed Integer
*/


public class Integer2 {
    int value;
    
    //returns the value of this number as an int, a getter
    public int getValue(){
        return value;
    }
    
    //a setter
    public void setValue(int n){
        this.value = n;
    }
    
    //returns true if the number is even, false otherwise
    public boolean isEven(){
        boolean even = false;
        if(this.value % 2 == 0){
            even = true;
        }
        return even;
    }
    
    //return false if even, true otherwise
    //returns true if the number is even, false otherwise
    public boolean isOdd(){
        boolean odd = false;
        if(this.value % 2 == 0){
            odd = true;
        }
        return odd;
    }
    
    //prints the value of the integer on the screen
    public void prettyPrint(){
        System.out.println(value);
    }
    
    //returns a string equivalent to the number
    public String toString(){
        String valueStr = String.valueOf(this.value);
        return valueStr;
    }
}