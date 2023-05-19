/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjflyweight;

/**
 *
 * @author u-mdp
 */
public class PrjFlyWeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Forest hutan = new Forest();
        hutan.plantTree(10, 100, "Pohon Cemara", "hijau");
        hutan.plantTree(10, 150, "Pohon Jati", "Coklat");
        hutan.plantTree(20, 100, "Pohon Mangga", "Merah");
        hutan.plantTree(30, 200, "Pohon Pinus", "Hijau");
        
        hutan.treeInfo();
                
    }
    
}
