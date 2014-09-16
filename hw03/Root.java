//Steven Jodogne
//Hw03
//Root.java
//cse2
//9/14/2014
import java.util.Scanner;//import scanner
    public class Root {//declare class
        public static void main(String[] args)  {//declare string
            Scanner myScanner = new Scanner (System.in);//open scanner
            
                System.out.println("Enter a Double: ");//Ask for number input
                    double value = myScanner.nextDouble();//declare variable inputed as a double
                    double guess = value/3;//declare by guess
                    
                    guess = (2 * guess * guess * guess + value) / (3 * guess * guess);//improve guess
                    guess = (2 * guess * guess * guess + value) / (3 * guess * guess);//improve guess
                    guess = (2 * guess * guess * guess + value) / (3 * guess * guess);//improve guess
                    guess = (2 * guess * guess * guess + value) / (3 * guess * guess);//improve guess
                    guess = (2 * guess * guess * guess + value) / (3 * guess * guess);//improve guess
                    guess = (2 * guess * guess * guess + value) / (3 * guess * guess);//improve guess
                    
                    double cube = guess * guess * guess;//prove guess
                    
                System.out.println("The cube root is roughly " + guess);//print the guess
                System.out.println("The cube of " + guess + " is " + cube);//print the closest value
                    
        }
    }