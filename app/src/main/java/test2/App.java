package test2;
import java.util.HashMap;
public class App {

    public static HashMap<String, Integer> usuariosExistentes = new HashMap<>();

    public static void main(String[] args) {
        App.registrar_usuari("Paco", "paco1000@gmail.com", 1);
        App.registrar_usuari("Paco", "paco1000@gmail.com", 2);
        App.registrar_usuari("Paco", null, 2);
    }

    public static Usuario registrar_usuari(String nom_usuari, String correu_electronic, int ID) {
        if (usuariosExistentes.containsKey(correu_electronic) && usuariosExistentes.get(correu_electronic) == ID) {
            System.out.println("Ya exsite el usuario");
            return null;
        }

        // Usuario usuario = new Usuario(nom_usuari, correu_electronic, ID);
        usuariosExistentes.put(correu_electronic, ID);
        System.out.println("Usuario creado");
        return registrar_usuari(nom_usuari, correu_electronic, ID);   
    }

}
