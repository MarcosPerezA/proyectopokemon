/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author W10
 */
public class Usuario {
    private int id_usuario;
    private String username;
    private String password;
    private String correo;
    private String seguridad;      

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }

    
    
    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", username=" + username + ", password=" + password + ", correo=" + correo + ", seguridad=" + seguridad + '}';
    
    
}  
    
    
}
