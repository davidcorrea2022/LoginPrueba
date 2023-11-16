
package Logica;

import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis;// = new ControladoraPersistencia ();

    public Controladora() {
        controlPersis= new ControladoraPersistencia();
    }
    
    

 

    public String validarUsuario(String usuario, String contrasenia) {
        
        String mensaje="";
        List<Usuario> listaUsuarios= controlPersis.traerUsuarios();
        
        for (Usuario usu : listaUsuarios){
            if (usu.getNombreUsuario().equals(usuario)){
               if (usu.getContraseña().equals(contrasenia)){
                   mensaje= "Usuario y contraseña correctos";
                   return mensaje;
               } 
               else{
                   mensaje="Contrasena incorrecta";
                   return mensaje;
               }
            
            }
            else {
                   mensaje="Usuario no encontrado";
                  
            }
        }
        
                
         return mensaje;         
    }
}  

