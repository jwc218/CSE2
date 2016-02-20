///////////////////////////////////////////
//John Marc Charpentier
//   hw 04
//   2/20/2016
//    11:10-12 lab
// program will convert RGB values to hexadecimals
// ask for rgb input
// match numbers accordingly and produce result
// insert scanner
import java.util.Scanner;
//start class
public class ToHex{
    //main method required for every java program
    public static void main(String[]args){
        // initiate scanner
        Scanner myScanner= new Scanner (System.in);
        // ask for input values
        System.out.print("Enter the value for red: ");
        int red = myScanner.nextInt();
         System.out.print("Enter the value for green: ");
         int green = myScanner.nextInt();
          System.out.print("Enter the value for blue: ");
          int blue = myScanner.nextInt();
          // limit values to those between 0 and 255
          if (red<0 || red>255||green<0 || green>255 || blue<0 || blue >255){
              System.out.println("must enter values between 0 and 255");
          }
          // run program if values are within range
          else {
              //start the print function
              System.out.print("The decimal numbers R: "+ red +", G: "+ green +  ", B: "+ blue +", is represented in hexadecimal as:");
              // declare types for values
              int val1, val2,val3,val4,val5,val6;
              // red 
              // find the second value using modulus function
              val2= red % 16;
              // get the first value using the second value
              val1= (red-val2)/16;
              if (val1<=9){
                  System.out.print(val1);
              }
              else{
                  switch(val1){
                      case 10:
                          System.out.print("A");
                          break;
                      case 11:
                          System.out.print("B");
                          break;
                      case 12:
                          System.out.print("C");
                          break;
                      case 13:
                          System.out.print("D");
                          break;
                      case 14:
                          System.out.print("E");
                          break;
                       case 15:
                          System.out.print("F");
                          break;
                  }
              }
                  if (val2<=9){
                  System.out.print(val2);
              }
              else{
                  switch(val2){
                      case 10:
                          System.out.print("A");
                          break;
                      case 11:
                          System.out.print("B");
                          break;
                      case 12:
                          System.out.print("C");
                          break;
                      case 13:
                          System.out.print("D");
                          break;
                      case 14:
                          System.out.print("E");
                          break;
                       case 15:
                          System.out.print("F");
                          break;
                  }
              }
                  // green
              // find the second value using modulus function
              val4= green % 16;
              // get the first value using the second value
              val3= (green-val4)/16;
              if (val3<=9){
                  System.out.print(val3);
              }
              else{
                  switch(val3){
                      case 10:
                          System.out.print("A");
                          break;
                      case 11:
                          System.out.print("B");
                          break;
                      case 12:
                          System.out.print("C");
                          break;
                      case 13:
                          System.out.print("D");
                          break;
                      case 14:
                          System.out.print("E");
                          break;
                       case 15:
                          System.out.print("F");
                          break;
                  }
              }
                  if (val4<=9){
                  System.out.print(val4);
              }
              else{
                  switch(val4){
                      case 10:
                          System.out.print("A");
                          break;
                      case 11:
                          System.out.print("B");
                          break;
                      case 12:
                          System.out.print("C");
                          break;
                      case 13:
                          System.out.print("D");
                          break;
                      case 14:
                          System.out.print("E");
                          break;
                       case 15:
                          System.out.print("F");
                          break;
                  }
              }
                  // green 
              // find the second value using modulus function
              val6= blue % 16;
              // get the first value using the second value
              val5= (blue-val6)/16;
              if (val5<=9){
                  System.out.print(val5);
              }
              else{
                  switch(val5){
                      case 10:
                          System.out.print("A");
                          break;
                      case 11:
                          System.out.print("B");
                          break;
                      case 12:
                          System.out.print("C");
                          break;
                      case 13:
                          System.out.print("D");
                          break;
                      case 14:
                          System.out.print("E");
                          break;
                       case 15:
                          System.out.print("F");
                          break;
                  }
              }
                  if (val6<=9){
                  System.out.println(val6);
              }
              else{
                  switch(val6){
                      case 10:
                          System.out.println("A");
                          break;
                      case 11:
                          System.out.println("B");
                          break;
                      case 12:
                          System.out.println("C");
                          break;
                      case 13:
                          System.out.println("D");
                          break;
                      case 14:
                          System.out.println("E");
                          break;
                       case 15:
                          System.out.println("F");
                          break;
                  }
                  
                  
                        
                  }
              }
          }//end of main method
    }// end of class
