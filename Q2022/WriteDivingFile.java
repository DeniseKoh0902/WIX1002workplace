/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2022;

/**
 *
 * @author Asus
 */
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
public class WriteDivingFile {
    public static void main(String[] args) {
        try{
            PrintWriter out=new PrintWriter(new FileOutputStream("diving.txt"));
            out.println("James Wong");
            out.println("New Zealand");
            out.println("5.5 6.0 5.5 5.0 5.5 6.5 5.0 2.8");
            out.println("6.5 7.0 5.5 7.0 5.5 6.5 6.0 2.4");
            out.println("4.5 4.0 4.5 4.0 4.5 4.5 4.0 3.1");
            out.println("Xiao Wong");
            out.println("China");
            out.println("7.5 8.0 8.5 8.0 7.5 8.5 8.0 2.6");
            out.println("6.5 7.0 5.5 7.0 5.5 6.5 6.0 3.0");
            out.println("8.5 8.0 8.0 8.0 9.0 9.0 8.5 2.8");
            out.println("Gojo");
            out.println("Japan");
            Random r=new Random();
            
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<3;j++){
                for(int i=0;i<7;i++){
                    double random=r.nextDouble(10-5)+5;
                    sb.append(String.format("%.1f",random)).append(" ");
                }
                double randomRate=r.nextDouble(5-2)+2;
                sb.append(String.format("%.1f",randomRate));
                sb.append("\n");
            }
            
            out.println(sb);
            out.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
    }
}
