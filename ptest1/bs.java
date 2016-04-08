import java.util.Scanner;
public class bs{
    public static void main(String[]args){
        Scanner myscanner = new Scanner(System.in);
        System.out.print("min: ");
        double min= myscanner.nextDouble();
        System.out.print("ml: ");
        double ml= myscanner.nextDouble();
        System.out.print("max: ");
        double max= myscanner.nextDouble();
        double output= (min + (4*ml) + max)/6;
        System.out.println(output);
    }
}