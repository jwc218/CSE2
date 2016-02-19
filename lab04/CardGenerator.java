//////////////////////////////////////////////////////////////////
//John Marc Charpentier
//   lab 04
//   2/15/2016
//    11:10-12 lab
// generate random number
// match number to card
// produce a card at random
// start program
public class CardGenerator{
    // main method required for every java program
    public static void main (String[] args){
        // generate random number 
        int number = (int) (Math.random()*52);
        // start statement
        System.out.print("You picked the ");
     
// make modulus function for card type
int cardVal = number % 13;
// assign above numbers to card type and print
switch (cardVal){

    case 1:
    System.out.print( "Ace");
    break;
     case 2:
    System.out.print("Two");
    break;
     case 3:
   System.out.print("Three");
    break;
     case 4:
    System.out.print("Four");
    break;
     case 5:
    System.out.print("Five");
    break;
     case 6:
    System.out.print("Six");
    break;
     case 7:
    System.out.print("Seven");
    break;
     case 8:
    System.out.print("Eight");
    break;
     case 9:
    System.out.print("Nine");
    break;
     case 10:
    System.out.print("Ten");
    break;
     case 11:
    System.out.print("Jack");
    break;
     case 12:
    System.out.print("Queen");
    break;
     case 13:
    System.out.print("King");
    break;
}
// continue statement
System.out.print(" of ");
        // assign numbers to number ranges to seperate suits
        if (number<=13){
            System.out.println("Diamonds");
        }
        if ((13<number) && (number<=26)){
            System.out.println("Clubs");
        }
        if ((26<number) && (number<=39)){
            System.out.println("Hearts");
    }
    if ((39<number) && (number<=52)){
            System.out.println("Spades");
}
}// end of main method
}// end of class