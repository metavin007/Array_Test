
package week2.array_test;

import java.util.ArrayList;

public class TestArratListGet 
{

    public static void main(String[] args) 
    {
       ArrayList num= new ArrayList();
       num.add("20");
        System.out.println("object at idx = 0 is " + num.get(0));
        
        String num1 = num.get(0).toString();
        int num2 = Integer.parseInt(num1);
        float num3 = Float.parseFloat(num1);
        System.out.println("String = " + num1);
        System.out.println("Int = " + num2);
        System.out.println("Float = " + num3);
    }
    
}
