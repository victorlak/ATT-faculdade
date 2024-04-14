/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor
 */
public class SerializadorCSVProduto {
    public String toCSV(List<Produto> produtos) {
        String csv = "Codigo;Nome;Custo;Preco;\n";
        for (Produto produto : produtos) {
            csv += produto.getCodigo() + ";"
                +produto.getNome() + ";"
                + produto.getCusto() + ";"
                + produto.getPreco() + ";\n";
        }
        return csv;
    }
    public List<Produto> fromCSV(String data) {
        List<Produto> produtos = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 4) {
                Produto produto = new Produto();
                produto.setCodigo(partes[0]);
                produto.setNome(partes[1]);
                produto.setCusto(Double.parseDouble(partes[2]));
                produto.setPreco(Double.parseDouble(partes[3]));
                
                //apos montar um produto, adiciono na lista
                produtos.add(produto);
            }
        }
        return produtos;
    }
}
