//Hw03
//CourseNumber.java
//cse2
//9/23/2014
import java.util.Scanner;//import scanner
        public class CourseNumber {//declare class
            public static void main(String[] args)  {//declare string
                Scanner myScanner = new Scanner (System.in);//open scanner
                
                System.out.println("Enter a six digit number giving the course semester:");//enter value
                if(!myScanner.hasNextInt()){
                    System.out.println("You did not enter an integer");}//if it is not an integer
                else{int value = myScanner.nextInt();//declare variable inputed as a integer
                 if(value <= 186510 || value >= 201440){
                    System.out.println("The number is not in the range [186510:201440]");}//print out if the value is not in the range
                 else {//begin else statements
                     
                int semester = value%100;//cut of the last two digits
                int year = value/100;//divide by 100 to get the year
                  
                   if(semester != 10 && semester !=20 && semester != 30 && semester != 40){
                    System.out.println(semester + " is not a legitimate semester");}//if the last two digits are not 10,20,30,or 40 not a valid semester
                   else if(semester == 10){
                    System.out.println("The course was offered in the Spring of " + year);}//print out corresponding semester and year
                   else if(semester == 20){
                    System.out.println("The course was offered in Summer 1 of " + year);}//print out corresponding semester and year   
                   else if(semester == 30){
                    System.out.println("The course was offered in Summer 2 of " + year);}//print out corresponding semester and year  
                   else if(semester == 40){
                    System.out.println("The course was offered in the Fall of " + year);}//print out corresponding semester and year       
                  
                    
                 }//end if statemt
                }//refers to myscanner line   
            }
}


                
                