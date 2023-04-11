/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dip;

/**
 *
 * @author u-mdp
 */
public class DIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Database dbMySQL = new MongoDB();
       BudgetReport brReport = new BudgetReport (dbMySQL);
       brReport.openDate("11 April 2023");
       brReport.save();
       
       
    }
    
}
