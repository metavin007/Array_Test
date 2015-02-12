
package week2.array_test;


public class Foreachloop 
{
    public static void main(String[] args) 
    {
     double[] score = {18.5,40.25,30.75};
        System.out.println("================ Score data ==================");
        for(double ArrayS:score)
        {
        System.out.printf("คะแนน %.2f คิดเป็น %.1f %% \n",ArrayS,(ArrayS/50*100));
        }
        System.out.println("==============================================");
    }
    
}
