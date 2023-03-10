/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjrelasi;

/**
 *
 * @author u-mdp
 */
public class Rumah {
    private String luastanah;
    private KamarTidur kamartidur;
    private RuangTamu ruangtamu;
    private Dapur dapur;
    private PagarRumah pagarrumah;
    private String noperjanjianKPR;

    public PagarRumah getPagarrumah() {
        return pagarrumah;
    }

    public void setPagarrumah(PagarRumah pagarrumah) {
        this.pagarrumah = pagarrumah;
    }

    public String getLuastanah() {
        return luastanah;
    }

    public void setLuastanah(String luastanah) {
        this.luastanah = luastanah;
    }
    
    Rumah(){
        kamartidur = new KamarTidur();
        ruangtamu = new RuangTamu();
        dapur = new Dapur();
        noperjanjianKPR="-";
    }
    
    public void infoRumah(){
        System.out.println("Luas tanah = "+this.luastanah);
        System.out.println("No.KPR = "+this.noperjanjianKPR);
        ruangtamu.fungsiRuangan();
        kamartidur.fungsiRuangan();
        dapur.ruanganMasak();
        pagarrumah.jenisPagar();
        
        
    }

    public void setNoperjanjianKPR(String noperjanjianKPR) {
        this.noperjanjianKPR = noperjanjianKPR;
    }
    
}
