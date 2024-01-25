/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2018;

/**
 *
 * @author Asus
 */
public abstract class Fruit {
    protected String name;
    protected String type;
    
    public Fruit(String name,String type){
        this.name=name;
        this.type=type;
    }
    
    public abstract double totalPrice();
    
    public String toString(){
        return type+" "+name;
    }
}
