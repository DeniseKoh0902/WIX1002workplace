/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2019;

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

public class Q4_2019 {
    public static void main(String[] args) {
       readEssay();
       calculateSentence();
    }
    
    public static void writeEssay(){
        try{
            PrintWriter out=new PrintWriter(new FileOutputStream("myAmbition.txt"));
            Scanner sc=new Scanner(System.in);
            String essay=sc.nextLine();
            out.println(essay);
            out.close();
        }catch(IOException e){
            System.out.println("Problem with file output.");
        }
    }
    
    public static void readEssay(){
        try{
            Scanner in=new Scanner(new FileInputStream("myAmbition.txt"));
            while(in.hasNextLine()){
                System.out.println(in.nextLine());
            }
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
    }
    
    public static void calculateSentence(){
        
        try{
            Scanner in=new Scanner(new FileInputStream("myAmbition.txt"));
            int sentence=0,word=1;
            int[]frequency=new int[26];
            String[]words;
//            //skip first line
//            if(in.hasNextLine()){
//                in.nextLine();
//            }
            //read from second line
            while(in.hasNextLine()){
                String p=in.nextLine();
                for (int i=0;i<p.length();i++){
                    char a=p.charAt(i);
                    if (a=='.')
                        sentence++;
                    if (a==' ')
                        word++;
                    if (Character.isLetter(a)) {
                            frequency[Character.toUpperCase(a) - 'A']++;
                        }
                }
                    
                
                System.out.println("Number of sentences: "+sentence);
                System.out.println("Number of words: "+word);
                
                for(int i=0;i<frequency.length;i++){
                    System.out.print((char)(i+'A')+": "+frequency[i]+"  ");
                }
            }
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
    }
    
  
}
