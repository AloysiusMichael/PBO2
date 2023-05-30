/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjmediator;

/**
 *
 * @author u-mdp
 */
public class UserConcrete extends User{

    public UserConcrete(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(super.name+" Kirim Pesan "+ msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(super.name+ " Terima Pesan "+ msg);
    }
    
}
