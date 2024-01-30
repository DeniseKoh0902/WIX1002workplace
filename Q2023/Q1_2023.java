/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2023;

/**
 *
 * @author Asus
 */
import java.util.Random;
public class Q1_2023 {
    public static void main(String[] args) {
        Random r=new Random();
        final int MIN=1000;
        
        System.out.print("Generated number: ");
        int num=r.nextInt();
        while(num<MIN){
            num=r.nextInt();
            if(num>MIN){
                break;
            }  
        }
        System.out.print(num);
        String num2=String.valueOf(num);
        
        System.out.print("\nNumber in reverse order: ");
        for(int i=num2.length()-1;i>=0;i--){
            System.out.print(num2.charAt(i));
        }
        
        int sum=0;
        System.out.print("\nThe sum of all integers: ");
        for(int i=0;i<num2.length();i++){
            int digit=Character.getNumericValue(num2.charAt(i));
            sum+=digit;
        }
        System.out.print(sum);
        System.out.println("");
    }
}
