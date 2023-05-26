/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author u-mdp
 */
public class KoleksiRock implements LaguIterator {
    private InfoLagu[] daftarLagu;
    private int index;
    
    public void addLagu (String judul, String penyanyi, int tahun){
        InfoLagu lagu = new InfoLagu(judul,penyanyi,tahun);
        daftarLagu[this.index]=lagu;
        this.index++;
        
    }

    public KoleksiRock() {
        this.daftarLagu = new InfoLagu[3];
        addLagu("Lagu Rock 1","Penyanyi 1 ", 2010);
        addLagu("Lagu ROck 2","Penyanyi 2 ", 2021);
        addLagu("Lagu Rock 3","Penyanyi 3 ", 2022);
    }
    
    
    @Override
    public Iterator createIterator() {
        return Arrays.asList (daftarLagu).iterator();
    }
    
}
