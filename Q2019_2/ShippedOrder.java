/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2019_2;

/**
 *
 * @author Asus
 */
public class ShippedOrder extends Order{

    public ShippedOrder(String name,String id,int quantity,double unitPrice) {
        super(name,id,quantity,unitPrice);
    }
    
    public double computeTotalPrice(){
        double totalPrice=quantity*unitPrice+4;
        return totalPrice;
    }
    
    public String toString(){
        return "\nShipped\nOrder record\nCustomer Name: "+name+"\nCustomer Id: "+id
                +"\nQuantity ordered: "+quantity+"\nUnit price: "+unitPrice+
                "\nTotal Price: "+computeTotalPrice();
    }
}
