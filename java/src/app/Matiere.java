package src.app;

public class Matiere {
    private int id_matiere;
    private String nom ;
    private Salle id_salle;

    Matiere(int id_matiere, String nom, Salle id_salle){
        this.id_matiere=id_matiere;
        this.nom=nom;
        this.id_salle=id_salle;
    }

    public int getMatiereId(){
        return id_matiere;
    }
    public String getMatiereName(){
        return nom;
    }
    public Salle getMatiereSalle(){
        return id_salle;
    }
}
