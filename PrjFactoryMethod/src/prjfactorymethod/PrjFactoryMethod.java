/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjfactorymethod;

/**
 *
 * @author u-mdp
 */
public class PrjFactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Logistic deliver1;
       
       String pilihan = "Udara";
       if (pilihan.equalsIgnoreCase("Darat") ){
           deliver1= new RoadLogistic();
           deliver1.planDelivery(); 
       }else if (pilihan.equalsIgnoreCase("Udara")){
           deliver1= new AirLogistic();
           deliver1.planDelivery(); 
       }else {
           deliver1= new SeaLogistic();
           deliver1.planDelivery(); 
       }
    }
    
}
