/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjstrategy;

/**
 *
 * @author u-mdp
 */
public class CreditCard implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Pembayaran "+amount+" dengan kartu kredit");
    }
    
}
