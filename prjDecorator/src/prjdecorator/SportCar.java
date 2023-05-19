/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjdecorator;

/**
 *
 * @author u-mdp
 */
public class SportCar extends CarDecorator {
    
    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble(); 
        System.out.println("Tambah Fitur dari Sport Car");
    }
    
}
