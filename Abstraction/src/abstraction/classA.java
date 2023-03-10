/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;


public class classA implements interfaceA{

    @Override
    public void aturan1() {
       System.out.println("Aturan 1");
    }

    @Override
    public void aturan2(String parameter1) {
        System.out.println("Aturan 2"+parameter1);
    }

    @Override
    public String aturan3() {
       return "Aturan 3";
    }
    
}
