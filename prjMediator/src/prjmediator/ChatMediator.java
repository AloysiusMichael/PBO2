/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package prjmediator;

/**
 *
 * @author u-mdp
 */
public interface ChatMediator {
    public void sendMessage(String msg, User user);
    public void addUser(User user);
    
}
