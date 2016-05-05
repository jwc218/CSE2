//////////////////////////////////////////////////////////////////
//John Marc Charpentier
//   hw 13
//   5/3/2016
//    11:10-12 lab
// import scanner and random generator
import java.util.Scanner;
import java.util.Random;
// start program
public class holoportation{
    // main method required for every program
    public static void main(String[]args){
        // initate array
        int arb=1;
        String [][][]ragged=soRandom(arb);
        for(int i=0;i<ragged.length;i++){
            for(int j=0;j<ragged[i].length;j++){
                for(int k=0;k<ragged[i][j].length;k++){
                    ragged [i][j][k]=coder();
                }
            }
        }
        print(ragged);
    }// end of main method
    public static String[][][] soRandom(int x){
        // intiate random number generator
        Random rand = new Random();
        int first=rand.nextInt(10)+1;
        // set first layer length
        String [][][]array= new String[first][][];
        int width1;
        // second layer length
        for(int i=0;i<first;i++){
          width1=rand.nextInt(10)+1;
          array[i]= new String[width1][];
        }
        int width2;
        // third layer length
        for(int j=0;j<first;j++){
            for(int k=0;k<array[j].length;k++){
                width2=rand.nextInt(10)+1;
                array[j][k]=new String[width2];
        }
    }
    return array;
}
 public static String coder(){
        // give letter list
        final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final int list = letters.length();
        // start string
          String fill = " ";
    Random rand = new Random();
    
    for (int x = 0; x < 2; x++) {
    fill = fill + letters.charAt(rand.nextInt(list));
    }
    for (int y = 0; y < 4; y++){
    int num = rand.nextInt(10)+1;
    fill = fill + num;
        
    }
    return fill;  //return the string 
}
public static void print(String[][][] x){
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                for(int k=0;k<x[i][j].length;k++){
                    if(k==0){
                        System.out.print("[");
                    }
                    if(k==x[i][j].length-1){
                        System.out.print("]");
                    }
                    System.out.print(x[i][j][k]+",");
                }
                System.out.print("|");
            }
            System.out.print("---");
        }
}
        
    }