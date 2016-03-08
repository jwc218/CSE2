//////////////////////////////////////////////////////////////////
//John Marc Charpentier
//   hw 06
//   3/7/2016
//    11:10-12 lab
// fibonacci program
// ask for first and second values
// ask for desired number for fibonacci sequence
//import scanner
import java.util.Scanner;
public class Fibonacci{
    // main method required for every program
    public static void main(String[]args){
        //initiate scanner
        Scanner myScanner = new Scanner(System.in);
        // ask for first number
            System.out.print("Enter the first number in the sequence:  ");
        // input first number
        int first = myScanner.nextInt();
        // if number is not appropriate get a new number
        while (first<0){
            System.out.print("Please enter a new first number:  ");
            int newFirst = myScanner.nextInt();
            first = newFirst;
        }
        // ask for second number
            System.out.print("Enter the second number in the sequence:  ");
        // input second number
        int second = myScanner.nextInt();
        // if number is not appropriate get a new number
        while (second<=first){
            System.out.print("Please enter a new second number:  ");
            int newSecond = myScanner.nextInt();
            second = newSecond;
        }
        // ask for sequence length
             System.out.print("How many custom Fibonacci numbers should be printed?  ");
        // input second number
        int limit = myScanner.nextInt();
        // if number is not appropriate get a new number
        while (limit<=0){
            System.out.print("Please enter an appropriate number:  ");
            int newLimit = myScanner.nextInt();
            limit = newLimit;
        }
        // set special exemptions
        // num = 1
        if (limit==1){
            System.out.println(first + ".");
        }
        // num = 2
        else if (limit==2){
            System.out.println(first + ", " + second +".");
        }
        // main case
        else if (limit>=3){
            // start a counter
            int count = 3;
            // print first 2 values
            System.out.print(first + ", " + second );
            // print following values
            while (count<=limit){
              int sum = first + second;
              System.out.print(", "+ sum );
              first = second;
              second = sum;
              if (count==limit){
                  System.out.println(".");
              }
              count++;
            }
        }
        
        
        }// end of main method
}// end of class