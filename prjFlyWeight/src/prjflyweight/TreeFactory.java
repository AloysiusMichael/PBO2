/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjflyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author u-mdp
 */
public class TreeFactory {
    static Map<String, TreeType> treeType = new HashMap<>();
    
    public static TreeType getTreeType(String name, String color){
          TreeType result = treeType.get(name);
          
          if(result==null){
              result = new TreeType(name,color);
              treeType.put(name, result);
          }
    return result;
    }
    
    
}
