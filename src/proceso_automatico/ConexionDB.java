/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proceso_automatico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LolaA
 */
public class ConexionDB {
     private static Connection conn = null;

public static Connection connect() {
        try {
            // URL de conexión
            String url = "jdbc:sqlite:database/050524.db";
            
            conn = DriverManager.getConnection(url);
            
            System.out.println("Conexión a SQLite establecida.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void disconnect() {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Conexión a SQLite cerrada.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}