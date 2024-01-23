/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2016;

/**
 *
 * @author Asus
 */
public class Q6_2016 {
    public static void main(String[] args) {
        FinancialRecord acc_a=new FinancialRecord(1234,10000.0);
        acc_a.setAnnualInterestRate(7.77);
        
        FinancialRecord acc_b=new FinancialRecord(1001,20000.0);
        acc_b.setAnnualInterestRate(8.0);
        acc_b.setId(1235);
        acc_b.setBalance(20000.0);
        
        System.out.println("The information about financial record A is as follows: ");
        acc_a.displayRecordInfo();
        System.out.println();
        
        System.out.println("The information about financial record B is as follows: ");
        acc_b.displayRecordInfo();
        System.out.println("The monthly interest rate is: "+acc_b.getMonthlyInterestRate());
        acc_b.deposit(1500.0);
        acc_b.withdraw(500.0);
    }
}
