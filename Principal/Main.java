package Principal;
import Vistas.*;
import modelo.*;

// * @author Luz Aide Loaiza Garcia G55


public class Main {
    
    public static void main(String[] args) {
        
        //Crear instancia de conexion 
        Conexion conexionDB = new Conexion ();
        conexionDB.getConnection();
        
        // Crear instancia de Jframe Login1
        
        Login login = new Login ();
        
        login.setVisible(true);
        
        
    }

    }

