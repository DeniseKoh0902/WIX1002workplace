/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2018;

/**
 *
 * @author Asus
 */
public class Apple extends Fruit{
    private int quantity;

    public Apple(String name, String type,int quantity) {
        super(name, type);
        this.quantity=quantity;
    }

    
    public double totalPrice() {
        double priceperApple=0.0;
        if(type.equalsIgnoreCase("Green")){
            priceperApple=1.20;
        }else if(type.equalsIgnoreCase("Red")){
            priceperApple=1.80;
        }else
            System.out.println("Invalid type of apple.");;
        return priceperApple*quantity;
    }
    
    public String toString(){
        return type+" "+name+" - "+quantity+" = RM"+totalPrice();
    }
    
}
