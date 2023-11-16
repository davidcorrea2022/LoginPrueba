

package persistencia;

import Logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController (); 

    public List<Usuario> traerUsuarios() {
       
        List <Usuario> listaUsuario= usuJpa.findUsuarioEntities();
        //esto equivale a como si estuviera poniendo codigo en sql SELECT*FROM USUARIOS
        return listaUsuario;
    }
    
}
