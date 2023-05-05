/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjbuilder;

/**
 *
 * @author u-mdp
 */
public class Customer {
    private String nama;
    private String alamat;
    private int umur;
    private String noHP;

    public Customer(String nama, String alamat, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }

    public Customer(String nama, String alamat, int umur, String noHP) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.noHP = noHP;
    }

    @Override
    public String toString() {
        return "Customer{" + "nama=" + nama + ", alamat=" + alamat + ", umur=" + umur + ", noHP=" + noHP + '}';
    }
    

 
    
    
}
