/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reviewarrayperulangan;
import java.io.*;
import java.time.*;
/**
 *
 * @author u-mdp
 */
public class ReviewArrayPerulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
//       int a [] = new int[2];
//       a[0]= 1000;
//       a[1]= 50;
//       System.out.println(a[0]+" "+a[1]);
       
       String ulang = "Y";
       
       while (ulang.equalsIgnoreCase("Y")){
       int arrData [] ;
       BufferedReader br = 
               new BufferedReader (new InputStreamReader (System.in));
       System.out.println("Pencarian Data Array ");
       System.out.println("Silahkan input Kapasitas Array = ");
       
       int kapasitas = Integer.parseInt(br.readLine());
       arrData = new int [kapasitas];
       
       
       System.out.println("Silahkan input data array sesuai kapasitas (enter) = ");
       
       int total = 0;
       for (int i=0;i<kapasitas;i++){
           arrData[1]= Integer.parseInt(br.readLine());
           total += arrData[i];
       }
       System.out.println("Masukkan angka yang ingin dicari = ");
      
       int cari = Integer.parseInt(br.readLine());
       boolean ketemu = false;
       int index = 0;
       for (int i = 0 ; i <kapasitas;i++){
           if (arrData[i]==cari){
               ketemu = true;  
               index = i;
               break;
           }
       }
       if (ketemu== true){
           System.out.println("Data ada dalam array, dalam index ke - "+index);
       }else {
           System.out.println("data tidak ada di dalam array");
       }       
       System.out.println("Ulangi Y/T");
       ulang = br.readLine();
     }
    }
}
