/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor
 */
public class SerializadorCSVAnimal {
    public String toCSV(List<Animal> animais) {
        String csv = "Codigo;Especie;Raça;Peso\n";
        for (Animal a : animais) {
            csv += a.getCodigo() + ";"
                +a.getEspecie()+ ";"
                + a.getRaca()+ ";"
                + a.getPeso()+ ";\n";
        }
        return csv;
    }
    public List<Animal> fromCSV(String data) {
        List<Animal> animais = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 4) {
                Animal a = new Animal();
                a.setCodigo(partes[0]);
                a.setEspecie(partes[1]);
                a.setRaca(partes[2]);
                a.setPeso(Double.parseDouble(partes[3]));
                
                //apos montar um produto, adiciono na lista
                animais.add(a);
            }
        }
        return animais;
    }
}
