/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2017;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class Q2_2017 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the initial tuition fee (i.e year 1): ");
        double tuitionFee=sc.nextInt();
        System.out.print("Enter the yearly rate of increment (e.g enter 5.2 for 5.2%): ");
        double rate=sc.nextDouble();
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        int year=sc.nextInt();
        
        System.out.printf("\nComputed tuition fee for year " +year+" is: %.2f",computeFee(tuitionFee,rate,year));
        System.out.println();
    }
    //Financial application
    private static double computeFee(double t,double r,int y){
        for(int i=1;i<y;i++){
            t+=t*(r/100);
        }
        return t;
    }
    
}
