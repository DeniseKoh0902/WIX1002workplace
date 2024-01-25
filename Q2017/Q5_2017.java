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
public class Q5_2017 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        int grammar=sc.nextInt();
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        int spelling=sc.nextInt();
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        int length=sc.nextInt();
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        int content=sc.nextInt();
        
        Essay e=new Essay(grammar,spelling,length,content);
        GradedActivity g=new GradedActivity();
        System.out.println();
        System.out.println("Essay score:"+e.toString());
        
        System.out.println();
        System.out.println(e.toString((int)e.getScore()));
    }
}
