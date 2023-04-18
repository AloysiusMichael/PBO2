/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjfactorymethod;

/**
 *
 * @author u-mdp
 */
public abstract class Logistic {
    public void planDelivery(){
        Transport t = createTransportation();
        t.createTransport();
    }
    public abstract Transport createTransportation();
}
