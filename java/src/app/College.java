package src.app;

public class College {
    private int college_id;
    private String nom;
    private String address;

    College(int college_id, String nom, String address){
        this.college_id=college_id;
        this.nom=nom;
        this.address=address;
    }

    public int getCollegeId(){
        return college_id;
    }
    public String getCollegeName(){
        return nom;
    }
    public String getCollegeAddress(){
        return address;
    }
}
