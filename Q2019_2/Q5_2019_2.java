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
public class Q5_2019_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter values for a,b and c: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        quadraticEquation qua=new quadraticEquation(a,b,c);
        System.out.println("The equation is: "+a+"x(^2)+("+b+")x+("+c+")");
        System.out.println("Discriminant: "+qua.Discriminant());
        if(qua.calcRoot1()!=qua.calcRoot2()){
            System.out.println("The roots: "+(int)qua.calcRoot1()+" and "+(int)qua.calcRoot2());
        }else if(qua.calcRoot1()==0 && qua.calcRoot2()==0){
            System.out.println("The equation has no roots");
        }else
            System.out.println("Same roots: "+(int)qua.calcRoot1());
    }
}
