package BACKEND;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpleadoDAO {
    
    Conexion cn = new Conexion();
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    public Empleado Validar(String user, String dpi){
        Empleado em = new Empleado();
        String sql = "select * from empleado when User=? and DPI=?";
        
        try{
            conn = cn.Conexion();
            ps = conn.preparedStatement(sql);
            
        }catch(Exception e){
            
            
        }
        return em;
    }
    
}
