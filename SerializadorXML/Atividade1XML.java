/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade1xml;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Victor
 */
public class Atividade1XML {

    public static void main(String[] args) throws FileNotFoundException, JAXBException, IOException {
        //String titulo, String artista, int duracaoEmSeg, double preco
        Musica musica = new Musica("Calendario","AnaVitoria",200,20);
        Musica musica1 = new Musica("Despedida", "Anitta", 180, 15);
        Musica musica2 = new Musica("Amor Falso", "Wesley Safadão", 220, 18);
        Musica musica3 = new Musica("Meu Abrigo", "Melim", 210, 22);
        Musica musica4 = new Musica("Drivers License", "Olivia Rodrigo", 240, 25);
        Musica musica5 = new Musica("Blinding Lights", "The Weeknd", 200, 30);
        Musica musica6 = new Musica("Watermelon Sugar", "Harry Styles", 190, 28);
        Musica musica7 = new Musica("Levitating", "Dua Lipa", 230, 27);
        Musica musica8 = new Musica("Montero (Call Me By Your Name)", "Lil Nas X", 180, 32);
        Musica musica9 = new Musica("Peaches", "Justin Bieber", 210, 26);
        
        GerenciadorMusica gerente = new GerenciadorMusica();
        
        gerente.addMusica(musica);
        gerente.addMusica(musica1);
        gerente.addMusica(musica2);
        gerente.addMusica(musica3);
        gerente.addMusica(musica4);
        gerente.addMusica(musica5);
        gerente.addMusica(musica6);
        gerente.addMusica(musica7);
        gerente.addMusica(musica8);
        gerente.addMusica(musica9);
        
        gerente.salvarNoArquivo("teste.xml");
        JFcadastroMusica tela = new JFcadastroMusica();
        tela.setVisible(true);
    }
}
