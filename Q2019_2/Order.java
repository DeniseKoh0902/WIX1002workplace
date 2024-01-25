/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2019_2;

/**
 *
 * @author Asus
 */
public class Order {
    protected String name,id;
    protected int quantity;
    protected double unitPrice;
    
    public Order(){
        this.name=null;
        this.id=null;
        this.quantity=0;
        this.unitPrice=0.0;
    }
    
    public Order(String name,String id,int quantity,double unitPrice){
        this.name=name;
        this.id=id;
        this.quantity=quantity;
        this.unitPrice=unitPrice;
    }

    //accessor
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
    
    //mutator

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public double computeTotalPrice(){
        double totalPrice=quantity*unitPrice;
        return totalPrice;
    }
    
    public String toString(){
        return "\nOrder record\nCustomer Name: "+name+"\nCustomer Id: "+id
                +"\nQuantity ordered: "+quantity+"\nUnit price: "+unitPrice+
                "\nTotal Price: "+computeTotalPrice();
    }
}
