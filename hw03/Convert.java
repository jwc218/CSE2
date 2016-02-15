///////////////////////////////////////////
//John Marc Charpentier
//   hw 03
//   2/15/2016
//    11:10-12 lab
//ask user for distance in meters
// convert that to inches
// insert scanner
import java.util.Scanner ;
//start program
public class Convert {
    // main method required for every java program
    public static void main(String[] args) {
        // inititat scanner use
        Scanner myScanner = new Scanner(System.in);
        // set multiplier
        double inchPerMeter = 39.3701;
    // ask for dinstance in meters
    System.out.print("Enter the distance in meters: ");
    double distaceMeters = myScanner.nextDouble();
    // convert meters to inches
    double distanceInch;
    distanceInch = distaceMeters * inchPerMeter;
    // return desired data
    System.out.print( distaceMeters + " meters is " );
    System.out.printf("%.4f",distanceInch);
    System.out.println(" inches");
    }// end of main method
}// end of class