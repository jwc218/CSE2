//////////////////////////////////////////////////////////////////
//John Marc Charpentier
//   lab 11
//   4/15/2016
//    11:10-12 lab
// Search program
// import scanner and random generator
import java.util.Scanner;
import java.util.Random;
public class Search{
    //main method required for every program
    public static void main(String[]args){
        // initiate random generator and scanner
        Random randomGenerator= new Random();
        Scanner scan = new Scanner(System.in);
        // initiate array length
        int length=49;
        //  array 1
        int [] array1;
        array1 = new int[49];
        int num;
        for(int i=0;i<49;i++){
         num= randomGenerator.nextInt(101);
         array1[i]= num;
        }
        // find max
        int max1= array1[0];
        for(int j=0;j<49;j++){
           if( array1[j]>max1){
             max1= array1[j];
            }
        }
        System.out.println("The maximum of array1 is: "+max1);
        // find min
        int min1= array1[0];
        for(int k=0;k<49;k++){
            if( array1[k]<min1){
                min1= array1[k];
            }
        }
        System.out.println("The minimum of array1 is: "+min1);
        // array 2 
        int [] array2;
        array2 = new int[49];
        int score;
        array2[0]= randomGenerator.nextInt(101);
        int sum= array2[0];
        for(int a=1;a<49;a++){
            score= randomGenerator.nextInt(101);
            sum=sum + score;
            array2[a]=sum;
        }
        System.out.println("The maximum of array2 is: "+sum);
        System.out.println("The minimum of array2 is: "+array2[0]);
        // create difference arrays
        int [] diffAbove;
        int [] diffBelow;
        diffAbove = new int[49];
        diffBelow= new int[49];
        // create arbitrary numbers to find min distance from input value
        int minDiff=1000;
        int maxDiff=1000;
        // ask for input
        System.out.print("Enter an int: ");
        int val = scan.nextInt();
        if(val>=0 && val<sum){
            for(int d=0; d<49;d++){
                if( array2[d]==val){
                    System.out.println(val+" was found in the array");
                    break;
                }
                else{
                    // key above
                    if(array2[d]>val){
                        diffAbove[d]= array2[d]-val;
                        if(diffAbove[d]<maxDiff){
                            maxDiff=diffAbove[d];
                        }
                        
                    }
                    // key below
                    if(array2[d]<val){
                        diffBelow[d]= val-array2[d];
                        if(diffBelow[d]<minDiff){
                            minDiff=diffBelow[d];
                        }
                    }
                    // print info
                    if (d==48){
             System.out.println(val+" was not found in the array");
            System.out.println("The number above the key was "+(val+maxDiff));
            System.out.println("The number below the key was "+(val-minDiff));   
                    }
                }
            }
        }
        else{
            System.out.println("You did not enter a valid input");
        }
    }// end of main method
}// end of class