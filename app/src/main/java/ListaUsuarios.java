import java.util.ArrayList;

public class ListaUsuarios {
    private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    public ArrayList<Usuario> addUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
        return listaUsuarios;
    }
    public boolean coprobarUsuario(Usuario usuario){
        if (listaUsuarios.size() > 0){
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<Usuario> removeUsuario(Usuario usuario){
        listaUsuarios.remove(usuario);
        return listaUsuarios;
    }
}
