/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjflyweight;

/**
 *
 * @author u-mdp
 */
public class Tree {
    private int x;
    private int y;
    private TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }
    
    public void draw(){
        treeType.draw();
        System.out.println("Lokasi = "+this.x +" "+ this.y);
        System.out.println("================================");
    }
    
}
