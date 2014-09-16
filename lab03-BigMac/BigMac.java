//Steven Jodogne
//CSE 2
//BigMac Java Program
//FInd Cost of Big Mac Plus Tax
//9/12/2014

    import java.util.Scanner;
    public class BigMac {//Establish Class
        public static void main(String[] args)  {//Establish String
             Scanner myScanner;//open scanner
             myScanner = new Scanner( System.in );
            System.out.print(
                 "Enter the number of Big Macs(an integer > 0): ");//print asking for variable input (number)
            int nBigMacs = myScanner.nextInt();//declare as int
            System.out.print("Enter the cost per Big Mac as" + 
            " a double (in the form xx.xx): " );//print asking for variable input (cost)
            double bigMac$ = myScanner.nextDouble();//declare as double
        	System.out.print(
                 "Enter the percent tax as a whole number (xx): ");//print asking for variable input (percent tax)
            double taxRate = myScanner.nextDouble();
            taxRate/=100; //turn into percent
            double cost$;
            int dollars,   
            dimes, pennies; //declare variables
            cost$ = nBigMacs*bigMac$*(1+taxRate);//declare function for total cost
            dollars=(int)cost$;//cast to int
            dimes=(int)(cost$*10)%10;//cast to int
            pennies=(int)(cost$*100)%10;//cast to int
            System.out.println("The total cost of " +nBigMacs
            +"BigMacs, at $"+bigMac$ +"per bigMac, with a" +  
            " sales tax of "+ (int)(taxRate*100) + "%, is  $"+
            dollars+"."+dimes+pennies);//print out answer
           
    }
}