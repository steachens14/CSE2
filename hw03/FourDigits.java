//Steven Jodogne
//Hw03
//Root.java
//cse2
//9/14/2014
import java.util.Scanner;//import scanner
    public class FourDigits {//declare class
        public static void main(String[] args)  {//declare string
            Scanner myScanner = new Scanner (System.in);//intro scanner
            
                System.out.println("Enter a Double and I display the four digits to the right of the decimal point: ");//text info
                    double value = myScanner.nextDouble();//declare as double
                   
                    int value1 = (int)(value * 10000);//multiply to the correct decimal place
                    value1 = value1%10;//extract digit
                    
                    int value2 = (int)(value * 1000);//multiply to the correct decimal place
                    value2 = value2%10;//extract digit
                    
                    int value3 = (int)(value * 100);//multiply to the correct decimal place
                    value3 = value3%10;//extract digit
                    
                    int value4 = (int)(value *10);//multiply to the correct decimal place
                    value4 = value4%10;//extract digit
                    
                    
                System.out.println("The Four Digits are " + value4  + ", " + value3  +", " + value2 + ", " + value1);//state numbers in correct order
                
                    
                   
                    
                    
        }
    }