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
public class Q4_2017 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("First complex number. Enter a number for the real part: ");
        double a=sc.nextInt();
        System.out.print("First complex number. Enter a number for the imaginary part: ");
        double b=sc.nextInt();
        System.out.print("Second complex number. Enter a number for the real part: ");
        double c=sc.nextInt();
        System.out.print("Second complex number. Enter a number for the imaginary part: ");
        double d=sc.nextInt();
        
        System.out.println();
        
        double[]real={a,c};
        double[]imaginary={b,d};
        
        Complex com=new Complex();
        System.out.println("First complex number: ("+a+"+"+b+"i)");
        System.out.println("Second complex number: ("+c+"+"+d+"i)");
        //or
        System.out.println("First complex number: ( " + real[0] + "+" + imaginary[0] + "i)");
        System.out.println("Second complex number: (" + real[1] + "+" + imaginary[1] + "i)");
        //if want to convert double values to int
        int intA = (int) a;
        int intB = (int) b;
        int intC = (int) c;
        int intD = (int) d;
        System.out.println("First complex number: (" + intA + "+" + intB + "i)");
        System.out.println("Second complex number: (" + intC + "+" + intD + "i)");

        
        com.addComplexNum(real, imaginary);
        System.out.println("Addition of the two complex number:"+com.toString());
        com.subtractComplexNum(real, imaginary);
        System.out.println("Subtraction of the two complex number:"+com.toString());
        
        
       
    
    }
}
