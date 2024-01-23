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
public class Q2_2016 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num=sc.nextInt();
        
        sum+=num/1000;
        num%=1000;
        sum+=num/100;
        num%=100;
        sum+=num/10;
        num%=10;
        sum+=num;
        System.out.println("The sum of the digits is "+sum);
        
    }
    

}
