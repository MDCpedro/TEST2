package test2;

import java.util.ArrayList;

public class ListaUsuarios {
    private ArrayList<Usuario> lista;

    public ListaUsuarios() {
        lista = new ArrayList<>();
    }

    public void addUsuario(Usuario usuario){
        lista.add(usuario);
        return;
    }

    public void removeUsuario(Usuario usuario) {
        lista.remove(usuario);
        return;
    }


    public boolean coprobarUsuario(Usuario usuario) {
        for (Usuario usuarioDeLista : lista) {
            if(usuarioDeLista.getCorreu_electronic().equals(usuario.getCorreu_electronic())){
                return true;
            }
        }
        return false;
    }
}
  