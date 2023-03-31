/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author u-mdp
 */
public class Project {
    private List <Document> documents;
    private List <WriteableDocument> writeabledocuments;
    
    public Project(){
        this.documents = new ArrayList <>();
        this.writeabledocuments = new ArrayList <>();
    }
    
    public void setDocuments(Document document){
        this.documents.add(document);
    }
    
    public void setWriteableDocuments (WriteableDocument doc){
        this.writeabledocuments.add(doc);
    }
    
    public void openAll(){
        for (Document doc : documents){
            doc.open();
        }
    }
    
    public void saveAll(){
        for (WriteableDocument wd : writeabledocuments){
            wd.save();
        }
    }
}
