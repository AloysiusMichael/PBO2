/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp;

/**
 *
 * @author u-mdp
 */
public class PegawaiTetap implements IManusia, IPegawai{

    @Override
    public void makanSiang() {
       System.out.println("PEgawai Tetap Makan siang");
    }

    @Override
    public void absen() {
        System.out.println("PEgawai Tetap Absensi");
    }

    @Override
    public void mulaiKerja() {
        System.out.println("PEgawai Tetap Mulai Kerja");
    }
    
}
