/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade1xml;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Victor
 */
@XmlRootElement(name = "Musicas")
public class GerenciadorMusica {
    @XmlElement(name="Musica")
    private List<Musica> musicas;

    public GerenciadorMusica() {
        this.musicas = new ArrayList<>();
    }

    public GerenciadorMusica(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }
    public void atualizarMusica(String nome, Musica atualizada){
        for(Musica m : musicas){
            if(m.getTitulo().equals(nome)){
                m.setArtista(atualizada.getArtista());
                m.setDuracaoEmSeg(atualizada.getDuracaoEmSeg());
                m.setPreco(atualizada.getPreco());
                m.setTitulo(atualizada.getTitulo());
            }
        }
    }
    public void addMusica(Musica musica){
        musicas.add(musica);
    }
    public void removeMusica(Musica musica){
        if(buscarMusica(musica.getTitulo()) != null){
            musicas.remove(musica);
        }else{
            System.out.println("Musica não encontrada");
        }
    }
    public Musica buscarMusica(String nome){
        for(Musica m : musicas){
            if(m.getTitulo().equals(nome)){
                return m;
            }
        }
        return null;
    }
    public void carregarDoArquivo(String path) throws FileNotFoundException, JAXBException{
        FilePersistence save_load = new FilePersistence();
        String xmlData = save_load.loadFromFile(path);
        
        XMLserviceMusica serializador = new XMLserviceMusica();
        this.musicas = (List<Musica>) serializador.fromXML(xmlData);
    }
    public void salvarNoArquivo(String path) throws FileNotFoundException, JAXBException, IOException{
        XMLserviceMusica serializador = new XMLserviceMusica();
        String data = serializador.toXML(this);
        
        FilePersistence file = new FilePersistence();
        file.saveToFile(data, path);
        System.out.println("Salvo com sucesso");

    }

    @Override
    public String toString() {
         StringBuilder saida = new StringBuilder();
        for(Musica m : musicas){
            saida.append(m.toString()).append("\n");
        }
        return saida.toString();
    }
    
    
    
}
