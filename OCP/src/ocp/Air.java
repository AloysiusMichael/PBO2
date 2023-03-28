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
public class Air implements Shipping {

    public double getCost(Order order) {
        return max(20,order.getTotalWeight()*1.5);
    }

    public String getDate(Order order) {
       return "Date from Air Class Shipping";
    }
    
}
