//Hw04
//TimePadding
//cse2
//9/23/2014
import java.util.Scanner;//import scanner
        public class TimePadding {//declare class
            public static void main(String[] args)  {//declare string
                Scanner myScanner = new Scanner (System.in);//open scanner
                
                System.out.println("Enter the time in seconds:");//ask for time in seconds
                if(!myScanner.hasNextInt()){
                    System.out.println("You did not enter an integer");}//if the input is not an integer
                else{int value = myScanner.nextInt();//declare variable inputed as a integer
                 if(value < 0){
                    System.out.println("You did not enter a positive integer");}//if the value is not a positive integer
                 else {
                int seconds = value%60;//turn input into seconds
                int minutes = (value/60)%60;//turn input into minutes
                int hours = (value/3600)%60;//turn input into hours
                   if(seconds > 9 && minutes > 9){
                    System.out.println("The time is " + hours + ":" + minutes + ":" + seconds  + ".");}//if the value divided has certain values greater than 9 print out statement
                   else if(minutes < 10 && seconds >9){
                    System.out.println("The time is " + hours + ":0" + minutes + ":" + seconds  + ".");}//if the value divided has certain values greater than 9 print out statement
                   else if(minutes < 10 && seconds <10){
                    System.out.println("The time is " + hours + ":0" + minutes + ":0" + seconds  + ".");}//if the value divided has certain values greater than 9 print out statement   
                    
                 }//refers to else statement
                }//refers to myscanner line   
            }
}
