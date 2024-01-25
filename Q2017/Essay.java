/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2017;

/**
 *
 * @author Asus
 */
public class Essay extends GradedActivity{
    private int grammar;
    private int spelling;
    private int length;
    private int content;
    
    public Essay(int grammar,int spelling,int length,int content){
        this.grammar=grammar;
        this.spelling=spelling;
        this.length=length;
        this.content=content;
        
        // Calculate the total score and set it using the setScore method from the parent clas
        setScore(grammar+spelling+length+content);
    }
    
    public String toString(){
        return "Grammer: "+grammar+" marks (maximum)\n"+
               "Spelling: "+spelling+" marks (maximum)\n"+
               "Length: "+length+ " marks (maximum)\n"+
               "Content: "+content+" marks (maximum)";
    }
    
}
