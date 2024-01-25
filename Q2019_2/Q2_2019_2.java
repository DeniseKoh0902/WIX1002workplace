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
public class Q2_2019_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number of bags sold: ");
        int numberOfBags=sc.nextInt();
        System.out.print("Enter the weight per bag (kilogram): ");
        double unitWeight=sc.nextDouble();
        
        double totalPrice,totalPriceWithTax;
        totalPrice=unitWeight*numberOfBags*5.99;
        totalPriceWithTax=totalPrice+totalPrice*0.0725;
        
        System.out.println("Price per kilogram:\t$5.99");
        System.out.println("Sales tax:\t\t7.25%");
        System.out.printf("Total price:\t\t$%.2f\n",totalPriceWithTax);
    }
}
