
package week2.array_test;

import java.util.Scanner;

public class Test2miti 
{

    public static void main(String[] args) 
    {
        int[][] Input1;
        int[] Input2;
        int i,j,total = 0;
        Input1 = new int[2][4];
        Input2 = new int[2];
        Scanner scan = new Scanner(System.in);
        
        for (i=0;i<2;i++)
        {
            System.out.println("Enter total student in Faculty "+(i+1));
            Input2[i] = 0;
            for(j=0;j<4;j++)
            {
                System.out.print("year " + (j+1) + " = ");
                Input1[i][j] = scan.nextInt();
                Input2[i] = Input2[i] + Input1[i][j]; 
            }
            System.out.println("student in Faculty "+(i+1)+" = "+Input2[i]);
            System.out.println("===========================================");
            total = total + Input2[i];
        }
        
        System.out.println("total students = " + total);
    }
    
}
