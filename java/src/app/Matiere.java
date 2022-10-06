package src.app;

public class Matiere {
    private int id_matiere;
    private String nom ;

    public Matiere() {
    }

    public int getId_matiere() {
        return id_matiere;
    }

    public void setId_matiere(int id_matiere) {
        this.id_matiere = id_matiere;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Matiere{" +
                "id_matiere=" + id_matiere +
                ", nom='" + nom + '\'' +
                '}';
    }

    public Matiere(int id_matiere, String nom){
        this.id_matiere=id_matiere;
        this.nom=nom;
    }

    public int getMatiereId(){
        return id_matiere;
    }
    public String getMatiereName(){
        return nom;
    }
}
