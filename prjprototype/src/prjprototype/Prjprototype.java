/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjprototype;

/**
 *
 * @author u-mdp
 */
public class Prjprototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle objek1 = new Rectangle();
        objek1.setX(100);
        objek1.setY(200);
        System.out.println("Objek 1 ="+objek1.getX()+"-"+objek1.getY());
        
        // Clonning 
//        // Manual 
//       Rectangle objek1a = new Rectangle();
//       objek1a.setX(objek1.getX());
//       objek1a.setY(objek1.getY());
       
       // Biasa
       Rectangle objek2 = objek1.clone();
       System.out.println("Objek 2 = "+objek2.getX()+"+"+objek2.getY());
    }
    
}
