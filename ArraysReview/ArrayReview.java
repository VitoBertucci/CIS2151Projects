public class ArrayReview 
{
   public static void main(String[] args) 
   {
      int [] arry = new int[5];
      int a =2;
      int c =0;
      fill(arry,a);
      for (int j = 0; j < arry.length; j++)
      {
         System.out.println(" "+arry[j]);     
      }
   }
   
   public static void fill (int [] arry, int a )
      {
         for (int k = 0; k < arry.length; k++)
         {
         arry[k] =   k * a ;
         }
      }
}