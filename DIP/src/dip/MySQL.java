/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dip;

/**
 *
 * @author u-mdp
 */
public class MySQL implements Database{

    @Override
    public void insert() {
        System.out.println("Insert Database MySql");
    }

    @Override
    public void update() {
        System.out.println("Update Database MySql");
    }

    @Override
    public void delete() {
        System.out.println("Delete Database MySql");
    }
    
}
