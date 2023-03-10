/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputoutputjava;
import java.io.*;
import java.time.*;
/**
 *
 * @author u-mdp
 */
public class InputOutputJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println("Nama : ");
       String nama = br.readLine();
       
       //System.out.println("Hallo "+nama);
       
       System.out.println("NPM : ");
       String npm = br.readLine();
       npm.size(10);
       
       
       int tahunlhr =0;
        try {
             System.out.println("Tahun Lahir : ");
             tahunlhr = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("Silahkan Ulangi");
            System.out.println(e.getMessage().toString());
            return;
        }finally {
            System.out.println("Selesai");
        }
      
       
       
       System.out.println("Jenis Kelamin : ");
       String jk = br.readLine();
       String prodi = npm.substring(4, 6);
       
       if (prodi.equalsIgnoreCase("24")){
           prodi = "Sistem Informasi";
       }else if (prodi.equalsIgnoreCase("25")){
           prodi ="Teknik Informatika";
       }else if (prodi.equalsIgnoreCase("20")){
           prodi ="Manajemen";
       }else if (prodi.equalsIgnoreCase("21")){
           prodi ="Akuntansi";
       }
       
       int thnskrg = Year.now().getValue();
       int umur = thnskrg-tahunlhr;
       
       String jeka = "";
       if(jk.equalsIgnoreCase("L")){
           jeka = "Laki-Laki";
       }else {
           jeka = "Perempuan";
       }
       
       
       System.out.println("====================");
       System.out.println("Hallo "+nama);
       System.out.println("NPM : "+npm);
       System.out.println("Jurusan : "+prodi);
       System.out.println("Tahun Lahir : "+tahunlhr);
       System.out.println("Umur : "+umur);
       System.out.println("Jenis Kelamin (L/P) : "+"("+jk+") "+jeka);
       
    }
    
}
