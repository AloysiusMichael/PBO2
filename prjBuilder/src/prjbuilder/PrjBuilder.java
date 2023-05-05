/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjbuilder;

/**
 *
 * @author u-mdp
 */
public class PrjBuilder {


    public static void main(String[] args) {
       CustomerBuilder build1 = new CustomerBuilder();
       build1.setNama("joko");
       build1.setAlamat("Jalan Kebayoran");
       build1.setUmur(35);
       
       Customer pelanggan1 = build1.build();
       System.out.println(pelanggan1.toString());
       
       CustomerBuilder build2 = new CustomerBuilder();
       build2.setNama("Fredi");
       //build1.setAlamat("Jalan Kuningan");
       build2.setUmur(50);
       build2.setNoHP("0812345522");
       
       Customer pelanggan2 = build2.build();
       System.out.println(pelanggan2.toString());
    }
    
}
