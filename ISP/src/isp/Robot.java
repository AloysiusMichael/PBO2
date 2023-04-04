/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp;

/**
 *
 * @author u-mdp
 */
public class Robot implements IRobot, IPegawai{

    @Override
    public void isiUlangDaya() {
        System.out.println("Robot Isi Ulang Daya");
    }

    @Override
    public void absen() {
       System.out.println("Robot Absen");
    }

    @Override
    public void mulaiKerja() {
       System.out.println("Robot Mulai Bekerja");
    }
    
}
