/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q2016;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class Q1_2016 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double num=sc.nextDouble();
        double kilo=num*0.454;
        System.out.printf(num+" pounds is %.3f kilograms",kilo);
        System.out.println();
    }
    
}
