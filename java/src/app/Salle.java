package src.app;

public class Salle {
    private int id_salle;
    private String nom;
    private Deparetement id_dep;

    Salle(int id_salle, String nom, Deparetement id_dep){
        this.id_salle=id_salle;
        this.nom=nom;
        this.id_dep=id_dep;
    }

    public int getSalleId(){
        return id_salle;
    }
    public String getSalleName(){
        return nom;
    }
    public Deparetement getSalleDe(){
        return id_dep;
    }
}
