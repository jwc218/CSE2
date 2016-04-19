//////////////////////////////////////////////////////////////////
//John Marc Charpentier
//   hw 12
//   4/18/2016
//    11:10-12 lab
// import scanner and random generator
import java.util.Scanner;
import java.util.Random;
// start program
public class CSE2Linear{
    // main method equired for every program
    public static void main(String[]args){
        // initiate random and scanner
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        // intiate array
        int [] grades;
        grades = new int[16];
        // declare filler variables
        grades[0]=0;
        int val;
        String newVal;
        String range;
        String above;
        // ask for grades
        System.out.println("Please enter 15 grades chronologically between 0 and 100:");
        for(int i=1;i<=15;i++){
            boolean accept= false;
            while(accept==false){
            if(!scan.hasNextInt()){
                scan.next();
                System.out.print("please enter an integer: ");
                continue;
            }
            val=scan.nextInt();
            if(val<0 || val>100){
                System.out.print("Error, out of range. Please enter a new integer: ");
                continue;
            }
            grades[i]=val;
            if(grades[i]<grades[i-1]){
                System.out.print("Please enter a number greater than the prior entry: ");
                continue;
            }
            accept=true;
            }
        }
        // print out the sorted numbers
        System.out.println("Sorted: ");
        for(int j=1;j<16;j++){
            System.out.print(grades[j]+" ");
            if (j==15){
                System.out.println();
            }
        }
        // ask for grade and search for it
        System.out.print("Please enter a grade to search for: ");
        int num = scan.nextInt();
        for(int k=1;k<16;k++){
            if(grades[k]==num){
                System.out.println(num+" was found in the list after "+k+" iterations");
                break;
            }
            if(k==15){
                System.out.println(num+" was not found in the list");
            }
        }
        // print out scrambled numbers
        int scrambler;
        System.out.println("Scrambled:");
        // shuffle contents
        for(int x = 1;x<=15;x++){
            scrambler = rand.nextInt(15)+1;
            int temp = grades[scrambler];
            grades[scrambler]= grades[x];
            grades[x]= temp;
        }
        for(int y=1;y<16;y++){
        System.out.print(grades[y]+" ");
            if (y==15){
                System.out.println();
            }
        }
        // ask for grade and search for it
        System.out.print("Please enter a grade to search for: ");
        int ask = scan.nextInt();
        for(int z=1;z<16;z++){
            if(grades[z]==ask){
                System.out.println(ask+" was found in the list after "+z+" iterations");
                break;
            }
            if(z==15){
                System.out.println(num+" was not found in the list");
            }
        }
    }// end of main method    
}// end of class