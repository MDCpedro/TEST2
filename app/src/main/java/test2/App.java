package test2;
import java.util.HashMap;
public class App {

    public static HashMap<String, Integer> usuariosExistentes = new HashMap<>();

    public static void main(String[] args) {
    
    }

    public void registrar_usuari(String nom_usuari, String correu_electronic, int ID) {
        if (usuariosExistentes.containsKey(correu_electronic)) && usuariosExistentes.get() {}

        Usuario usuario = new Usuario(nom_usuari, correu_electronic, ID);
        
    }

    
}
