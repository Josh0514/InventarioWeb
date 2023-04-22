package BACKEND;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    static Connection conn =null;
    
    public static Connection conectar(){
        String url="jdbc:sqlserver://localhost:1433;databaseName=db_ventas;Encrypt=true;TrustServerCertificate=false;";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error de sql " + e.getMessage());
        }
        
        try {
            conn=DriverManager.getConnection(url,"sa","1122");
            if(conn != null){
                System.out.println("Conexion Exitosa a la Base de datos");
            }
        } catch (SQLException e) {
            System.out.println("Error de conexion del driver. "+ e.getMessage());
        }
        return conn;
    }
}
 