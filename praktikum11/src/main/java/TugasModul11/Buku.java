/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul11;

/**
 *
 * @author USER
 */
public class Buku {
  private String judul;
    private Pengarang pengarang; 

    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        pengarang.infoPengarang(); // Menampilkan informasi pengarang
    }  
}
