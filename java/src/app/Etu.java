package src.app;

public class Etu {
    private int id_etu;
    private String yearEnter;
    private Class class_id;

    Etu(int id_etu, String yearEnter, Class class_id){
        this.id_etu= id_etu;
        this.yearEnter=yearEnter;
        this.class_id=class_id;
    }
    
    public int getEtuId(){
        return id_etu;
    }
    public String getYearEtu(){
        return yearEnter;
    }
    public Class getEtuClass(){
        return class_id;
    }

}
