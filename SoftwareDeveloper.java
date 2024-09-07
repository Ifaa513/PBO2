/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author USER
 */
public class SoftwareDeveloper {

    private String nama;
    private int tahunPengalaman;
    private String proyekPenting;

    public SoftwareDeveloper() {
        this.nama = "Zul";
        this.proyekPenting = "Membuat aplikasi";
        this.tahunPengalaman = 3;

    }

    public void jenisLaptop() {
        System.out.println("Jenis laptop yang saya gunakan selalu berdasarkan kebutuhan saya");
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getnama() {
        return this.nama;

    }

    public void settahunPengalaman(int tp) {
        this.tahunPengalaman = tp;
    }

    public int gettahunPengalaman() {
        return this.tahunPengalaman;
    }

    public void setproyekPenting(String pp) {
        this.proyekPenting = pp;
    }

    public String getproyekPenting() {
        return this.proyekPenting;
    }

    public void koding() {
        System.out.println("Saya menulis kode");
    }

    public void debugging() {
        System.out.println("Saya melakukan debugging");
    }

    public void membuatTampilanVisual() {
        System.out.println("MembuatUI/UX");
    }

    public void berinteraksiDenganAPI() {
        System.out.println("Berinteraksi dengan API backend untuk mengambil data ke server");
    }

    public void mendesainStrukturBasisData() {
        System.out.println("Mendesain struktur basis data yang efisien");
    }

    public void membuatAPI() {
        System.out.println("Membuat API yang memungkinkan komunikasi antara berbagai layanan");
    }
}
