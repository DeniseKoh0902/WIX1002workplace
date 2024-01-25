/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2017;

/**
 *
 * @author Asus
 */
public class Complex {
    double real;
    double imaginary;
    
    //no-argument constructor
    public Complex(){
        real=0.0;
        imaginary=0.0;
    }
    
    //constructor with arguments
    public Complex(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    
    public void addComplexNum(double[]r,double[]i){
        for(int j=0;j<2;j++){
            this.real+=r[j];
            this.imaginary+=i[j];
        }
        // Convert the result to int by rounding and removing the decimal part
        this.real = (int) Math.round(this.real);
        this.imaginary = (int) Math.round(this.imaginary);
    }
    
    public void subtractComplexNum(double[]r,double[]i){
        for(int j=0;j<2;j++){
            this.real+=r[j];
            this.imaginary+=i[j];
        }
    }
    
    public String toString(){
        return "("+(int)this.real+"+"+(int)this.imaginary+"i)";
    }
}
