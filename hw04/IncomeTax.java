//Steven Jodogne
//Hw03
//IncomeTax.java
//cse2
//9/23/2014
import java.util.Scanner;//import scanner
    public class IncomeTax {//declare class
        public static void main(String[] args)  {//declare string
            Scanner myScanner = new Scanner (System.in);//open scanner
            
            
            System.out.println("Enter an int giving the number of thousands");//print out asking number of thousands 
          
            
            if(!myScanner.hasNextInt()){
               System.out.println("You did not enter an integer");}//if not an integer print 
            else{int value = myScanner.nextInt();//declare variable inputed as a int
            
            int value1 = (((int)(value * 1000 *.05))*100) / 100;//declare tax bracket for less than 20,000
            int value2 = (((int)(value * 1000 *.07))*100) / 100;//declare tax bracket for less than 40,000
            int value3 = (((int)(value * 1000 *.12))*100) / 100;//declare tax bracket for less than 78,000
            int value4 = (((int)(value * 1000 *.14))*100) / 100;//declare tax bracket for greater than 78,000
            
                if(value < 0){
                System.out.println("You did not enter a positive integer");}//if value is negative
            else if (value < 20){
                    System.out.println("The tax rate on  $" + value * 1000 + " is 5%, and the tax is $" + value1 );}//print out for given income bracket
            else if (value < 40){
                    System.out.println("The tax rate on  $" + value * 1000 + " is 7%, and the tax is $" + value2 );}//print out for given income bracket      
            else if (value < 78){
                    System.out.println("The tax rate on  $" + value * 1000 + " is 12%, and the tax is $" + value3 );}//print out for given income bracket    
            else if (value >= 78){
                    System.out.println("The tax rate on  $" + value * 1000 + " is 14%, and the tax is $" + value4 );}//print out for given income bracket
                    
            
             }//end else statement
        }
    }
    
            
            
            
                