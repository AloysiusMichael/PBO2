/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjflyweight;

/**
 *
 * @author u-mdp
 */
public class TreeType {
    private String name;
    private String color;

    public TreeType(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    public void draw(){
        System.out.println("Pohon = "+name+" "+color);
    }
}
