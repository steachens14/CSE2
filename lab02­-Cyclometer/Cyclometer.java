// Steven Jodogne
//9/5/2014
//CSE 2
//Lab 02
//Cyclometer Java Program
//Print information about two cycling trips
public class Cyclometer {
    public static void main(String[] args)  {
        int secsTrip1 = 480; //Declare seconds in Trip 1
        int secsTrip2=3220; //Delcare seconds in Trip 2
        int countsTrip1=1561;//Declare number of rotations in trip 1
        int countsTrip2=9037; //Declare number of rotations in trip 2
        double wheelDiameter=27.0, //Declare Wheel Diameter
        PI=3.14159, //Declare value for pi
        feetPerMile=5280, //Declare number of feet in a mile
        inchesPerFoot=12, //Declare number inches in a foot
        secondsPerMinute=60; //Declare number of seconds in a minute
        double distanceTrip1, distanceTrip2,totalDistance; //Declare total distance of each trip
        
        
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1=inchesPerFoot*feetPerMile; // Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");



    }
}