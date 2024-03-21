package test2;

public class Usuario {
    private String nom_usuari; 
    private String correu_electronic;
   

    public Usuario(String nom_usuari, String correu_electronic) {
        this.nom_usuari = nom_usuari;
        this.correu_electronic = correu_electronic;

    }
    public void setCorreu_electronic(String correu_electronic) {
        this.correu_electronic = correu_electronic;
    }
    public String getCorreu_electronic() {
        return correu_electronic;
    }

    
}
