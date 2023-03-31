/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsp;

/**
 *
 * @author u-mdp
 */
public class Document {
    private String data;
    private String filename;

    public Document(String data, String filename) {
        this.data = data;
        this.filename = filename;
    }
    
    public void open(){
        System.out.println("Buka Document "+ this.filename);
    }

    public String getData() {
        return data;
    }

    public String getFilename() {
        return filename;
    }
    
    
}
