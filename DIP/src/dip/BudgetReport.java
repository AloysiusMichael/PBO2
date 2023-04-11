/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dip;

import java.util.Date;

/**
 *
 * @author u-mdp
 */
public class BudgetReport {
    private Database database;

    public BudgetReport(Database database) {
        this.database = database;
    }
    
    
    public void openDate (String tanggal){
        System.out.println("Tanggal = "+ tanggal);
    }

    public void save (){
        this.database.insert();
    }

}

