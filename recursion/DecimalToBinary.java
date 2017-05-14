
import java.util.Scanner;

public class DecimalToBinary {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 100");
        while(in.hasNextInt())
        {
            int a = in.nextInt();
            while(a < 1 || a > 100)
            {
                
                a = in.nextInt();
            }
            printBinary(a);
           
        }
        
    }
    private static void printBinary(int b)
    {
        if(b > 0)
        {
            printBinary(b/2); // using recursion 
            System.out.printf("%d", b%2);
        }

       
    }
    
}
