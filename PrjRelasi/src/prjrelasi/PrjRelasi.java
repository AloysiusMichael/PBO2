/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjrelasi;

/**
 *
 * @author u-mdp
 */
public class PrjRelasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rumah rumahsiapa = new Rumah();
        rumahsiapa.setLuastanah("Luas Tanah 4 X 10 m");
        
        PagarRumah pagar = new PagarRumah();
        rumahsiapa.setPagarrumah(pagar);
        
        Kpr kredit = new Kpr("23/01/01-Bank","Bank XXX");
        rumahsiapa.setNoperjanjianKPR(kredit.getNomorPerjanjian());
        rumahsiapa.infoRumah();
        
    }
    
}
