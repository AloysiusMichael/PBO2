/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocp;

import static java.lang.Double.max;

/**
 *
 * @author u-mdp
 */
public class Ground implements Shipping {

    @Override
    public double getCost(Order order) {
        if(order.getTotal()>100){
            return 0;
        }
        return max(10,order.getTotalWeight()*3);
    }

    @Override
    public String getDate(Order order) {
        return "Date from Ground Class Shipping";
    }
    
}
