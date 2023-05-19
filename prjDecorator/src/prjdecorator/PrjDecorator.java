/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjdecorator;

/**
 *
 * @author u-mdp
 */
public class PrjDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Car mobilSport = new SportCar(new BasicCar());
       mobilSport.assemble();
       System.out.println("==========================");
       Car mobilMewah = new LuxuryCar(new BasicCar());
       mobilMewah.assemble();
    }
    
}
