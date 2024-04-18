/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Victor
 */
public class DataBaseConection {
    private Connection conectar;
    private String user;
    private String url;
    private String senha;

    public DataBaseConection()throws SQLException{        
        this.user = "postgres";
        this.url = "jdbc:postgresql://localhost:5432/jogodb";
        this.senha = "1234";
        this.conectar = DriverManager.getConnection(this.url,this.user,this.senha);
        System.out.println("conexão feita");
        
    }
    public ResultSet executaQuery(String query){
        try{
            Statement executador = this.conectar.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );
            ResultSet response = executador.executeQuery(query);
            return response;
        }catch(SQLException e){
            System.out.println("deu ruim:"+e.getMessage());
            return null;
        }
    }
    
}
