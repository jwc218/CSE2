//////////////////////////////////////////////////////////////////////////////////////////
// John Marc Charpentier
//hw 02
// due 2/8/2016
// 11:10 - 12 lab
// find total cost of each item
// find sales tax associated with the items
// find total before tax
// find total tax
// find total cost of purchase including tax
public class Arithmetic{ 
    //main method required for every java program
    public static void main ( String[] args) {
        // our input variables
 //Number of pairs of pants
int numPants = 3;
//Cost per pair of pants
double pantsPrice = 34.98;

//Number of sweatshirts
int numShirts = 2;
//Cost per shirt
double shirtPrice = 24.99;

//Number of belts
int numBelts = 1;
//cost per box of envelopes
double beltPrice = 33.99;

//the tax rate
double paSalesTax = 0.06;
// declare variables
double pantsTotal, shirtsTotal, beltTotal;
// calculate and print prices of each kind of item
pantsTotal = numPants * pantsPrice; 
System.out.println("The total cost of pants is  $"+(pantsTotal));
shirtsTotal = numShirts * shirtPrice;
System.out.println("The total cost of shirts is  $"+(shirtsTotal));
beltTotal = numBelts * beltPrice ;
System.out.println("The total cost of belts is  $" + (beltTotal));
// find taxes on each type of item
double pantsTax1, shirtsTax1, beltTax1;
pantsTax1 = paSalesTax * pantsTotal* 100;
shirtsTax1 = paSalesTax * shirtsTotal* 100;
beltTax1 = paSalesTax * beltTotal* 100;
int pantsTax2 = (int) pantsTax1;
int shirtsTax2 = (int) shirtsTax1;
int beltTax2 = (int) beltTax1;
// convert taxes to two decimal places
double pantsTax, shirtsTax, beltTax;
pantsTax = (double)pantsTax2/100;
shirtsTax = (double)shirtsTax2/100;
beltTax =  (double) beltTax2/100;
System.out.println("Sales tax charged on pants is  $" + pantsTax);
System.out.println("Sales tax charged on shirts is  $" + shirtsTax);
System.out.println("Sales tax charged on belts is  $" + beltTax);
// find total purchase cost before tax
double pretaxTotal;
pretaxTotal = pantsTotal + shirtsTotal + beltTotal;
System.out.println("The total cost of goods before sales tax is  $"+ pretaxTotal);
// Calculate total sales tax
double taxTotal;
taxTotal = pantsTax + shirtsTax + beltTax;
System.out.println("The total tax for all the items is  $"+ taxTotal);
// calculate total cost of transaction including tax
double transactionTotal;
transactionTotal = pretaxTotal + taxTotal;
System.out.println("The total price of the transaction is  $" + transactionTotal);
 }
    }