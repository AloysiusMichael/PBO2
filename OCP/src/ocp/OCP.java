/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ocp;

/**
 *
 * @author u-mdp
 */
public class OCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Item produk1= new Item(100,1,5);
        Item produk2= new Item(20,2,3);
        Item produk3= new Item(30,5,1);
        
        Order orderbarang = new Order();
        orderbarang.setItem(produk1);
        orderbarang.setItem(produk2);
        orderbarang.setItem(produk3);
        
        Air kirimudara = new Air();
        orderbarang.setShippingType(kirimudara);
        System.out.println(orderbarang.getTotal());
        System.out.println(orderbarang.getTotalWeight());
        System.out.println(orderbarang.getShippingDate());
        System.out.println(orderbarang.getShippingCost());
        
        Ground kirimdarat = new Ground();
        orderbarang.setShippingType(kirimdarat);
        System.out.println(orderbarang.getTotal());
        System.out.println(orderbarang.getTotalWeight());
        System.out.println(orderbarang.getShippingDate());
        System.out.println(orderbarang.getShippingCost());
    }
    
}
