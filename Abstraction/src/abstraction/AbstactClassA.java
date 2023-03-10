/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;

/**
 *
 * @author u-mdp
 */
abstract class AbstactClassA {
    //bisa mengimplementasikan interface
    //tidak bisa jadi objek, bisa di extends(diwariskan)
    public abstract void method1();
    
    public void method2(){
        System.out.println("Method dari abstract class");
    }
    public static void methodStatic(){
        System.out.println("Abstract class bisa ada method Static");
    }
}
