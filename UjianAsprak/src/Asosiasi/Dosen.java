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
public class Dosen {
    private String kodeDosen;
    private String[] nimMhs = new String[5];
    private int jumlahMhs;

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public void setNimMahasiswa(String nimMhs) {
        if (jumlahMhs<this.nimMhs.length) {
            this.nimMhs[jumlahMhs] = nimMhs;
            jumlahMhs++;
        }
    }

    public String getKodeDosen() {
        return this.kodeDosen;
    }

    public String getNimMhs(int indeks) {
        return (nimMhs[indeks]);
    }

    public int getJumlahMhs() {
        return this.jumlahMhs;
    }
    
    
}
