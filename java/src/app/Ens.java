package src.app;


public class Ens {
    private int ens_id;
    private String datePrise;
    private int indice;
    private Deparetement id_dep;
    private Matiere id_matiere;

    Ens(int ens_id, String datePrise, int indice, Deparetement id_dep, Matiere id_matiere){
        this.ens_id=ens_id;
        this.datePrise=datePrise;
        this.indice=indice;
        this.id_dep=id_dep;
        this.id_matiere=id_matiere;
    }

    public int getEnsId(){
        return ens_id;
    }
    public String getEnsdatePrise(){
        return datePrise;
    }
    public int getEnsIndice(){
        return indice;
    }
    public Deparetement getEnsIdDep(){
        return id_dep;
    }
    public Matiere getEnsMatiere(){
        return id_matiere;
    }

}
