package BACKEND;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexion {
    
    static Connection conn = null;
    
    public Connection conectar(){
        
        String url = "jdbc:sqlserver://192.168.56.1:1433;databaseName=WEB;user=sa;password=1122encrypt=true;trustServerCertificate=true";
        try{
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
        }catch(ClassNotFoundException e){
            
            System.out.println("Error de SQL" + e.getMessage());
            
        }
        
        try{
            
            conn = DriverManager.getConnection(url, "sa", "1122");
            
            if(conn != null){
                
                System.out.println("Conexion exitosa");
                
            }
            
        }catch(SQLException e){
            
            System.out.println("Error de conexion del driver" + e.getMessage());
            
        }
        
        return null;
        
    }
    
}
