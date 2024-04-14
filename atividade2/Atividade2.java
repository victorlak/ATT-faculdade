/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade2;

import com.mycompany.atividade2.gui.FrCadProduto;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Victor
 */
public class Atividade2 {

    public static void main(String[] args) throws SQLException {
        
        FrCadProduto mnhTela = new FrCadProduto();
        mnhTela.setVisible(true);
        
        
    
        
        /*FrCadProduto tela = new FrCadProduto();
        tela.setVisible(true);
        DataBaseConection b = new DataBaseConection();
        String query = "SELECT * from jogadores;";
        ResultSet result = b.executaQuery(query);
        while(result.next()){
            int id = result.getInt("id");
            String nome = result.getString("nome");
            String classe = result.getString("classe");
            System.out.println("id:"+id+"\n");
            System.out.println("nome:"+nome+"\n");
            System.out.println("classe:"+classe+"\n");
        }*/
    }
}
