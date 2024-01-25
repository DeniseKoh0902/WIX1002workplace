/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2017;

/**
 *
 * @author Asus
 */
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Random;
public class Q3_2017 {
    
    public static void main(String[] args) {
        generateString();
        String originalString=readString();
        System.out.println("The string generated is: "+originalString);
        
        //convert the string to char array for sorting
        char[]stringArray=originalString.toCharArray();
        
        //sort in ascending order
        bubbleSort(stringArray,'>');
        String ascArray=new String(stringArray);
        System.out.println("String sorted in ascending order: "+ascArray);
        
        //sort in decending order
        bubbleSort(stringArray,'<');
        String dscArray=new String(stringArray);
        System.out.println("String sorted in descending order: "+dscArray);
        System.out.println("Original string from file: "+originalString);

    }
    
    private static void generateString(){
        try{
            PrintWriter out=new PrintWriter(new FileOutputStream("data.txt"));
            StringBuilder sb=new StringBuilder();
            Random r=new Random();
            
            for (int i=0;i<6;i++){
                char string=(char) ((char)r.nextInt(90-65+1)+65);
                if(r.nextBoolean()){
                    string=Character.toLowerCase(string);
                }
                sb.append(string);
            }
            out.println(sb);
            out.close();
        }catch(IOException e){
            System.out.println("Problem with file output.");
        }
       
    }
    
    private static String readString(){
        StringBuilder sb=new StringBuilder();
        try{
            Scanner in=new Scanner(new FileInputStream("data.txt"));
            while(in.hasNextLine()){
                sb.append(in.nextLine());
            }
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
        return sb.toString();
    }
    
    
    private static void bubbleSort(char[]arr,char mode){
        int n=arr.length;
        for(int pass=1;pass<n;pass++){
            for(int i=0;i<n-1;i++){
                if ((mode == '>' && arr[i] > arr[i + 1]) || (mode == '<' && arr[i] < arr[i + 1])) {
                // swap arr[i] and arr[i+1]
                char hold = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = hold;
            }
            }
        }
    }
}
