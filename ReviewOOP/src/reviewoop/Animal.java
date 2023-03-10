/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reviewoop;

/**
 *
 * @author u-mdp
 */
public class Animal {
    public String name;
    public String gender;
    public String age;
    public String weight;
    public String color;
    
    
    public void breathe (){
        System.out.println(this.name +" is breathing");   
    }
    public void eat(String food){
        System.out.println(this.name+" is eating "+food );
    }
    public void run(String destination){
        System.out.println(this.name+" Run to " +destination);
    }
    public void sleep (String hours){
        System.out.println(this.name+" Sleep for "+hours);
    } 
   
}
