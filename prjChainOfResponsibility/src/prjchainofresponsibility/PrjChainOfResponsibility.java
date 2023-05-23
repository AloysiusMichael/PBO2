/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjchainofresponsibility;

/**
 *
 * @author u-mdp
 */
public class PrjChainOfResponsibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Chain chaincalculator1=new AddNumbers();
       Chain chaincalculator2=new SubtrackNumbers();
       Chain chaincalculator3=new MultiplicationNumbers();
       Chain chaincalculator4=new DivideNumbers();
       
       chaincalculator1.setNextChain(chaincalculator2);
       chaincalculator2.setNextChain(chaincalculator3);
       chaincalculator3.setNextChain(chaincalculator4);
       
       Numbers request = new Numbers(10,30,"kali");
       chaincalculator1.calculate(request);
    }
    
}
