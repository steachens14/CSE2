//Steven Jodogne
//Hw03
//Month.java
//cse2
//9/23/2014
    import java.util.Scanner;//import scanner
        public class Month {//declare class
            public static void main(String[] args)  {//declare string
                Scanner myScanner = new Scanner (System.in);//open scanner
                
                  
                System.out.println("Enter an int giving the number of the month (1-12)");//tell individual what to input
              
                
                if(!myScanner.hasNextInt()){//if the input is NOT a integer
                   System.out.println("You did not enter an integer");}//print out this if not an integer
                else{int value = myScanner.nextInt();//declare variable inputed as integer
                if(value < 0){
                    System.out.println("You did not enter a positive integer");}//make sure value imputed is greater than 0
                    
            else if(!(value >= 1 || value <= 12) ){//make sure value inputed is between 1 through 12
                System.out.println("You did not enter an int between 1 and 12");}
            else if(value == 1 || value == 3 || value == 5 || value == 7 || value == 8 || value == 10 || value == 12){
                System.out.println("The month has 31 days");}//each of those number corresponds with a month that has 31 days
            else if(value == 4 || value == 6 || value == 9 || value == 11){
                System.out.println("The month has 30 days");}//each of those numbers corresponds with a month that has 30 days
            else if(value == 2){
                System.out.println("Enter an int giving the year");//if February, ask for the year to check if leap year
                int year = myScanner.nextInt();
                double temp1 = year * .25;
                int temp2 = (int)temp1;
                
                temp2 = temp2 * 4;
                
                if(year == temp2){
                    System.out.println("The month has 29 days");//if the number is divided by four and equals it after truncating it then it is a leap year
                }
                else{
                    System.out.println("The month has 28 days");//if the number is regular then it is a regular year. 
                }
            }
            }
        }
}