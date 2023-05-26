/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjiterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author u-mdp
 */
public class KoleksiPop implements LaguIterator {
    private ArrayList<InfoLagu> daftarLagu;
    
    public void addLagu (String judul, String penyanyi, int tahun){
        daftarLagu.add(new InfoLagu(judul,penyanyi,tahun));
    }

    public KoleksiPop() {
        this.daftarLagu = new ArrayList();
        addLagu("Lagu Pop 1","Penyanyi 1 ", 2010);
        addLagu("Lagu Pop 2","Penyanyi 2 ", 2011);
        addLagu("Lagu Pop 3","Penyanyi 3 ", 2012);
        addLagu("Lagu Pop 4","Penyanyi 4 ", 2013);
    }
    
    
    @Override
    public Iterator createIterator() {
        return daftarLagu.iterator();
    }
    
}
