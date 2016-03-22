//////////////////////////////////////////////////////////////////
//John Marc Charpentier
//   lab 07
//   3/21/2016
//    11:10-12 lab
// triangle program
// import scanner
import java.util.Scanner;
public class Triangles{
    // main method required for every program
    public static void main(String[]args){
        // initiate scanner
        Scanner myScanner= new Scanner(System.in);
        // ask for value
        System.out.print("Enter an integer between 5 and 30: ");
        int num = myScanner.nextInt();
        // make sure value is appropriate if outside of range
        while(num<5 || num>30){
            System.out.print("Please input an appropriate number: ");
     while(!myScanner.hasNextInt()) {
    myScanner.next();
    System.out.print("Invalid input, Enter again: ");
}
    int newNum = myScanner.nextInt();
    num = newNum;
        }
        //Declare for loop
        System.out.println("FOR LOOP:");
        // for loop going up
        for (int i =1; i<=num;i++){
            for (int count=1; count<=i; count++){
                System.out.print(i);
                if (count==i){
                    System.out.println();
                }
            }
        }
        // for loop going down
        for (int i =(num-1); num>=0;i--){
            for (int count=1; count<=i; count++){
                System.out.print(i);
                if (count==i){
                    System.out.println();
                    }
                }
                if (i==0){
                    break;
                }
            }
            // Declare While loop
            System.out.println("WHILE LOOP:");
            // while going up
            // initiate counters
            int j=1;
            while(j<=(num-1)){
                 int counter=1;
                while (counter<=j){
                    System.out.print(j);
                    if (counter==j){
                        System.out.println();
                    }
                    counter++;
                }
                j++;
            }
            // while going down
            
                 while(j>=0){
                 int counter=1;
                while (counter<=j){
                    System.out.print(j);
                    if (counter==j){
                        System.out.println();
                    }
                    counter++;
                }
                j--;
                if (j==0){
                    break;
                }
            }
            // declare do while loop
            System.out.println("DO WHILE LOOP:");
            // do while going up
            // initiate counters
            int k=1;
            do {
                int tick = 1;
                do {
                    System.out.print(k);
                    if (tick==k){
                        System.out.println();
                    }
                    tick++;
                }while (tick<=k);
                k++;
            }while (k<=num);
            // do while going down
            k=k-2;
             do {
                int tick = 1;
                do {
                    System.out.print(k);
                    if (tick==k){
                        System.out.println();
                    }
                    tick++;
                }while (tick<=k);
                k--;
                if (k==0){
                    break;
                }
            }while (k>=0);
    } // end of main method
}// end of class