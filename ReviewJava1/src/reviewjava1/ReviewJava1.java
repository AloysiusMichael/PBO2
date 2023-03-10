/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reviewjava1;

/**
 *
 * @author u-mdp
 */
public class ReviewJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("PBO2");
        
        String var1 = "Universitas MDP";
        System.out.println(var1);
        
        String npm = "2125240123";
        double ipk = 3.810;
        boolean aktif = true;
        int umur = 20;
        
        System.out.println("NPM = "+npm+"\n"+"IPK= "+ipk+"\n"+"Aktif = "+aktif+"\n"+"Umur = "+umur);
        System.out.println("=============================");
        boolean cuacacerah = true;
        if (cuacacerah){
            System.out.println("Pergi jalan ke mall");
        }else {
            System.out.println("Tidur di rumah");
        }
        
        boolean sabtu = false;
        if (cuacacerah&&sabtu){
            System.out.println("pigi hiling kita");
        }else if(cuacacerah && sabtu){
            System.out.println("wajib hiling");
        }else if (cuacacerah && !sabtu ){//== false){
            System.out.println("tetap hiling meskin bukan  weken");
        }else {
            System.out.println("Tidur kita");
        }
        
        System.out.println("=============================");
        
        //or
        boolean bpjskesehatan = false;
        boolean asuransiswasta = true;
        if (bpjskesehatan||asuransiswasta){
            System.out.println("tidak Dikenakan biaya");
            
        }else {
            System.out.println("Dikenakan biaya");
        }
        
        
        System.out.println("=============================");
        //latihan klasifikasi umur
        //int umur = 56;
        if ( umur >= 0 && umur <= 5){
            System.out.println("Balita");
        }else if (umur >= 6 && umur <= 10){
            System.out.println("Kanak-Kanak");
        }else if (umur >= 12 && umur <= 17){
            System.out.println("remaja");
        }else if (umur >= 18 && umur <= 55){
            System.out.println("Dewasa");
        }else{
            System.out.println("Lansia");
        }
        
    }   
    
    
}
