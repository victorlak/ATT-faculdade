/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Victor
 */
public class Musica {
    private String nome;
    private String genero;

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome +"-"+this.genero;
    }
    
    
}
