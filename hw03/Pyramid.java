//////////////////////////////////////////
//John Marc Charpentier
//   hw 03
//   2/15/2016
//    11:10-12 lab
// ask for square side length and height
// return the volume of the pyramid
// insert scanner
import java.util.Scanner;
//start program
public class Pyramid{
    // main method required for every java program
    public static void main(String[] args){
        // inititate scanner
        Scanner myScanner = new Scanner(System.in);
        // ask for inputs
        System.out.print("The square side of the pyramid is: ");
        double squareSide = myScanner.nextDouble();
        System.out.print("The height of the pyramid is: ");
        double height = myScanner.nextDouble();
        // calculate volume
        double volume;
        volume = ((squareSide*squareSide)* height)/3;
        // print the volume given our imputs
        System.out.println("The volume inside of the pyramid is: " + volume);
    }// end of main method
}// end of class