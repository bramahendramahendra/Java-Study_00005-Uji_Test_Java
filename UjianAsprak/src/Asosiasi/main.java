/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asosiasi;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class main {
    public static void main(String[] args) {
        //membuat objek mahasiswa 1
        Mahasiswa m1 = new Mahasiswa();
        m1.setNim("234164");
        m1.setNama("Brama");
        
        //membuat objek mahasiswa 2
        Mahasiswa m2 = new Mahasiswa();
        m2.setNim("11234164");
        m2.setNama("dasdBrama");
        
        //membentuk objek dosen
        Dosen d = new Dosen();
        d.setKodeDosen("das");
        
        //menghubungkan antara dosen dan mahasiswa
        d.setNimMahasiswa(m1.getNim());
        d.setNimMahasiswa(m2.getNim());
        
        //menampilkan dosen
        System.out.println("Kode Dosen : "+d.getKodeDosen());
        System.out.println("Mengajar mahasiswa");
        
        //jumlah mahasiswa yg diajar  dosen d
        int jum = d.getJumlahMhs();
        
        //nim yang diajar oleh dosen d dengan perulangan
        for (int i=0; i<jum; i++) {
            System.out.println("  -  "+d.getNimMhs(i));
        }
    }
}
