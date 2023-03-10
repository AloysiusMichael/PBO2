/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reviewoop;

/**
 *
 * @author u-mdp
 */
public class Dog extends Animal{
    private boolean bestfriend;

    public void setBestfriend(boolean bestfriend) {
        this.bestfriend = bestfriend;
    }
    
     public void bark(){
        System.out.println(super.name+", the dog is barking");
    }
}
