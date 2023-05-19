/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjfacade;

/**
 *
 * @author u-mdp
 */
public class Order {
    public void buatOrder(){
        Product p = new Product();
        p.infoProduk();
        
        Payment py = new Payment();
        py.bayarPesanan();
        
        Invoice iv = new Invoice ();
        iv.buktiPenjualan();
        System.out.println("Order Selesai");
    }
}
