/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2019_2;

/**
 *
 * @author Asus
 */

public class Q1_2019_2 {
    public static void main(String[] args) {
        int[]num={66,15,20,27,74,33};
        int cnt=0;
        for(int k=0;k<num.length;k++){
            if(isEven(num[k]))
                cnt++;
        }
        System.out.println("The number of even integers is "+cnt);
        System.out.println("The biggest integer is "+findMax(num));
    }
    
    public static boolean isEven(int a){
        return a%2==0;
    }
    
    public static int findMax(int[]a){
        int max=a[0];
        for(int n=0;n<a.length;n++){
            if(a[n]>max)
                max=a[n]; 
        }
        return max;
    }
}
