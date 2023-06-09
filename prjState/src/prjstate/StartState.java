/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjstate;

/**
 *
 * @author u-mdp
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Game Dimulai");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Status : Start State" ;
    }
    
    
}
