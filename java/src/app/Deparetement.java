package src.app;

public class Deparetement {
    private int id_dep;
    private String nom;
    private College college_id;
    private Ens ens_id ;

    Deparetement(int id_dep, String nom, College college_id,Ens id_resp){
        this.id_dep=id_dep;
        this.nom=nom;
        this.college_id=college_id;
        this.ens_id=id_resp;
    }

    public int getDepId(){
        return id_dep;
    }
    public String getDepName(){
        return nom;
    }
    public College getDepCollege(){
        return college_id;
    }
    public Ens getDepResponsable(){
        return ens_id;
    }

}
