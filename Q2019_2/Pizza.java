/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2019_2;

/**
 *
 * @author Asus
 */
public class Pizza {
    private String size;
    private int numOfCheeseTopping, numOfBeefTopping, numOfChickenTopping;
    
    public Pizza(){
        this.size=null;
        this.numOfCheeseTopping=0;
        this.numOfBeefTopping=0;
        this.numOfChickenTopping=0;
    }
    
    public Pizza(String size,int numOfCheeseTopping,int numOfBeefTopping,int numOfChickenTopping){
        this.size=size;
        this.numOfCheeseTopping=numOfCheeseTopping;
        this.numOfBeefTopping=numOfBeefTopping;
        this.numOfChickenTopping=numOfChickenTopping;
    }

    //accessors
    public String getSize() {
        return size;
    }
    
    public int getNumOfCheeseTopping() {
        return numOfCheeseTopping;
    }
    
    public int getNumOfBeefTopping() {
        return numOfBeefTopping;
    }
    
    public int getNumOfChickenTopping() {
        return numOfChickenTopping;
    }

    //mutators
    public void setSize(String size) {
        this.size = size;
    }

    public void setNumOfCheeseTopping(int numOfCheeseTopping) {
        this.numOfCheeseTopping = numOfCheeseTopping;
    }

    public void setNumOfBeefTopping(int numOfBeefTopping) {
        this.numOfBeefTopping = numOfBeefTopping;
    }

    public void setNumOfChickenTopping(int numOfChickenTopping) {
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    public double computeCost(){
        int cost=0;
        if(size.equalsIgnoreCase("Small")){
            cost=10+2*(numOfCheeseTopping+numOfBeefTopping+numOfChickenTopping);
        }else if(size.equalsIgnoreCase("Medium")){
            cost=12+2*(numOfCheeseTopping+numOfBeefTopping+numOfChickenTopping);
        }else if(size.equalsIgnoreCase("Large")){
            cost=14+2*(numOfCheeseTopping+numOfBeefTopping+numOfChickenTopping);
        }else{
            System.out.println("Invalid size");
        }  
        return cost;    
    }
    
    public void display(){
        System.out.println("Pizza size: "+size);
        System.out.println("Quantity of Cheese Topping: "+this.numOfCheeseTopping);
        System.out.println("Quantity of Beef Topping: "+this.numOfBeefTopping);
        System.out.println("Quantity of Chicken Topping: "+this.numOfChickenTopping);
        System.out.println("Cost: RM"+computeCost());
    }
}
