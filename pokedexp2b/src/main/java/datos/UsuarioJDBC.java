/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import dominio.Usuario;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author W10
 */
public class UsuarioJDBC {

   
    private static final String SQL_Select= "Select * from usuarios";
    private static final String SQL_Update= "update usuarios set password=?";
    private static final String SQL_Insert= "insert into usuarios(usuario,password) values(?,?)";
    private static final String SQL_Delete= "delete from usuario where idusuarios=?";

    
    
        public boolean select_validacion(Usuario datos){

Connection conexion=null;
PreparedStatement stmt= null;
ResultSet rs =null;
Usuario usuario = new Usuario();
boolean tiene_permiso= false;
 

        try {
            String Condicion= SQL_Select+" where usuario ='"+datos.getUsername()+""+"' and password='"+datos.getPassword()+"'";
            conexion=ClsConexion.getConnection();
            stmt=conexion.prepareStatement(Condicion);
            rs=stmt.executeQuery();
            System.out.println("Condicion="+Condicion);
            
            while(rs.next()){
                tiene_permiso= true;
                int idusuarios=rs.getInt("idusuarios");
                String usuarios=rs.getString("usuario");
                String password=rs.getString("password");
                
              
                
               
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            ClsConexion.close(conexion);
            ClsConexion.close(stmt);
            ClsConexion.close(rs);
        }



return tiene_permiso;


}
        
        public boolean cambiopwd(Usuario segu){
    Connection conexion=null;
PreparedStatement stmt= null;
ResultSet rs =null;
Usuario usuario = new Usuario();
boolean reset= false;

try {
   String Condicion= SQL_Select+" where usuario ='"+segu.getUsername()+""+"' and seguridad='"+segu.getSeguridad()+"'"; 
    
    conexion=ClsConexion.getConnection();
            stmt=conexion.prepareStatement(Condicion);
            rs=stmt.executeQuery();
            System.out.println("Condicion="+Condicion);
            
            while(rs.next()){
                reset= true;
                int idusuarios=rs.getInt("idusuarios");
                String usuarios=rs.getString("usuario");
                String password=rs.getString("password");
                String seguridad=rs.getString("seguridad");
                
            }
            
            
            
            
            
    
    } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    finally{
            ClsConexion.close(conexion);
            ClsConexion.close(stmt);
            ClsConexion.close(rs);
        }
return reset;
    
}
    
        public int actualizar(Usuario actu){
              Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_Update+" where usuario ='"+actu.getUsername()+"'");
            stmt.setString(1, actu.getPassword());
            
            System.out.println("ejecutando query:" + SQL_Update);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            ClsConexion.close(stmt);
            ClsConexion.close(conn);
        }
            
            
        return rows;    
            
            
            
        }
}
