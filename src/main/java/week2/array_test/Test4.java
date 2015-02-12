
package week2.array_test;

import java.util.Arrays;

public class Test4 
{

    public static void main(String[] args) 
    {
        int num[] ={22,33,11,44,99,66};
        Arrays.sort(num);
        int idx = Arrays.binarySearch(num,44);
        for (int i =0 ; i < num.length ; i++)
        {
            System.out.println(num[i]);
        }
        System.out.println("found \"22\" at index = " + idx);
    }
    
}
