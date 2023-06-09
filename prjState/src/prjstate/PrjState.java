/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjstate;

/**
 *
 * @author u-mdp
 */
public class PrjState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Context context = new Context();
        
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState());
        
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState());
    }
    
}
