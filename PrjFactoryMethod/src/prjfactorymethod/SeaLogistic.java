/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjfactorymethod;

/**
 *
 * @author u-mdp
 */
public class SeaLogistic extends Logistic{

    @Override
    public Transport createTransportation() {
       return new Ship();
    }
    
}
