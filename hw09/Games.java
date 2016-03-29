//////////////////////////////////////////////////////////////////
//John Marc Charpentier
//   lab 06
//   3/28/2016
//    11:10-12 lab
// game center
// import scanner
import java.util.Scanner;
// import random number generator
import java.util.Random;
public class Games{
    // main method required for every program
    public static void main(String[]args){
        // initiate scanner
        Scanner myscanner= new Scanner(System.in);
        //initiate random number generator
        Random randomGenerator= new Random();
        // print welcome statement
        System.out.println(" Welcome to JM's game center!!!");
        // give game choices
        System.out.print("We offer guessTheBox, spinTheWheel, and scrambler. Please type game as it is printed: ");
        String game= myscanner.nextLine();
        // create an if statement for each game and an else that ends program if qualifications are not met
        // guess the box
        if (game.equals("guessTheBox")){
            // print out game requirements
            System.out.println("You have a choice of 3 boxes: 1,2, and 3. Try to guess which box contains the prize");
            System.out.print("Please enter the box number you would like to select: ");
            int box= myscanner.nextInt();
            while (box<1 || box>3){
                System.out.print("Invalid input, Please enter either 1, 2, or 3: ");
                int newBox=myscanner.nextInt();
                box=newBox;
            }
            // generate random number
            int correctBox= randomGenerator.nextInt(3);
            correctBox=correctBox+1;
            if (box==correctBox){
                System.out.println("Congratulations, you win the box!!!!!!");
            }
            else{
                System.out.println("Sorry, you're just another statistic");
                }
                System.out.println("The correct box was box #"+ correctBox);
            }
            // spin the wheel
        else if(game.equals("spinTheWheel")){
            // print out game requirements
            System.out.println("A 10 section wheel is spun, half of the sections are red, the other half are black");
            System.out.println("Each color has the integers 1-5 printed on a section");
            System.out.print("Please choose a color(either red or black): ");
            String colorChoice= myscanner.nextLine();
            int x=0;
            boolean acceptable= false;
            while(!acceptable){
            if(colorChoice.equals("red")||colorChoice.equals("Red")){
                x++;
                acceptable=true;
            }
            else if(colorChoice.equals("black")||colorChoice.equals("Black")){
                x++;
                x++;
                acceptable=true;
            }
            else{ 
                System.out.print("Your entry was not valid, Please enter either black or red: ");
                String newColorChoice= myscanner.nextLine();  
                colorChoice= newColorChoice;
            }
            }
            System.out.print("Please choose an integer 1-5: ");
            int numChoice= myscanner.nextInt();
            boolean accept=false;
            while(!accept){
                if(1<=numChoice && numChoice<=5){
                accept=true;
            }
                else{
                    System.out.print("Invalid, Please choose an integer 1-5: ");
                   int newNumChoice= myscanner.nextInt();
                   numChoice=newNumChoice;
                }
            }
            int color= randomGenerator.nextInt(2);
            color=color+1;
            if(color==1){
                System.out.print("The wheel has landed on Red ");
            }
            if(color==2){
              System.out.print("The wheel has landed on Black ");  
            }
            int num= randomGenerator.nextInt(5);
            num=num+1;
            System.out.println(num);
            if(x==color && numChoice==num){
                System.out.println("Congratulations, you have chosen wisely!!");
            }
            else{
                System.out.println("Sorry, you loafed");
            }
        }
        // scramble game
        else if(game.equals("scrambler")){
            System.out.print(" Please enter a word to be scrambled: ");
            String word= myscanner.nextLine();
            int x=word.length();
            int num1= randomGenerator.nextInt(x);
            int num2= randomGenerator.nextInt(x);
            int num3= randomGenerator.nextInt(x);
            num1=num1 + 1;
            num2=num1 + 1;
            num3=num1 + 1;
            char [] w = word.toCharArray();
            for(int i=1;i<=2;i++){
                char t= w[0];
                w[0]=w[num1];
                w[num1]=w[num2];
                w[num2]=w[num3];
                w[num3]=t;
            }
            String newString= new String(w);
            System.out.println("Your scrambled word is: "+ newString);
            
        }
        else{
            System.out.println(" Our arcade does not offer that game");
        }
    }// end of main method
}// end of class