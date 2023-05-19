/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjproxy;

/**
 *
 * @author u-mdp
 */
public class Proxy {
    private Service realService;

    public Proxy(Service realService) {
        this.realService = realService;
    }
    
    public boolean checkAccess(String userid){
        boolean result = false;
        if(userid.equalsIgnoreCase("superadmin")) result = true;
        return result;
    }
    
    public void operation(String userid){
        if(checkAccess(userid)==true){
            realService.operation();
        }else{
            System.out.println("tidak diizinkan");
        }
    }
}
