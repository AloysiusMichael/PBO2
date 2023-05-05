/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjprototype;

/**
 *
 * @author u-mdp
 */
public class Rectangle {
    private int x;
    private int y;

    public Rectangle() {
      
    }
    
    public Rectangle(Rectangle rec) {
       if(rec!=null){
           this.x=rec.x;
           this.y=rec.y;
       }
    }

    public Rectangle clone(){
        return new Rectangle(this);
    }
    
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
