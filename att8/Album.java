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
public class Album {
    private String nome;
    private List<Musica> album;
    
    public Album() {
        album = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addMusica(Musica musica){
        album.add(musica);
    }
    public int numeroDeMusicas(){
        return album.size();
    }
    public void removerMusica(String nome){
        for(Musica m : album){
            if(m.getNome().equals(nome)){
                album.remove(m);
            }
        }
    }
}
