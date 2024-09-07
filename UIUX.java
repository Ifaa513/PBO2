/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author USER
 */
public class UIUX extends FrontEnd {

    private int jumlahProyekDesign;
    private String Sertifikasi;

    public UIUX() {
        super.setnama("Fafa");
        super.setproyekPenting("Redesain website untuk perusahaan");
        super.settahunPengalaman(2);
        this.jumlahProyekDesign = 15;
        this.Sertifikasi = "Nielsen Norman Group UX Certification";
    }

    public void set(int jumlah) {
        this.jumlahProyekDesign = jumlah;
    }

    public int getjumlahProyekDesign() {
        return this.jumlahProyekDesign;

    }

    public void setSertifikasi(String sertif) {
        this.Sertifikasi = sertif;
    }

    public String getSertifikasi() {
        return this.Sertifikasi;
    }
}
