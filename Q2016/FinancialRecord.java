/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2016;

/**
 *
 * @author Asus
 */

public class FinancialRecord {
    private int id;
    private double balance,annualInterestRate;
    
    public FinancialRecord(){
        id=0;
        balance=0.0;
        annualInterestRate=0.0;
    }
    
    public FinancialRecord(int id,double initialbalance){
        this.id=id;
        this.balance=initialbalance;
        this.annualInterestRate=0.0;
    }
    
    //mutator
    public void setId(int id){
        this.id=id;
    }
    
    public void setBalance(double balance){
        this.balance=balance;
    }
    
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
    
    //accessor
    public int getId(){
        return id;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate/12.0;
    }
    
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient fund. Withdrawal not allowed");
        }else{
            balance-=amount;
            System.out.println("Previous balance: RM"+(balance+amount));
            System.out.println("Currrent balance after withdrawal of RM"+amount+" is: RM"+balance);
        }
    }
    
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Previous balance: RM"+(balance-amount));
        System.out.println("Current balance after deposit of RM"+amount+" is: RM"+balance);
    }
    
    public void displayRecordInfo(){
        System.out.println("Financial record id is: "+id);
        System.out.println("Financial record balance is: RM"+balance);
        System.out.println("Annual interest rate is: "+annualInterestRate);
        
    }
}
