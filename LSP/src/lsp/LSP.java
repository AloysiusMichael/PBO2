/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsp;

/**
 *
 * @author u-mdp
 */
public class LSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Document file1 = new Document("Data 1","Siswa 1");
       Document file2 = new Document ("Data 2","Siswa 2"); 
       WriteableDocument file3 = new WriteableDocument("File 3", "Siswa 3");
       
       Project project1 = new Project ();
       project1.setDocuments (file1);
       project1.setDocuments (file2);
       project1.setWriteableDocuments(file3);
       project1.openAll();
       project1.saveAll();
    }
    
}
