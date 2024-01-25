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

public class Q3_2018 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter font size: ");
        int size=sc.nextInt();
        System.out.print("Enter font type: ");
        char type=sc.next().charAt(0);
        System.out.print("Enter format [1-Vertical,2-Horizontal]: ");
        int format=sc.nextInt();
        
        display(size,type,format);
    }
    
    public static void display(int size,char type,int format){
        if(format==1){
            for(int i=0;i<(2*size)+3;i++){
                if(i==0||i==((2*size)+3)/2||i==(2*size)+3-1){
                    for(int j=0;j<size+2;j++){
                        System.out.print(type);
                    }
                }else{
                    System.out.print(type);
                    for(int j=0;j<size;j++){
                        System.out.print(" ");
                    }
                    System.out.print(type);
                }
                System.out.println();
            }
        }else if(format==2){
            for(int i=0;i<size+2;i++){
                if(i==0||i==(size+2)-1){
                    for(int j=0;j<(2*size)+3;j++){
                        System.out.print(type);
                    }
                }else{
                    System.out.print(type);
                    for(int j=0;j<size;j++){
                        System.out.print(" ");
                    }
                    System.out.print(type);
                    for(int j=0;j<size;j++){
                        System.out.print(" ");
                    }
                    System.out.print(type);
                }
                System.out.println();
            }
        }else{
            System.out.println("Invalid format.");
        }
    }
    
}
