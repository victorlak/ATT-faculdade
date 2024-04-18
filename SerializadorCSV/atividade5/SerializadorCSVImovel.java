/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor
 */
public class SerializadorCSVImovel {
    public String toCSV(List<Imovel> animais) {
        String csv = "Tipo;Numero de quartos;Numero de banheiros;Area;Preço\n";
        for (Imovel a : animais) {
            csv += a.getTipo()+ ";"
                +a.getNumeroQuartos()+ ";"
                + a.getNumeroBanheiros()+ ";"
                + a.getArea()+ ";"
                + a.getPreco()+";\n";
        }
        return csv;
    }
    public List<Imovel> fromCSV(String data) {
        List<Imovel> carros = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 5) {
                Imovel a = new Imovel();
                a.setTipo(partes[0]);
                a.setNumeroQuartos(Integer.parseInt(partes[1]));
                a.setNumeroBanheiros(Integer.parseInt(partes[2]));
                a.setArea(Integer.parseInt(partes[3]));
                a.setPreco(Double.parseDouble(partes[4]));
                
                
                carros.add(a);
            }
        }
        return carros;
    }
}
