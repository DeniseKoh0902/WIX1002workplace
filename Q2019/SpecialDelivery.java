/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2019;

/**
 *
 * @author Asus
 */
public class SpecialDelivery extends Delivery{
    protected boolean weekendDelivery;
    protected boolean nighttimeDelivery;

    public SpecialDelivery(String sender,String recipient,double weight,boolean weekendDelivery,boolean nighttimeDelivery) {
        super(sender,recipient,weight);
        this.weekendDelivery=weekendDelivery;
        this.nighttimeDelivery=nighttimeDelivery;
    }

    @Override
    public double totalCost() {
        double totalshippingcost;
        if(weekendDelivery==true && nighttimeDelivery!=true){
            totalshippingcost=super.totalCost()+50;
        }
        else if(nighttimeDelivery==true && weekendDelivery!=true){
            totalshippingcost=super.totalCost()*120/100;
        }else if(weekendDelivery==true && nighttimeDelivery==true){
            totalshippingcost=(super.totalCost()+50)*120/100;
        }else
            totalshippingcost=super.totalCost();
        return totalshippingcost;
    }

    @Override
    public String toString() {
       String temp="\nFrom : "+this.sender+" To: "+this.recipient+
                    "\nWeight of Package : "+this.weight+" kg"+
                    "\nShipping Cost : RM"+ this.totalCost();
        if(weekendDelivery){
            temp+="\nWeekend Delivery";
        }
        if(nighttimeDelivery){
            temp+="\nNight Time Delivery";
        }
        return temp;
    }
    
    
    
}
