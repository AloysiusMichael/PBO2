/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjiterator;

/**
 *
 * @author u-mdp
 */
public class InfoLagu {
    private String judullagu;
    private String penyanyi;
    private int tahunliris;

    public InfoLagu(String judullagu, String penyanyi, int tahunliris) {
        this.judullagu = judullagu;
        this.penyanyi = penyanyi;
        this.tahunliris = tahunliris;
    }

    public String getJudullagu() {
        return judullagu;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public int getTahunliris() {
        return tahunliris;
    }
    
    
}
