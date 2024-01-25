/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2017;

/**
 *
 * @author Asus
 */
public class GradedActivity {
    int score;
    
    
    public void setScore(int score){
        this.score=score;
    }
    
    public double getScore(){
        return score;
    }
    
    public char getGrade(int score){
        if(score>=90)
            return 'A';
        else if(score>=80)
            return 'B';
        else if(score>=70)
            return 'C';
        else if(score>=60)
            return 'D';
        else
            return 'F';
    }
    
    public String toString(int score){
        return "Total score: "+getScore()+"\nEssay grade: "+getGrade(score);
    }
}
