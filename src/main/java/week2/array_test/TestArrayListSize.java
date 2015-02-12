
package week2.array_test;

import java.util.ArrayList;


public class TestArrayListSize
{

    public static void main(String[] args) 
    {
       ArrayList num = new ArrayList();
       for(int i=0;i<6;i++)
       {
           num.add(i);
       }
        num.add(1,20);
        num.remove(3);
       System.out.println("total number of num = " + num.size() + " are ");
       for(int i=0;i<num.size();i++)
       {
           System.out.print(num.get(i) + " ");
       }
       
    }
    
}
