/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstraction;


public class Abstraction {


    public static void main(String[] args) {
        classA objekA = new classA();
        objekA.aturan1();
        objekA.aturan2(" hello ");
        System.out.println(objekA.aturan3());
        
        System.out.println("=======================");
        classB objekB = new classB();
        objekB.aturan1();
        objekB.aturan2(" hello ");
        System.out.println(objekB.aturan3());
        objekB.aturan4("Hello","World");
        System.out.println(objekB.aturan5(5, 4));
        
        System.out.println("=======================");
        
        classC objekC = new classC();
        
        objekC.aturan1();
        objekC.aturan2(" hello ");
        System.out.println(objekC.aturan3());
        objekC.aturan4("Hello","World");
        System.out.println(objekC.aturan5(15, 5));
        objekC.aturan6();
        
         System.out.println("=======================");
         
         ExtendsAbstractA objA = new ExtendsAbstractA();
         objA.method1();
         objA.method2();
         
         ExtendsAbstractA.methodStatic();
    }
    
}
