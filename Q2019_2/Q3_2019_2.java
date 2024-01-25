/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2019_2;

/**
 *
 * @author Asus
 */
import java.util.Random;
import java.util.Scanner;
public class Q3_2019_2 {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        char another='y';
        do{
            int num1=r.nextInt(10);
            int num2=r.nextInt(10);
            System.out.print("\nWhat is "+num1+"+"+num2+"? "); 
            int ans=sc.nextInt();
            int total=num1+num2;
            if (ans==total){
                System.out.println(num1+"+"+num2+"="+ans+" is true");
            }else
                System.out.println(num1+"+"+num2+"="+ans+" is false");
            System.out.print("Do you want to try another question (y/n)?: ");
            another=sc.next().charAt(0);
            
        }while(another!='n');
            System.out.println("Program ends");
    }
}
