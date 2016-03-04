//////////////////////////////////////////////////////////////////
//John Marc Charpentier
//   lab 06
//   3/4/2016
//    11:10-12 lab
// ask for length of twist
// form twist of that length
// start program
// import scanner
import java.util.Scanner;
public class TwistGenerator{
    //main method required for every program
    public static void main(String[]args){
        // initiate scanner
        Scanner myscanner = new Scanner(System.in);
        // ask for twist length
        System.out.print("Enter the desired twist length:  ");
        // input twist length
        int length = myscanner.nextInt();
        // if length is not appropriate get a new length
        while (length<0){
            System.out.print("Please enter a new twist length:  ");
            int newlength = myscanner.nextInt();
            length = newlength;
        }
        // initiate a counter
        int counter = 1;
        // start the loop for first line
        while (counter<= length){
          // print according to spacing
          if ((counter % 3)== 1){
              System.out.print("\\");
          }
          else if ((counter % 3)== 2){
              System.out.print(" ");
          }
         else if ((counter % 3)== 0){
          System.out.print("/");   
        }
        if (counter==length){
            System.out.println();
        }
        counter++;
        }
        // bring counter back to 1
        counter=1;
        // start loop for second line
        while (counter<= length){
          // print according to spacing
          if ((counter % 3)== 1){
              System.out.print(" ");
          }
          else if ((counter % 3)== 2){
              System.out.print("X");
          }
         else if ((counter % 3)== 0){
          System.out.print(" ");   
        }
        if (counter==length){
            System.out.println();
        }
        counter++;
        }
        // bring counter back to 1
        counter=1;
        // start loop for third line
        while (counter<= length){
          // print according to spacing
          if ((counter % 3)== 1){
              System.out.print("/");
          }
          else if ((counter % 3)== 2){
              System.out.print(" ");
          }
         else if ((counter % 3)== 0){
          System.out.print("\\");   
        }
        if (counter==length){
            System.out.println();
        }
        counter++;
        }
        }// end of main method
}// end of class