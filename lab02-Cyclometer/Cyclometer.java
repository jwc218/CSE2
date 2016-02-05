//////////////////////////////////////////////////////////////////////////////
//John Marc Charpentier
//   lab 02
//   2/5/2016
//    11:10-12 lab
// find number of minutes for each trip
// find the number of counts for each trip
// find the distance of each trip in miles
// find the distance of the two trips combined
public class Cyclometer {  
    // main method required for every java program
    public static void main ( String [] args)  {
        // our input data
        // initial variables
        int secsTrip1 = 480; // time for trip 1
        int secsTrip2 = 3220; //time for trip 2
        int countsTrip1 = 1561;  
        int countsTrip2 = 9037;
        //intermediate variables and output data
 double wheelDiameter=27.0,  //
  	PI=3.14159, 
  	feetPerMile=5280,  
  	inchesPerFoot=12,   
  	secondsPerMinute=60;  
	double distanceTrip1, distanceTrip2,totalDistance; 
	// find count totals and trip time totals
	System.out.println("Trip 1 took  "+(secsTrip1/secondsPerMinute)+"  minutes and had  "+ countsTrip1+"  counts.");
	System.out.println("Trip 2 took  "+(secsTrip2/secondsPerMinute)+"  minutes and had  "+ countsTrip2+"  counts.");
	// run calculations and store values
	//now calculate distance
	distanceTrip1 = countsTrip1*wheelDiameter*PI;
	// above distance in inches
	// must convert to miles
	distanceTrip1/= inchesPerFoot*feetPerMile; // distance now in miles
	distanceTrip2 = countsTrip2* wheelDiameter*PI/ inchesPerFoot/ feetPerMile;
	totalDistance = distanceTrip1 + distanceTrip2;
	// print out output data
	System.out.println("Trip 1 was   "+ distanceTrip1+"  miles.");
	System.out.println("Trip 2 was  "+ distanceTrip2+"  miles.");
	System.out.println(" The total distance was  "+totalDistance+"  miles.");
    } // end of main method
} // end of class 