//////////////////////////////////////////////////////////////////
//John Marc Charpentier
//   lab 09
//   4/9/2016
//    11:10-12 lab
// create a scentence using methods
// import scanner and random generator
import java.util.Scanner;
import java.util.Random;
// create class
public class Methods{
    // create methods
    // adjectives
    public static String adj(int num){
        Random generator= new Random();
        int a = generator.nextInt(10);
        String word;
        switch (a){
            case 0:
                word = "quick";
                break;
            case 1:
                word = "fat";
                break;
            case 2:
                word = "slow";
                break;    
            case 3:
                word = "smart";
                break;
            case 4:
                word = "cool";
                break;
            case 5:
                 word = "dangerous";
                break;
            case 6:
                 word = "kind";
                break;
            case 7:
                word = "foolish";
                break;
            case 8:
                word = "happy";
                break;
            case 9:
                word = "goofy";
                break;
             default:
             word= "interesting";
             break;
            
        }
       return word; 
    }
    // subject
        public static String sub(int num){
        Random generator= new Random();
        int b = generator.nextInt(10);
        String word;
        switch (b){
            case 0:
                word = "bear";
                break;
            case 1:
                word = "boy";
                break;
            case 2:
                word = "girl";
                break;    
            case 3:
                word = "lion";
                break;
            case 4:
                word = "platypus";
                break;
            case 5:
                 word = "zebra";
                break;
            case 6:
                 word = "explorer";
                break;
            case 7:
                word = "elephant";
                break;
            case 8:
                word = "eagle";
                break;
            case 9:
                word = "fox";
                break;
            default:
             word= "guru";
             break;
            
        }
       return word; 
    }
    // verb
        public static String ptv(int num){
        Random generator= new Random();
        int c = generator.nextInt(10);
        String word;
        switch (c){
            case 0:
                word = "hit";
                break;
            case 1:
                word = "attacked";
                break;
            case 2:
                word = "ran from";
                break;    
            case 3:
                word = "approached";
                break;
            case 4:
                word = "befriended";
                break;
            case 5:
                 word = "schemed";
                break;
            case 6:
                 word = "protected";
                break;
            case 7:
                word = "annoyed";
                break;
            case 8:
                word = "stopped";
                break;
            case 9:
                word = "reasoned with";
                break;
            default:
             word= "caught";
             break;
            
        }
       return word; 
    }
    // object
        public static String obj(int num){
        Random generator= new Random();
        int d = generator.nextInt(10);
        String word;
        switch (d){
            case 0:
                word = "moon";
                break;
            case 1:
                word = "dog";
                break;
            case 2:
                word = "cat";
                break;    
            case 3:
                word = "rhino";
                break;
            case 4:
                word = "tiger";
                break;
            case 5:
                 word = "pokemon";
                break;
            case 6:
                 word = "dragon";
                break;
            case 7:
                word = "tree";
                break;
            case 8:
                word = "bumblebee";
                break;
            case 9:
                word = "deer";
                break;
            default:
             word="chinchilla";
             break;
        }
       return word; 
    }
    // main method required for every program
    public static void main(String[]args){
        // initiate variables
        String response="";
        // create while statement
        for (int i=1; i<2;i++){
             Scanner scan = new Scanner(System.in);
        // move to methods to generate words
        String adjective = adj(1);
        String subject = sub(1);
        String verb = ptv(1);
        String object = obj(1);
        // print scentence
        System.out.println("The "+ adjective+" "+subject+" "+ verb +" the "+ object+".");
        System.out.print("Would you like another scentence? ");
        response = scan.next();
        response = response.toUpperCase();
        if(response.equals("YES")){
            i--;
        }
    }
}// end of main method
}// end of class
