/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;

/**
 *
 * @author u-mdp
 */
public class classB implements interfaceA,interfaceB {

    @Override
    public void aturan1() {
       System.out.println("Class B Aturan 1");
    }

    @Override
    public void aturan2(String parameter1) {
        System.out.println("Class B Aturan 2"+parameter1);
    }

    @Override
    public String aturan3() {
        return "Aturan 3 Class B";
    }

    @Override
    public void aturan4(String p1, String p2) {
       System.out.println("Class B Aturan 4"+p1+" "+p1);
    }

    @Override
    public int aturan5(int p1, int p2) {
        return p1+p2;
    }
    
}
