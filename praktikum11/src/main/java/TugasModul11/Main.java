/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul11;

/**
 *
 * @author USER
 */
public class Main {
   public static void main(String[] args) {
        Pengarang pengarang1 = new Pengarang("J.K. Rowling");
        Pengarang pengarang2 = new Pengarang("George R.R. Martin");

        Buku buku1 = new Buku("Harry Potter", pengarang1);
        Buku buku2 = new Buku("Game of Thrones", pengarang2);

        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        perpustakaan.infoPerpustakaan();
    } 
}
