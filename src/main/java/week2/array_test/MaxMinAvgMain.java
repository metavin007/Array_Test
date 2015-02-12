
package week2.array_test;

import java.util.Scanner;

public class MaxMinAvgMain 
{
    public static void main(String[] args) 
    {
        int[] Input;
        Scanner scan = new Scanner(System.in);
        Input = new int[5];
        for (int i=0 ; i < 5 ; i++)
        {
            System.out.print("Input" + (i+1) + " = ");
            Input[i] = scan.nextInt();
        }
        MaxMinAvg And = new MaxMinAvg();
        int max = And.getmax(Input);
        int min = And.getmin(Input);
        float avg = And.getavg(Input);
        System.out.println(" Min Input is = " + min);
        System.out.println(" Max Input is = " + max);
        System.out.println(" Avg Input is = " + avg);
    }
    
}
