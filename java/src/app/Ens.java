package src.app;


public class Ens extends User {
    private String datePrise;
    private int indice;
    private  Class classe ;


    public Ens(int id, String nom, String prenom, String mail, String phone, String datePrise, int indice) {
        super(id, nom, prenom, mail, phone);
        DataUser();
        this.datePrise = datePrise;
        this.indice = indice;
    }
    public Ens() {
    }

    public String getDatePrise() {
        return datePrise;
    }

    public void setDatePrise(String datePrise) {
        this.datePrise = datePrise;
    }

    public int getIndice(int ens_indice) {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    public void DataUser(){
        User user = new User(this.id,this.nom,this.prenom,this.mail,this.phone);
    }


    public Class getClasse() {
        return classe;
    }

    public void setClasse(Class classe) {
        this.classe = classe;
    }
}
