/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjproxy;

/**
 *
 * @author u-mdp
 */
public class PrjProxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Proxy p = new Proxy(new Service());
       p.operation("admin");
    }
    
}
