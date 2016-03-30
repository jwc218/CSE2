//////////////////////////////////////////////////////////////////
//John Marc Charpentier
//   lab 06
//   3/28/2016
//    11:10-12 lab
// rectangles program
// import scanner
import java.util.Scanner;
    public class Rectangles{
    // main method required for every program
    public static void main(String[]args){
        // initiate scanner
        Scanner myscanner= new Scanner(System.in);
        // ask for input
        System.out.print("Please enter an input: ");
        boolean acceptable = false;
        while(!acceptable){
            // input is a double, get a new value
         if(myscanner.hasNextDouble()){
                System.out.print("Invalid entry, please enter a new value: ");
                myscanner.next();
            }
            // input is an integer
            if(myscanner.hasNextInt()){
        // output
        System.out.println("Output:");
        System.out.println();
                int  c= myscanner.nextInt();
            for(int i=1;i<=c;i++){
                for(int j=1;j<=c;j++){
                    System.out.print("%");
                    if(j==c){
                        System.out.println();
                    }
                }
            }
                acceptable=true;
            }
            // input is a string
             if(myscanner.hasNextLine()){
         // output
        System.out.println("Output:");
        System.out.println();
                String  c= myscanner.nextLine();
             int x= c.length();
            for(int k=1;k<=x;k++){
                System.out.println(c);
            }
                acceptable=true;
            }
            // other cases
            else{
                 System.out.print("Invalid entry, please enter a new value: ");
                myscanner.next();
            }
        }
        }// end of main method
}// end of class