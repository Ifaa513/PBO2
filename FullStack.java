/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author USER
 */
public class FullStack extends SoftwareDeveloper implements FrontEndDeveloper, BackEndDeveloper {

    private String jenisLaptop;

    public FullStack() {
        super.setnama("Kiano");
        super.setproyekPenting("Membangun web");
        super.settahunPengalaman(2);
        this.jenisLaptop = "Lenovo";
    }

    public void setjenisLaptop(String lepi) {
        this.jenisLaptop = lepi;
    }

    public String getjenisLaptop() {
        return this.jenisLaptop;

    }

    @Override
    public void membuatTampilanVisual() {
        System.out.println("Membuat tampilan visual aplikasi web");
    }

    @Override
    public void berinteraksiDenganAPI() {
        System.out.println("Berinteraksi dengan API backend untuk mengirim data ke server");
    }

    @Override
    public void mendesainStrukturBasisData() {
        System.out.println("Mengelola data yang disimpan di server");
    }

    @Override
    public void membuatAPI() {
        System.out.println("Mengelola API yang memungkinkan komunikasi antara frontend dan backend");
    }

    public void cek() {
        super.membuatTampilanVisual();
        this.membuatTampilanVisual();
        super.berinteraksiDenganAPI();
        this.berinteraksiDenganAPI();
        super.mendesainStrukturBasisData();
        this.mendesainStrukturBasisData();
        super.membuatAPI();
        this.membuatAPI();
    }
}
