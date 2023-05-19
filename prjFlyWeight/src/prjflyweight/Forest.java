/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjflyweight;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author u-mdp
 */
public class Forest {
    private final List<Tree> trees = new ArrayList<>();
    
    public void plantTree(int x, int y, String name, String color){
        TreeType type = TreeFactory.getTreeType(name, color);
        Tree tree = new Tree(x,y, type);
        trees.add(tree);
    }
    public void treeInfo(){
        for(Tree t :trees){
            t.draw();
        }
    }
}
