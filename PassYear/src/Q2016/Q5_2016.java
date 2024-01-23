/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2016;

/**
 *
 * @author Asus
 */
import java.util.Random;
public class Q5_2016 {
    public static void main(String[] args) {
        int[][]tictac=new int[3][3];
        fillBoardRandomly(tictac);
        printBoard(tictac);
        checkRowAndColumn(tictac);
    }
    
    private static void fillBoardRandomly(int[][]tictac){
        Random r=new Random();
        
        for(int i=0;i<tictac.length;i++){//outlength
            for (int j=0;j<tictac[i].length;j++){//inside length
                tictac[i][j]=r.nextInt(2);//generates random 0 or 1
            }
        }
    }
    
    private static void printBoard(int[][]tictac){
        for(int[]row:tictac){
            for(int cell:row){//内部的增强型 for 循环，它遍历当前行（row）中的每个元素（cell）。
                System.out.print(cell);
            }
            System.out.println();
        }
    }
    
    private static void checkRowAndColumn(int[][]tictac){
        //Check rows
        for(int i=0;i<tictac.length;i++){
            if(checkAllEqual(tictac[i])){
                System.out.println("All "+tictac[i][0]+"s on row "+(i+1));
            }
        }
        
        //Check columns
        for(int i=0;i<tictac[0].length;i++){
            int[]column={tictac[0][i],tictac[1][i],tictac[2][i]};
            if(checkAllEqual(column)){
                System.out.println("All "+column[0]+"s on column "+(i+1));
            }
        }
    }
    
    private static boolean checkAllEqual(int[]array){
        for(int i=1;i<array.length;i++){
            if(array[i]!=array[0]){
                return false;
            }
        }
        return true;
    }
}
