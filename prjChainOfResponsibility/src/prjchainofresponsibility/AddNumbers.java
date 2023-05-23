/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjchainofresponsibility;

/**
 *
 * @author u-mdp
 */
public class AddNumbers implements Chain{
    private Chain nextInchain;
    
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInchain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalculationMethod().equalsIgnoreCase("Tambah")){
            System.out.println(request.getNumber1()+"+"+request.getNumber2()+"="+(request.getNumber1()+request.getNumber2()));
        }else{
            nextInchain.calculate(request);
        }
    }
    
}
