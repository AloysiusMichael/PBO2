/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reviewoop;

/**
 *
 * @author u-mdp
 */
public class Cat extends Animal{
    private boolean isNasty;

    public void setIsNasty(boolean isNasty) {
        this.isNasty = isNasty;
    }
    
     public void meow(){
        System.out.println(super.name+", the cat meoww");
    }
}
