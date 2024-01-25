/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2019_2;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class Q6_2019_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name=sc.nextLine();
        System.out.print("Enter customer id: ");
        String id=sc.nextLine();
        System.out.print("Enter quantity ordered: ");
        int quantity=sc.nextInt();
        System.out.print("Enter price per unit: ");
        double unitPrice=sc.nextDouble();
        
        Order or1=new Order(name,id,quantity,unitPrice);
        ShippedOrder or2=new ShippedOrder(name,id,quantity,unitPrice);
        System.out.println(or1.toString());
        System.out.println(or2.toString());
    }
}
