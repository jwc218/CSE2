//////////////////////////////////////////////////////////////////
//John Marc Charpentier
//   lab 07
//   3/21/2016
//    11:10-12 lab
// twisty program
// import scanner
import java.util.Scanner;
public class Twisty{
    // main method required for every program
    public static void main(String[]args){
        // initiate scanner
        Scanner myScanner= new Scanner(System.in);
        // ask for length
        System.out.print("Input your desired length: ");
        int length = myScanner.nextInt();
    

// make sure value is within range
        while(length>80|| length<=0){
            System.out.print("Please input a length less than 80: ");
     while(!myScanner.hasNextInt()) {
    myScanner.next();
    System.out.print("Invalid input, Enter again: ");
}
    int newLength = myScanner.nextInt();
    length = newLength;
        }
        // ask for width
        System.out.print("Input your desired width: ");
                int width = myScanner.nextInt();

// make sure value is within range
        while(width>length || width<=0){
            System.out.print("Please input a width less than the length: ");
     while(!myScanner.hasNextInt()) {
    myScanner.next();
    System.out.print("Invalid input, Enter again: ");
}

    int newWidth = myScanner.nextInt();
    width = newWidth;
}
        // insert boolean to allow for witching
        
        boolean flip = false;
        // initiate counter
        int count = 0;
        // for loop for vertical direction
        for(int i=0; i<width; i++){
            // for loop for horizontal direction
            for(int j=0; j<length; j++){
                count = j;
                
                if (count % width == 0) {
                    if (flip) {
                        flip = false;
                    }else {
                        flip = true;
                    }
                }
                
                if (flip) {
                    if(i==j%width) {
                        System.out.print("#");
                    }else if ((i+j%width)%width==width-1){
                        System.out.print("/");
                    }else {
                        System.out.print(" ");
                    }
                }else {
                    if(i==j%width) {
                        System.out.print("\\");
                    }else if ((i+j%width)%width==width-1){
                        System.out.print("#");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            
            System.out.println();
        }
    }// end of main method
}// end of class