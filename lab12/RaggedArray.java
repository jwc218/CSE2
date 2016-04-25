//////////////////////////////////////////////////////////////////
//John Marc Charpentier
//   lab 12
//   4/22/2016
//    11:10-12 lab
// import scanner and random generator
import java.util.Scanner;
import java.util.Random;
// start program
public class RaggedArray{
    public static void main(String[] args){
        // initiate random and scanner
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        // get array length
        System.out.print("Please enter the desired length of your array: ");
        int size= scan.nextInt();
        int width;
        // initiate array
        int [] [] ragged= new int [size] [];
        for(int i=0;i<size;i++){
            width= rand.nextInt(size)+1;
            ragged [i]= new int [width];
        }
        int val;
        System.out.println("Here is your unsorted array:");
        // add values to array and print them
        for(int j=0;j<size;j++){
            for(int k=0;k< ragged[j].length;k++){
            val= rand.nextInt(21);
            ragged[j][k]=val;
            System.out.print(ragged[j][k]+", ");
            }
            System.out.println();
        }
        // sort array
        System.out.println("Here is your sorted array:");
        int min;
        int temp;
        int z;
        int mem;
        for(int x=0;x<size;x++){
            for(int y=0;y< ragged[x].length;y++){
                    min=20;
            for(z=y;z< ragged[x].length;z++){
                temp=ragged[x][y];
                if(ragged[x][z]<=min){
                    min= ragged[x][z];
                    ragged[x][z]= temp;
                    ragged[x][y]=min;
                }
            }
           System.out.print(ragged[x][y]+", ");
        }
        System.out.println();
        }
        // rearranged array
        System.out.println("Here is you rearranged array: ");
        int newMin;
        int []minArray;
        int []newTemp;
        int b;
        for(int a=0;a< size;a++){
                    newMin=size;
            for(b=a;b< size;b++){
                    newTemp=ragged[a];
                if(ragged[b].length<=newMin){
                    newMin=ragged[b].length;
                    minArray= ragged[b];
                    ragged[b]= newTemp;
                    ragged[a]=minArray;
                }
            }
            for(int c=0;c<ragged[a].length;c++){
           System.out.print(ragged[a][c]+", ");
            }
        System.out.println();
        }
        // search
        System.out.print("What number would you like to search for?  ");
        int search = scan.nextInt();
        int col=0;
        int row=0;
         for(int d=0;d<size;d++){
            for(int e=0;e< ragged[d].length;e++){
                if (ragged[d][e]==search){
                    col=e+1;
                    row=d+1;
                    break;
                }
            }
         }
         if(col !=0 && row !=0){
          System.out.println("Column "+ (col) +" Row "+ (row));
         }
         else{
          System.out.println("Sorry, your number was not found in the array");
         }
    
}// end of main method
}// end of class