/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
        // TODO code application logic here
    Scanner scan = new Scanner (System.in);
  
  //Masukan tipe Data
  String nama_barang;
  int jml_barang, harga_satuan, total_harga, diskon, total_bayar;
  
  //Input
  System.out.println("\nPEMBELIAN ");
  System.out.println();
  System.out.print("Nama Barang  : ");
  nama_barang = scan.nextLine();
  System.out.print("Jumlah Barang  : ");
  jml_barang = scan.nextInt();
  System.out.print("Harga Satuan  : ");
  harga_satuan = scan.nextInt();
  //Proses
  total_harga = harga_satuan * jml_barang;
  diskon = total_harga*5/100;
  total_bayar = (total_harga-(diskon));
  
  //Output
  if(total_harga>=500000){
   System.out.println("\nDiskon 5%  : "+diskon);
   System.out.print("Total Bayar  : "+total_bayar);
  }else if (total_harga>=0 && total_harga<500000){
   System.out.println("\nTotal Bayar : "+total_harga+" kawus, anda tidak dapat bonus");
 
   System.out.print("Apakah Anda ingin Input lagi? [Y/T]");
        String i = scan.next();
 
  System.out.print("Apakah Anda ingin Input lagi? [Y/T]");
        i = scan.next();
  } 
 }
}









    