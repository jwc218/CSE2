//////////////////////////////////////////////////////////////////
//John Marc Charpentier
//   hw 12
//   4/18/2016
//    11:10-12 lab
import java.util.Scanner;
import java.util.Random;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
  //randomInput
public static int [] randomInput(){
	// intiate random generator
	Random rand = new Random();
	// declare array length
int [] array= new int[10];
// assign random vals between 0 and 9
for(int i=0;i<array.length;i++){
 array[i]= rand.nextInt(10);
}
return array;
}// end of randomInput method
// delete
public static int [] delete(int array[], int position){
	// shrink size of array
	int [] modifiedArray= new int[array.length-1];
	for(int i=0; i<array.length-1;i++){
		// shift numbers up after position
		if(i>=position){
			modifiedArray[i]= array[i+1];
		}
		// numbers before that position remain the same
		else{
			modifiedArray[i]= array[i];
		}
	}
	return modifiedArray;
}// end of delete method
// remove
public static int [] remove(int array[], int match){
	int count=0;
	for(int i=0; i<array.length;i++){
		if (array[i]==match){
			count++;
		}
	}
	int var;
	System.out.println(count);
	int counter=0;
	int [] modifiedArray= new int[10-count];
	for(int k=0;k<10-count;k++){
		System.out.print(k+"   "+ counter+"  ");
	    if(array[k]==match && counter<count){
	    	counter++;
	    	if(k>0 && array[k]==array[k-1]){
	    		counter--;
	    	}
	    	else if(array[k]==array[k+1]){
	          counter++;
	            if(array[k]==array[k+2]){
	        	counter++;
	        }
	    	}
	          while(counter<count && array[k+counter]==match){
	       counter--;
	        }
	        while(counter>count){
	        	counter--;
	        }
	    	modifiedArray[k]=array[k+counter];
	    	}
	       else{
	       	if(counter>0){
	            while (counter<count && array[k+counter]==match){
	        counter++;
	        }
	        while(counter>count){
	        counter--;
	        }
	    	modifiedArray[k]=array[k+counter];
	         }
	         else{
	         modifiedArray[k]= array[k];	
	         }
	       }
	       if(k==9-count && array[9]==match){
	       	modifiedArray[k]=array[8];
	       }
       System.out.println(counter);
	}
return modifiedArray;
}// end of remove program
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }// end of main method
}// end of class