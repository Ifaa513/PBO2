/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

/**
 *
 * @author USER
 */
public class Utama2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrontEnd fe = new FrontEnd();
        System.out.println("Saya bernama " + fe.getnama());
        System.out.println("Saya telah berpengalaman selama " + fe.gettahunPengalaman() + " tahun" + (", salah satu proyek yang pernah saya kerjakan adalah " + fe.getproyekPenting()));
        System.out.println("Teknologi utama yang saya gunakan adalah " + fe.getteknologi() + ", dengan design tool berupa " + fe.getdesignTool());
        System.out.println(" ");
        BackEnd be = new BackEnd();
        System.out.println("Saya bernama " + be.getnama());
        System.out.println("Saya telah berpengalaman selama " + be.gettahunPengalaman() + " tahun" + (", salah satu proyek yang pernah saya kerjakan adalah " + be.getproyekPenting()));
        System.out.println("Bahasa pemrograman yang saya gunakan adalah " + be.getbahasaPemrograman() + ", dengan database " + be.getdatabase());
        System.out.println(" ");
        UIUX ui = new UIUX();
        System.out.println("Saya bernama " + ui.getnama());
        System.out.println("Saya telah berpengalaman selama " + ui.gettahunPengalaman() + " tahun" + (", salah satu proyek yang pernah saya kerjakan adalah " + ui.getproyekPenting()));
        System.out.println("Jumlah proyek design yang pernah saya kerjakan adalah " + ui.getjumlahProyekDesign() + ", dan saya telah tersertifikasi " + ui.getSertifikasi());
        System.out.println(" ");
        FullStack fsd = new FullStack();
        System.out.println("Saya adalah seorang full stack developer");
        System.out.println("Saya bernama " + fsd.getnama());
        System.out.println("Saya telah berpengalaman selama " + fsd.gettahunPengalaman() + " tahun" + (", salah satu proyek yang pernah saya kerjakan adalah " + fsd.getproyekPenting()));
        System.out.println("Jenis laptop yang saya gunakan adalah: " + fsd.getjenisLaptop());
        System.out.println("Ini super dan this");
        fsd.cek();
        System.out.println(" ");
        fsd.membuatTampilanVisual();
        fsd.berinteraksiDenganAPI();
        fsd.mendesainStrukturBasisData();
        fsd.membuatAPI();

        SoftwareDeveloper casup = (FrontEnd) fe; //Casting
        casup.koding();
        casup.debugging();
    }

}
