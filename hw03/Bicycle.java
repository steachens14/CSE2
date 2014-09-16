// Steven Jodogne
//9/14/2014
//CSE 2
//Hw03
//Bicycle Java Program
//Print information about two cycling trips
import java.util.Scanner;//Open up scanner
public class Bicycle {//declare class
    public static void main(String[] args)  {//declare string
        Scanner myScanner= new Scanner (System.in);
            System.out.println("Enter the number of seconds:");//input number for equation
                int seconds = myScanner.nextInt();
            System.out.println("Enter the number of counts:");//input number for equation
                int counts = myScanner.nextInt();
            
       
        double wheelDiameter=27.0, //Declare Wheel Diameter
        PI=3.14159, //Declare value for pi
        feetPerMile=5280, //Declare number of feet in a mile
        inchesPerFoot=12, //Declare number inches in a foot
        secondsPerMinute=60; //Declare number of seconds in a minute
        double distance = (counts*wheelDiameter*PI)/(inchesPerFoot*feetPerMile);//declare function as a variable
        double time = seconds/60;//declare variables for time
        double temp = time/60;//declare variables for the input in average function
        double average = distance/temp;//declare variable for average
        
        distance = ((int)(distance * 100))/100.0;//cast to int
        time = ((int)(time * 100))/100.0;//cast to int
        average = ((int)(average * 100))/100.0;//cast to int

            System.out.println("The distance was "  + distance  + " miles and took " + time + " minutes.");//print out distance and time
            System.out.println("The Average Speed was " + average + " miles per hour.");//print out average speed



    }
}