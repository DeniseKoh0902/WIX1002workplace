/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2019_2;

/**
 *
 * @author Asus
 */
public class quadraticEquation {
    private int a,b,c;
    
    public quadraticEquation(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public int Discriminant(){
        int discriminant=b*b-4*a*c;
        return discriminant;
    }
    
    public double calcRoot1(){
        double r1;
        if (Discriminant()>=0){
            r1=((-1*b)+Math.sqrt(Discriminant()))/(2*a);
        }else
            r1=0;
        return r1;
    }
    
    public double calcRoot2(){
        double r2;
        if (Discriminant()>=0)
            r2=((-1*b)-Math.sqrt(Discriminant()))/(2*a);
        else
            r2=0;
        return r2;
    }
}
