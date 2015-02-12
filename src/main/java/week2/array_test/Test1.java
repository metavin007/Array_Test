
package week2.array_test;

import java.util.Scanner;

public class Test1 
{

    public static void main(String[] args) 
    {
        int i ;
        float[] Input;
        float sum=0.0f,avg_Input;
        Input = new float[10];
        Scanner scan = new Scanner(System.in);
        for(i=0;i<10;i++)
     {
         System.out.print("Input [ " + (i+1) + " ] = ");
         Input[i] = scan.nextFloat();
         sum = sum + Input[i];
     }
        avg_Input = (sum / 10);
        System.out.println(" average temperature = " + avg_Input);
    }
    
}
