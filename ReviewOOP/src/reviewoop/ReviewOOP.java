/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reviewoop;

/**
 *
 * @author u-mdp
 */
public class ReviewOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cat kucingOscar = new Cat ();
        kucingOscar.name = "Oscar";
        kucingOscar.gender = "male";
        kucingOscar.age = "3";
        kucingOscar.weight = "7";
        kucingOscar.color = "Brown";
        kucingOscar.breathe();
        kucingOscar.eat("Fish");
        kucingOscar.run("Park");
        kucingOscar.sleep("1");
        kucingOscar.meow();
        
        
        System.out.println("============================");
        Cat kucingLuna = new Cat ();
        kucingOscar.name = "Luna";
        kucingOscar.gender = "Female";
        kucingOscar.age = "2";
        kucingOscar.weight = "5";
        kucingOscar.color = "gray";
        kucingOscar.breathe();
        kucingOscar.eat("meat");
        kucingOscar.run("house");
        kucingOscar.sleep("2");
        kucingOscar.meow();
        
        System.out.println("============================");
        Cat kucing3 = new Cat ();
        kucing3.name = "Moon";
        kucing3.gender = "Female";
        kucing3.age = "2";
        kucing3.weight = "5";
        kucing3.color = "Yellow";
        kucing3.breathe();
        kucing3.eat("cat food");
        kucing3.run("house");
        kucing3.sleep("2");
        kucing3.meow();
       
       System.out.println("============================");
       Dog anjingBaru = new Dog();
       anjingBaru.name = "Fido";
       anjingBaru.gender = "male";
       anjingBaru.age = "3";
       anjingBaru.weight = "2";
       anjingBaru.color = "black";
       anjingBaru.breathe();
       anjingBaru.eat("bone");
       anjingBaru.run("dog house");
       anjingBaru.sleep("3");
       anjingBaru.bark();
       anjingBaru.setBestfriend(true);
       
    }
    
}

