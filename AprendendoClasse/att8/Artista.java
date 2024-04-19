/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor
 */
public class Artista {
    private String nome;
    private int idade;
    private String sexo; // M or F
    private List<Album> albuns;

    public Artista(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.albuns = new ArrayList<>();
    }

    public Artista() {
         this.nome = "";
        this.idade = 0;
        this.sexo = "";
        this.albuns = new ArrayList<>();
    }
    
    public int numeroDeAlbuns(){
        return albuns.size();
    }
    
    
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public List<Album> getAlbuns() {
        return albuns;
    }
    

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setAlbuns(List<Album> albuns) {
        this.albuns = albuns;
    }
    
    
    
}
