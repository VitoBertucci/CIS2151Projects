import java.util.StringTokenizer;
import java.util.Scanner;

public class project
{
   public static void main(String[] args) 
   {
      Scanner kb = new Scanner(System.in);
      String input = "";
      int[] ary = new int[5];
      
      System.out.println("Enter input numbers");
      input = kb.nextLine();
      
      StringTokenizer tokens = new StringTokenizer(input, (", "));
      
      int i = 0;
      
      while(tokens.hasMoreTokens()) 
      {
      
         try 
         {
            ary[i] = Integer.parseInt(tokens.nextToken());
            i++;
         } catch(ArrayIndexOutOfBoundsException e)
      
         {
            System.out.println(e.toString());
         }
         
      }
      
      
      
      
      
      for(int x = 0; x < 5; x++)
      {
         System.out.print(ary[x] + " ");
      }
   }
}
