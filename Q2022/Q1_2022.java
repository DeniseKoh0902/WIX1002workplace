/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2022;

/**
 *
 * @author Asus
 */
import java.util.Random;

public class Q1_2022 {
    public static void main(String[] args) {
        Random r=new Random();
        double[]price=new double[3];
        int[]years=new int[5];
        
        for(int i=0;i<price.length;i++){
            price[i]=r.nextDouble(300.00-100.00+1.00)+100.00;
        }
        
        for(int i=0;i<years.length;i++){
            years[i]=r.nextInt((2030-1990)/2+1)*2+1990;
        }
        
        //print price
        System.out.print("3 random price values: ");
        for(double print: price){
            System.out.printf("%.2f ",print);
        }
        System.out.println();
        
        //print even years
        System.out.print("5 random even-numbered years: ");
        for(int print: years){
            System.out.print(print+" ");
        }
        System.out.println();
        
        //generate randomLetter for plate number
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<2;i++){
            char randomLetter=(char)(r.nextInt(26)+'A');
            sb.append(randomLetter);
        }
        
        //print car plate number
        System.out.print("Car Plate Number: "+(r.nextInt(100000-10000)+10000)+sb);
        System.out.println();
        
        //generate random word
        //determine the num of the word
        int N=r.nextInt(9);
        StringBuilder s=new StringBuilder();
        for(int i=0;i<N;i++){
            char randomWord=(char)(r.nextInt(26)+'A');
            if(r.nextBoolean()){
                randomWord=Character.toLowerCase(randomWord);
            }
            s.append(randomWord);
        }
        
        //print random word
        System.out.println("Random Word: "+s);
        
    }
  
}
