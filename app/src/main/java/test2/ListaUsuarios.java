package test2;

import java.util.ArrayList;

public class ListaUsuarios {
    private ArrayList<Usuario> lista;

    public void addUsuario(Usuario usuario){
        for (Usuario usuarioDeLista : lista) {
            if(usuarioDeLista.getCorreu_electronic().equals(usuario.getCorreu_electronic())){
                return;
            }
        }
    }
}
  