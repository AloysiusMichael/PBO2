/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjstrategy;

/**
 *
 * @author u-mdp
 */
public class PrjStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Context context = new Context(new BankTransfer());
       context.payment(50000);
       
       context = new Context(new DebitCard());
       context.payment(600000);
    }
    
}
