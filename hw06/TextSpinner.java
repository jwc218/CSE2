//////////////////////////////////////////////////////////////////
//John Marc Charpentier
//   hw 06
//   3/7/2016
//    11:10-12 lab
// Text Spinner program
// create a program that will produce various symbols that represent progress
public class TextSpinner{
    //main method required for every java program
    public static void main(String[]args){
        // initiate counter
       int count=1;
       //create while loop to create each symbol
        while (count<=4){
            //    /
            if (count==1){
                System.out.print("/");
                System.out.print("\b");
                count++;
            }
            //       -
            if (count==2){
                 System.out.print("-");
                System.out.print("\b");
                count++;
            }
            //        \
            if (count==3){
                System.out.print("\\");
                System.out.print("\b");
                count++;
            }
            //        |
             if (count==4){
                System.out.print("|");
                System.out.print("\b");
                count=1;
            }
        }
    }// end of main method
}// end of class