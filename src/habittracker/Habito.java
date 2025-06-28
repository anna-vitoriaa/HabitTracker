/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package habittracker;

/**
 *
 * @author USer
 */
public class Habito {
    private String nome;
    private int metaFrequenciaSemanal;
    private Boolean statusHj = null;

    public Habito(String nome, int metaFrequenciaSemanal) {
        this.nome = nome;
        this.metaFrequenciaSemanal = metaFrequenciaSemanal;
    }

    public Habito() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMetaFrequenciaSemanal() {
        return metaFrequenciaSemanal;
    }

    public void setMetaFrequenciaSemanal(int metaFrequenciaSemanal) {
        this.metaFrequenciaSemanal = metaFrequenciaSemanal;
    }

    public Boolean getStatusHj() {
        return statusHj;
    }

    public void setStatusHj(Boolean statusHj) {
        this.statusHj = statusHj;
    }
    
}
