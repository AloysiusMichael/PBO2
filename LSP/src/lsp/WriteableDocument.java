/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsp;

/**
 *
 * @author u-mdp
 */
public class WriteableDocument extends Document{
    
    public WriteableDocument(String data, String filename) {
        super(data, filename);
    }
    
    public void save(){
        System.out.println("Simpan File "+super.getFilename());
    }
}
