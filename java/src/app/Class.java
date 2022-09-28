package src.app;

public class Class {
    private int class_id;
    private String nom;

    Class(int class_id, String nom){
        this.class_id=class_id;
        this.nom= nom ;
    }

    public int getClassId(){
        return class_id;
    }
    public String getClassName(){
        return nom;
    }
}
