
package week2.array_test;

import java.util.Arrays;

public class MaxMinAvg 
{
   public int getmax(int[] s)
   {
       Arrays.sort(s);
       int max = s[s.length - 1];
       return max;
   }
    public int getmin(int[] s)
   {
       Arrays.sort(s);
       int min = s[0];
       return min;
   }
     public float getavg(int[] s)
   {
       float sum = 0.0f;
       float avg = 0;
       for (int i = 0 ; i<s.length ; i++)
       {
           sum = sum + s[i];
           avg = sum / s.length;
       }
       return avg;
    }
}
