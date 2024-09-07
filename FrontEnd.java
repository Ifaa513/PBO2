/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author USER
 */
public class FrontEnd extends SoftwareDeveloper {

    private String teknologi;
    private String designTool;

    public FrontEnd() {
        super.setnama("Kiki");
        super.setproyekPenting("Membangun situs web");
        super.settahunPengalaman(4);
        this.teknologi = "HTML";
        this.designTool = "Figma";
    }

    public void setteknologi(String teknologi) {
        this.teknologi = teknologi;
    }

    public String getteknologi() {
        return this.teknologi;

    }

    public void setdesignTool(String tool) {
        this.designTool = tool;
    }

    public String getdesignTool() {
        return this.designTool;
    }

}
