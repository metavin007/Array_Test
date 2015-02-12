
package week2.array_test;

import java.util.ArrayList;


public class TestArrayListindexOf 
{

    public static void main(String[] args) 
    {
       ArrayList num = new ArrayList();
       for(int i=0;i<5;i++)
       {
           num.add(i*2);
       }
        System.out.println(" total number of num = " + num.size() + " are " );
        for(int i=0;i<num.size();i++)
        {
        System.out.print(num.get(i)+" ");
        }
        int idx1 = num.indexOf(4);
        int idx2 = num.indexOf(5);
        System.out.println("\nเลข 4 อยู่ตำแหน่ง = " + idx1);
        System.out.println("เลข 4 อยู่ตำแหน่ง = " + idx2);
    }
    
}
