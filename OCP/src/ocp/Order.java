/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author u-mdp
 */
public class Order  {
    private List<Item> lineItem;
    private Shipping shipping;

    public Order() {
        this.lineItem=new ArrayList<>();
    }
    
    public void setItem(Item item){
        this.lineItem.add(item);
    }
    
    public double getTotal(){
        double total = 0;
        for(Item item : lineItem){
            total = (item.price*item.quantity);
        }
        return total;
    }
    
    public double getTotalWeight(){
        double berat = 0;
        for (Item i : lineItem){
            berat = berat +i.weight;
        }
        return berat;
    }
    
    public void setShippingType(Shipping shipping){
        this.shipping=shipping;
    }
    
    public String getShippingDate(){
        return this.shipping.getDate(this);
    }
    
    public double getShippingCost(){
        return this.shipping.getCost(this) ;
    }
    
}
