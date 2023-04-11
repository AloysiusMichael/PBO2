/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dip;

/**
 *
 * @author u-mdp
 */
public class MongoDB implements Database{

    @Override
    public void insert() {
        System.out.println("Insert Database MongoDB");
    }

    @Override
    public void update() {
      System.out.println("Update Database MongoDB");
    }

    @Override
    public void delete() {
        System.out.println("Delete Database MongoDB");
    }
    
}
