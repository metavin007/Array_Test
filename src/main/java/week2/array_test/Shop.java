
package week2.array_test;

import java.util.Arrays;
import java.util.Scanner;

public class Shop 
{
    public String[] name; double[] price; int idx;
    public void setdata()
    {
        name = new String[5];         price = new double[5];
        name[0] = "COKE";             price[0] = 15;
        name[1] = "PATA";             price[1] = 13;
        name[2] = "PEPSI";            price[2] = 18;
        name[3] = "TEA";              price[3] = 5;
        name[4] = "WIWI";             price[4] = 6;
    }
    public void showdata()
    {
        System.out.println("Shop name : " + " จสินทร์ แสงทรวง");
        System.out.println("========================================");
        System.out.println("name \t : " + " \t price");
        System.out.println("========================================");
        for (int i=0 ; i<5 ; i++)
        {
            System.out.println(name[i]+"\t\t  "+price[i]);  
        }
        System.out.println("========================================");
    }
    public void getdata()
    {
        
        Scanner scan = new Scanner(System.in);
        
        do {
        System.out.print("ชื่อสินค้า : ");
        String n = scan.nextLine();
        idx = Arrays.binarySearch(name,n);
            if(idx < 0)
            {
                System.out.println("รายการนี้ร้านนี้ไม่มีขายมึงมั่ว ");
            }} while (idx < 0);
            
                System.out.print("จำนวน :");
                int x = scan.nextInt();
                System.out.println("========================================");
                System.out.println("ทั้งหมด " + name[idx] +" " + x + "จำนวน รวมเป็นเงิน : " + x*price[idx] + "บาท");
                System.out.println("========================================");   
    }
}
