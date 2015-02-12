
package week2.array_test;

import java.util.Arrays;

public class Test5 
{

    public static void main(String[] args) 
    {
        int num[] ={22,55,11,44,99,88};
        for (int i=0 ; i<num.length; i++)
        {
            System.out.println(num[i]);
        }
            Arrays.fill(num,1);
            System.out.println(" Array fill");
            for (int i=0 ; i<num.length; i++)
            {
                System.out.println(num [i]);
            }
        }
    }
    

