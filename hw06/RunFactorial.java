//////////////////////////////////////////////////////////////////
//John Marc Charpentier
//   hw 06
//   3/7/2016
//    11:10-12 lab
// Run Factorial program
// ask for appropriate value
// use loop to find factorial of that value
//insert scanner
import java.util.Scanner;
public class RunFactorial{
    // main method required for every program
    public static void main(String[]args){
         //initiate scanner
        Scanner myScanner = new Scanner(System.in);
        // ask for input
        System.out.print("Please enter an integer that is between 9 and 16: ");
        // make sure value is an integer
        while(!myScanner.hasNextInt()) {
    myScanner.next();
    System.out.print("Invalid input, Enter again: ");
}
int num = myScanner.nextInt();
// make sure number is within appropriate range
while ((num<9) || (num >16)){
    System.out.print("Invalid input, Enter again: ");
    int newNum = myScanner.nextInt();
    num = newNum;
}
// initiate counter
int count=1;
// initate sum
int sum=1;
// use while loop to find factorial value
while (count<= num){
    sum = sum * count;
    if (count==num){
        System.out.println(num +"! = "+ sum);
    }
    count++;
    
}

    }// end of main method
}// end of class