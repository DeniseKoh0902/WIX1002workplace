/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2017;


import java.util.Scanner;
//Filename:Q1.java
public class GraphsTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1=0,number2=0,number3=0,number4=0,number5=0;
        int inputNumber;//number entered by user
        int value=0;//number of stars to print
        int counter=1;//counter for current number
        while(counter<=5){
            System.out.print("Enter number: ");
            inputNumber=input.nextInt();
            //define appropriate num if input is between 1-30
            if(inputNumber>=1&&inputNumber<=30){
                switch(inputNumber){
                    case 1:
                        number1=inputNumber;
                        break;
                    case 2:
                        number2=inputNumber;
                        break;
                    case 3:
                        number3=inputNumber;
                        break;
                    case 4:
                        number4=inputNumber;
                        break;
                    case 5:
                        number5=inputNumber;
                        break;
//                    default:
//                        break;
                }
                counter++;
            }else{//end if
                System.out.println("Invalid Input\nNumber should be between 1 and 30");
            }
        }//end while
        //print histograms
        for (counter=1;counter<=5;counter++){
            switch(counter){
                case 1:
                        value=number1;
                        break;
                    case 2:
                        value=number2;
                        break;
                    case 3:
                        value=number3;
                        break;
                    case 4:
                        value=number4;
                        break;
                    case 5:
                        value=number5;
                        break;
            }//switch
            for (int j=1;j<=value;j++){
                System.out.print("*");
            }
            System.out.println();
        }//end for loop
    }//end main
}//end class Graphs
