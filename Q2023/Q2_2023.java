/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2023;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class Q2_2023 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int N=sc.nextInt();
        while(N>10||N<0){
            System.out.println("Error!!!");
            System.out.print("Enter the number of students: ");
            N=sc.nextInt();
            if(N>=0&&N<=10){
                break;
            }
        }
        int[][]studentsMarks=new int[N][];
        for(int i=1;i<=N;i++){
            System.out.print("Enter the number of subjects for student "+i+":");
            int subject=sc.nextInt();
            while(subject>10||subject<0){
                System.out.println("Error!!!");
                System.out.print("Enter the number of subjects for student:");
                subject=sc.nextInt();
                if(subject>=0&&subject<=10){
                    break;
                }
            }
            
            int []mark=new int[subject];
            for(int j=0;j<subject;j++){
                System.out.print("Student ("+i+") Enter mark for Subject "+(j+1)+": ");
                mark[j]=sc.nextInt();
                while(mark[j]>100||mark[j]<0){
                    System.out.println("Error!!!");
                    mark[j]=sc.nextInt();
                    if(mark[j]>=0&&mark[j]<=100){
                        break;
                    }
                }
                
            }
            
            studentsMarks[i-1]=mark;
        }
        
        int ave;
        int max=0;
        int highStudent=0;
        System.out.println("List of Students ("+N+" students) ");
        for(int i=0;i<studentsMarks.length;i++){
            System.out.println("Student "+(i+1));
            int total=0;
            for(int j=0;j<studentsMarks[i].length;j++){
                System.out.println("Subject "+(j+1)+":"+studentsMarks[i][j]);
                total+=studentsMarks[i][j];
                
                }
            
            ave=total/studentsMarks[i].length;
            System.out.println("Average Marks: "+ave);
                if(ave>max){
                    max=ave;
                    highStudent=i+1;
                }
        }
        System.out.println("Student "+highStudent+" has the highest average, with "+max+" marks");
        
    }
    
    
}
