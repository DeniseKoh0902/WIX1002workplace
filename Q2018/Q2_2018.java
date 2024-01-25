/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2018;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
import java.util.Random;
public class Q2_2018 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.print("Enter N number: ");
        int N=sc.nextInt();
        
        //generate random number
        int[]random=new int[N];
        for(int i=0;i<N;i++){
            random[i]=r.nextInt(150-50+1)+50;
        }
        
        //print the random numbers
        System.out.print("The random numbers are: ");
        for(int arr:random){
            System.out.print(arr+" ");
        }
        
        int countAAA=0,countAA=0,countA=0;
        for(int i=0;i<N;i++){
            if(random[i]%10==0||random[i]%10==1||random[i]%10==2||random[i]%10==3)
                countAAA++;
            else if(random[i]%10==4||random[i]%10==5||random[i]%10==6)
                countAA++;
            else
                countA++;
        }
        System.out.println();
        System.out.println("Group AAA: "+countAAA);
        System.out.println("Group AA: "+countAA);
        System.out.println("Group A: "+countA);
    }
    
    
}
