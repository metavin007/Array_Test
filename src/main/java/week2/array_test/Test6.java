
package week2.array_test;

import java.util.Arrays;

public class Test6 
{

    public static void main(String[] args) 
    {
        int num1[] = {11,22,44,33,99,66,77,88,00};
        int num2[] = {11,22,44,33,99,66,77,88,00};
        System.out.println("Array num1 equals to Array num2 is = " + Arrays.equals(num1, num2));
        Arrays.sort(num1);
        System.out.println("Array num1 equals to Array num2 is = " + Arrays.equals(num1, num2));
    }
    
}
