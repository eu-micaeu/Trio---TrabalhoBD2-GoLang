/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mechanicalregister;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public Conexao() {

    }

    public Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://containers-us-west-84.railway.app:5884/railway";
        String username = "postgres";
        String password = "BoAfUtIdRiH97dLonFcT";

        Connection conexao = DriverManager.getConnection(url, username, password);
        return conexao;
    }
    
    public Connection getConnectionUsername() throws SQLException {
        String url = "jdbc:postgresql://containers-us-west-84.railway.app:5884/railway";
        String username = "usuario";
        String password = "usuario";

        Connection conexao = DriverManager.getConnection(url, username, password);
        return conexao;
    }
}
