/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isp;

/**
 *
 * @author u-mdp
 */
public class ISP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PegawaiTetap pegawai1 = new PegawaiTetap();
        pegawai1.absen();
        pegawai1.mulaiKerja();
        pegawai1.makanSiang();
        
        System.out.println("=====================");
        
        Robot robot1 = new Robot();
        robot1.absen();
        robot1.mulaiKerja();
        robot1.isiUlangDaya();
    }
    
}
