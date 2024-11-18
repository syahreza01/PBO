/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO11;

/**
 *
 * @author USER
 */
public class main {
  public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();
        
        perpus.tambahBuku(new Buku("Java Programming"));
        perpus.tambahBuku(new Buku("Python Basics"));
        perpus.tambahBuku(new Buku("Data Structures"));
        
        perpus.infoPerpustakaan();
    }  
}
