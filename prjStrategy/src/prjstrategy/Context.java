/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjstrategy;

/**
 *
 * @author u-mdp
 */
public class Context {
    private final PaymentStrategy paymentstrategy;

    public Context(PaymentStrategy paymentstrategy) {
        this.paymentstrategy = paymentstrategy;
    }
    
    public void payment(int amount){
        this.paymentstrategy.pay(amount);
    }
}
