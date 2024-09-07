/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author USER
 */
public class BackEnd extends SoftwareDeveloper {

    private String bahasaPemrograman;
    private String database;

    public BackEnd() {
        super.setnama("Kai");
        super.setproyekPenting("Membangun API untuk aplikasi e-commerce");
        super.settahunPengalaman(6);
        this.bahasaPemrograman = "PHP";
        this.database = "PostgreSQL";
    }

    public void setbahasaPemrograman(String bahasa) {
        this.bahasaPemrograman = bahasa;
    }

    public String getbahasaPemrograman() {
        return this.bahasaPemrograman;

    }

    public void setdatabase(String db) {
        this.database = db;
    }

    public String getdatabase() {
        return this.database;
    }

}
