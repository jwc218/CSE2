//////////////////////////////////////////////////////////////////
//John Marc Charpentier
//   lab 07
//   3/11/2016
//    11:10-12 lab
// bowtie program 
// ask for odd integer input 
// print bowtie with input as the largest end of bowtie
// import scanner
import java.util.Scanner;
public class Bowtie{
     // main method required for every program
    public static void main(String[]args){
    // initiate scanner
     Scanner myScanner = new Scanner(System.in);
     // ask for value
     System.out.print("Please enter the desired bowtie length: ");
    // make sure value is an integer
    while(!myScanner.hasNextInt()) {
    myScanner.next();
    System.out.print("Invalid input, Enter again: ");
}
int nStars = myScanner.nextInt();
// make sure it is odd
while ((nStars % 2)==0) {
    System.out.print("Invalid input, Enter again: ");
    int newVal = myScanner.nextInt();
    nStars = newVal;
}
// make sure is within range 
while ((nStars<3) || (nStars >33)){
    System.out.print("Invalid input, Enter again: ");
    int newStar = myScanner.nextInt();
    nStars = newStar;
}
// assin chars
char star= '*';
char line= ' ';
// initiate counters
int lineCount;
int count;
// top part of bowtie
for(lineCount=1;lineCount<=nStars;lineCount++){
  for(count=1;count<=(lineCount-1);count++){
      System.out.print(line);
  }
  for(count=1;count<=(nStars-(2*(lineCount-1)));count++){
      System.out.print(star);
      if(count==(nStars-(2*(lineCount-1)))){
          System.out.println();
      }
  }

if (lineCount==((nStars+1)/2)){
    break;
}
}
// bottom of bowtie
for(lineCount=((nStars+1)/2)-1;lineCount>=0;lineCount--){
  for(count=1;count<=(lineCount-1);count++){
      System.out.print(line);
  }
  for(count=1;count<=(nStars-(2*(lineCount-1)));count++){
      System.out.print(star);
      if(count==(nStars-(2*(lineCount-1)))){
          System.out.println();
      }
  }

if (lineCount==1){
    break;
}
}


        
    }// end of main method
}// end of class