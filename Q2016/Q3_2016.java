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
public class Q3_2016 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int num=sc.nextInt();
        int n=num;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            /*or
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            */
           for(int j=i;j>=1;j--){
               System.out.print(j);
           }
           for(int j=2;j<=i;j++){
               System.out.print(j);
           }
            System.out.println();
        }       
    }
}
