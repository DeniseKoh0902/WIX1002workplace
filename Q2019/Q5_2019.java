/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2019;

/**
 *
 * @author Asus
 */
public class Q5_2019 {
    public static void main(String[] args) {
        SpecialDelivery sd=new SpecialDelivery("Ali","Ahmad",4.4,false,false);
        SpecialDelivery sd1=new SpecialDelivery("Ah Chong","Fatimah",63.1,false,false);
        SpecialDelivery sd2=new SpecialDelivery("FSKTM, UM","FK,UM",32.5,true,false);
        SpecialDelivery sd3=new SpecialDelivery("Ang","Liew",19.0,true,true);
        double total=(sd.totalCost()+sd1.totalCost()+sd2.totalCost()+sd3.totalCost());
        System.out.println(sd.toString());
   
        System.out.println(sd1.toString());
        System.out.println(sd2.toString());
        System.out.println(sd3.toString());
        
        
        System.out.printf("\nThe total shipping cost is RM%.2f\n",total);
    }
}
