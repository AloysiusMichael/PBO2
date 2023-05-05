/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjbuilder;

/**
 *
 * @author u-mdp
 */
public class CustomerBuilder {
    private String nama;
    private String alamat;
    private int umur;
    private String noHP;

    public CustomerBuilder() {
        this.nama = "";
        this.alamat = "";
        this.umur = 0;
        this.noHP = "";
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }
    
    
    public Customer build(){
        return new Customer (this.nama, this.alamat, this.umur, this.noHP);
    }
    
    
}
