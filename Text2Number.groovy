/*
* Text2number
*/

String num = null;

println("Please enter a number to halve.");
num = System.console().readLine();
int length = num.length();
int comma = 0;
int dec = 0;
if(num.contains(',')){
    comma = num.indexOf(',');
}
if (num.contains('.')){
    deci = num.indexOf('.');
}
num1 = num.substring(0, comma);
num2 = num.substring((comma + 1), (deci));
num3 = num.substring((deci + 1), length);
num = num1 + num2 + num3;
int numDec = 10**(length - deci - 1);
println (numDec);

int numInt = num.toInteger();

Double result = ((numInt/2)/numDec);
println(result);