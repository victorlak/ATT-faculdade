/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import classes.Album;
import classes.Artista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor
 */
public class Gravadora {
    private List<Artista> gravadora;

    public Gravadora() {
        gravadora = new ArrayList<>();
    }
    public String artistaComMaisAlbuns(){
        String artistaComMaisAlbuns = "";
        int controle = 0;
        for(Artista a : gravadora){
            if(a.numeroDeAlbuns()> controle){
                controle = a.numeroDeAlbuns();
                artistaComMaisAlbuns = a.getNome();
            }
        }
        return artistaComMaisAlbuns;
    }
    public String albumComMaisMusicas(){
        String maiorAlbum = "";
        int controle = 0;
        for(Artista a: gravadora){
            List<Album> albuns = a.getAlbuns();
            for(Album album: albuns){
                if(album.numeroDeMusicas() >  controle){
                    maiorAlbum = album.getNome();
                    controle = album.numeroDeMusicas();
                }
            }
        }
        return maiorAlbum;
    
    }
}