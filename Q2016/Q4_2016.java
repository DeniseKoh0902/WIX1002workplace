/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2016;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Q4_2016 {
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n for a regular polygon, n: ");
        int n=sc.nextInt();
        System.out.print("Enter the length of a particular side of the regular polygon(in meter),s: ");
        double s=sc.nextDouble();
        
        System.out.printf("The area is: %.2f squared meters.",area(n,s));
    }
    
    public static double area(int n,double s){
        double area=0;
        area = (n * s * s) / (4 * Math.tan(Math.toRadians(180.0 / n)));//
        return area;
    }
}
