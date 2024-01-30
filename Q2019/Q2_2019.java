/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2019;

/**
 *
 * @author Asus
 */
import java.util.Random;
import java.util.Scanner;
public class Q2_2019 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int N=sc.nextInt();

        int[][]arrA=new int[N][N];
        int[][]arrB=new int[N][N];
        
        generateMatrix(arrA);
        generateMatrix(arrB);
        
        System.out.println("Matrix A");        
        display(arrA);
        System.out.println("Matrix B");
        display(arrB);
        
        System.out.println("Matrix A+B");
        addMatrix(arrA,arrB);
        System.out.println("Matrix AxB");
        multiplyMatrix(arrA,arrB);
    }
    
    public static void generateMatrix(int[][]arr){
        Random r=new Random();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=r.nextInt(10);
            }
        }
    }
    
    public static void display(int[][]arr){
        for (int[]row:arr){
            for(int cell:row){
                System.out.print(cell+" ");
            }
            System.out.println(" ");
        }
    }
    
    public static void addMatrix(int[][]arr,int[][]arr2){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print((arr[i][j]+arr2[i][j])+" ");
            }
            System.out.println();
        }
    }
    
    public static void multiplyMatrix(int[][]arr,int[][]arr2){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print((arr[i][j]*arr2[i][j])+" ");
            }
            System.out.println();
        }
    }
}
