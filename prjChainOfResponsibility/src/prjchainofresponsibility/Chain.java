/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package prjchainofresponsibility;

/**
 *
 * @author u-mdp
 */
public interface Chain {
    public void setNextChain(Chain nextChain);
    public void calculate(Numbers request);
    
}
