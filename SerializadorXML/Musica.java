/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade1xml;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Victor
 */
@XmlRootElement // ANOTAÇÃO PARA INFORMAR QUE ESSA CLASSE É SERIALIZÁVEL!
public class Musica {
    private String titulo;
    private String artista;
    private int duracaoEmSeg;
    private double preco;

    public Musica(String titulo, String artista, int duracaoEmSeg, double preco) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoEmSeg = duracaoEmSeg;
        this.preco = preco;
    }

    public Musica() {
        this.artista = "";
        this.duracaoEmSeg = 0;
        this.preco= 0.0;
        this.titulo = "";
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracaoEmSeg() {
        return duracaoEmSeg;
    }

    public double getPreco() {
        return preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracaoEmSeg(int duracaoEmSeg) {
        this.duracaoEmSeg = duracaoEmSeg;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "{Titulo:"+this.titulo+"/"+"Artista:"+this.artista+"/"+"Duração em seg:"+this.duracaoEmSeg+"/"+"Preco:"+this.preco+"}";
    }
    
    
}
