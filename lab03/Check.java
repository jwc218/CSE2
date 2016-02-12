///////////////////////////////////////////
//John Marc Charpentier
//   lab 02
//   2/12/2016
//    11:10-12 lab
// find original cost of check
// find desired percentage tip
// factor in number of ways to split the check
// initiate scanner
import java.util.Scanner;
// add class and main method strcutures
public class Check{
// main method required for every Java program
   			public static void main(String[] args) {
Scanner myScanner = new Scanner( System.in );
//  ask for cost of the check
System.out.print("Enter the original cost of the check in the form xx.xx: ");
// insert check cost
double checkCost = myScanner.nextDouble();
// ask for desired percentage tip
	System.out.print("Enter the percentage tip that you wish to pay as a whole number(in the form xx): ");
// enter tip
double tipPercent = myScanner.nextDouble();
// convert percent to decimal
tipPercent /= 100 ;
// find number of dinner guests
System.out.print("Enter the number of people who went out to dinner: ");
int numPeople = myScanner.nextInt();
// initiate output types
double totalCost;
double costPerPerson;
int dollars, dimes, pennies;
// find total cost and cost per person
totalCost = checkCost * (1 + tipPercent);
costPerPerson = totalCost / numPeople;
//get the whole amount, dropping decimal fraction
dollars=(int)costPerPerson;
dimes=(int)(costPerPerson * 10) % 10;
pennies=(int)(costPerPerson * 100) % 10;
System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
}  //end of main method   
  	} //end of class