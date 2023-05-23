/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjcommand;

/**
 *
 * @author u-mdp
 */
public class PrjCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Receiver receiver = new TV();
       Command onCommand = new OnCommand(receiver);
       Invoker invoker = new Invoker(onCommand);
       invoker.execute();
       
       receiver = new DVD();
       onCommand = new OnCommand(receiver);
       invoker = new Invoker(onCommand);
       invoker.execute();
    }
    
}

interface Command{
    public void execute();
}
class Receiver{
    public void switchon(){
        System.out.println("Switch on from : "+this.getClass().getSimpleName());
    }
}

class OnCommand implements Command{
    private Receiver receiver;

    public OnCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public void execute() {
        receiver.switchon();
    }
    
}

class Invoker{
    private Command onCommand;

    public Invoker(Command onCommand) {
        this.onCommand = onCommand;
    }
    
    public void execute(){
        this.onCommand.execute();
    }
}

class TV extends Receiver{
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
class DVD extends Receiver{
    public String toString(){
        return this.getClass().getSimpleName();
    }
}


