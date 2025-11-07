package es.edu.empresas.dao;

import java.awt.event.WindowStateListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private static Connection conn;
    private static ConnectionManager instance;

    private ConnectionManager() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:a.db");
            System.out.println("Conectado");
        } catch (SQLException e) {
            mensajesErrorSQL(e);
        }
    }

    public static Connection getConnection() {
        if (instance == null) {
            instance = new ConnectionManager();
        }
        return conn;
    }

    public static void mensajesErrorSQL(SQLException e) {
        System.out.println(e.getErrorCode() + "\n" + e.getSQLState());
    }

    public static void cerrarConexion() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                mensajesErrorSQL(e);
            }
        }
    }
}



