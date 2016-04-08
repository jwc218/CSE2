import java.util.Scanner;
public class testing{
public static void sum(int x,int y){
    int summ=0;
    for(int count=x;count<=y;count++){
        System.out.print(count + " + ");
        summ+=count;
    }
    System.out.println("= "+summ);
}
public static void main(String[] args){
Scanner myscanner= new Scanner(System.in);
System.out.print("Enter an int: ");
int num1= myscanner.nextInt();
System.out.print("Enter an int greater than "+ num1 +":");
int num2= myscanner.nextInt();
while(num2<=num1){
    System.out.println("Sorry you entered "+ num2+ "<="+ num1 +"; try again");
    System.out.print("Enter an int: ");
    int newNum2= myscanner.nextInt();
    num2=newNum2;
}
sum(num1,num2);
}
}

