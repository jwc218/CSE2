public  class prac{
    public static void swapmember(int [] x,int y,int z){
        int temp;
        if(y>=0&& y<x.length&&z>=0&&z<x.length){
         temp=x[y];
         x[y]=x[z];
         x[z]=temp;
         for(int i=0;i<x.length;i++){
             System.out.print(x[i]+", ");
         }
         System.out.println();
        }
        else{
            System.out.println("unnaceptable input");
        }
    }


        


        
        

    public static void main(String[]args){
   int [] x={1,10,3,7,3,5};
   int  y=0;
   int  z=5;
   swapmember(x,y,z);


        
    }
}