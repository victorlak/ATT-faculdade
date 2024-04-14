/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor
 */
public class SerializadorCSVCarro {
    public String toCSV(List<Carro> animais) {
        String csv = "Modelo;Marca;Ano;Preço\n";
        for (Carro a : animais) {
            csv += a.getModelo()+ ";"
                +a.getMarca()+ ";"
                + a.getAno()+ ";"
                + a.getPreco()+ ";\n";
        }
        return csv;
    }
    public List<Carro> fromCSV(String data) {
        List<Carro> carros = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 4) {
                Carro a = new Carro();
                a.setModelo(partes[0]);
                a.setMarca(partes[1]);
                a.setAno(partes[2]);
                a.setPreco(Double.parseDouble(partes[3]));
                
                //apos montar um produto, adiciono na lista
                carros.add(a);
            }
        }
        return carros;
    }
}
