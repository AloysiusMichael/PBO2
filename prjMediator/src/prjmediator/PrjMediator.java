/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjmediator;

/**
 *
 * @author u-mdp
 */
public class PrjMediator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorConcrete();
        
        User user1= new UserConcrete(mediator,"Budi");
        User user2= new UserConcrete(mediator,"Hendra");
        User user3= new UserConcrete(mediator,"Dewi");
        User user4= new UserConcrete(mediator,"Sri");
        
        mediator.addUser(user1);
        mediator.addUser(user2);                               
        mediator.addUser(user3);
        mediator.addUser(user4);
        
        
        user1.send("Hallo Dunia");
    }
    
}
