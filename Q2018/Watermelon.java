/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2018;

/**
 *
 * @author Asus
 */
public class Watermelon extends Fruit{
    private double weight;

    public Watermelon(String name, String type,double weight) {
        super(name, type);
        this.weight=weight;
    }

    @Override
    public double totalPrice() {
        double priceperKg=0;
        if(type.equalsIgnoreCase("Local")){
            if(weight<2)
                priceperKg=2.25;
            else if(weight>=2 && weight<=5)
                priceperKg=1.95;
            else 
                priceperKg=1.65;
        }else if(type.equalsIgnoreCase("Imported")){
            if(weight<2)
                priceperKg=3.75;
            else if(weight>=2 && weight<=5)
                priceperKg=3.45;
            else 
                priceperKg=3.15;
        }else
            System.out.println("Invalid type of Watermelon.");
            
        return priceperKg*weight;
    }
    
    public String toString(){
        return type+" "+name+" - "+weight+"kg = RM"+totalPrice();
    }
    
}
