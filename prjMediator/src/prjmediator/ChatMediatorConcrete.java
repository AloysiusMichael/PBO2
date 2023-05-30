/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjmediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author u-mdp
 */
public class ChatMediatorConcrete implements ChatMediator {
    private List<User> users;

    public ChatMediatorConcrete() {
        this.users= new ArrayList <>();
    }
    

    @Override
    public void sendMessage(String msg, User user) {
        for(User u : this.users){
            if(u != users){
                u.receive(msg);
            }
        }      
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
    
}
