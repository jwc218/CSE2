//////////////////////////////////////////////////////////////////
//John Marc Charpentier
//   lab 06
//   4/8/2016
//    11:10-12 lab
// create arrays
// import scanner
import java.util.Scanner;
// import random number generator
import java.util.Random;
public class Arrays{
    // main method required for every program
    public static void main(String[]args){
        // initiate random generator
        Random randomGenerator= new Random();
         // randomly decide how many inputs between 5 and 10
        int num =(randomGenerator.nextInt(6))+5;
        // initate scanner
        Scanner scan= new Scanner(System.in);
        // ask for names
        // initiate array
        System.out.println("Enter "+ num + " student names");
        String [] names;
        names= new String [num];
        for (int i =0; i<num;i++){
            System.out.print(" Please enter a student's name: ");
            names[i]= scan.nextLine();
        }
        // make array of random grades
        int [] grade;
        grade = new int [num];
        int score;
        for(int j=0; j< num; j++){
             score= randomGenerator.nextInt(101);
             grade[j] = score;
        }
        // print out grades with scores
        System.out.println("Here are the midterm grades of the "+ num + " students above");
        for( int k=0; k<num;k++){
         System.out.println(names[k]+":  "+ grade[k]);   
        }
        
        
    }// end of main method
}// end of class