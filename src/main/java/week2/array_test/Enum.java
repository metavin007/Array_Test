
package week2.array_test;

import java.util.Scanner;


public class Enum 
{
    enum Grade {G,S,U};
    public static void main(String[] args) 
    {
       String msg="Unknown";
       System.out.print("เกรดที่จะให้มี ");
       for (Grade grade : Grade.values())
       {
       System.out.printf("%2s",grade);
       }
       Scanner scan = new Scanner(System.in);
       System.out.print(" \nคุณได้เกรด : ");
       String g = scan.nextLine();
       for (Grade grade:Grade.values())
       {
           if(g.equals(grade.toString()))
           {
               switch (grade)
               {
                   case G : msg = "Good";
                       break;
                   case S : msg = "Satisfy";
                       break;
                   case U : msg = "Unsatisfy";
                       break;
               }
           }
       }
        System.out.println("Your grade is " + g + " = " + msg);
    }
    
}
