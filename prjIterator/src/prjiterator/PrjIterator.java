/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjiterator;

import java.util.Iterator;

/**
 *
 * @author u-mdp
 */
public class PrjIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       KoleksiPop lagupop = new KoleksiPop();
       KoleksiRock lagurock = new KoleksiRock();
       printLagu(lagupop.createIterator());
       printLagu(lagurock.createIterator());
    }
    
    public static void printLagu(Iterator iterator){
        while(iterator.hasNext()){
            InfoLagu lagu = (InfoLagu)iterator.next();
            System.out.println(lagu.getJudullagu());
            System.out.println(lagu.getPenyanyi());
            System.out.println(lagu.getTahunliris());
            System.out.println("======================");
        }
    }
    
}
