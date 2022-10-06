package src.app;

import java.util.HashMap;

public class Deparetement {
    private int id_dep;
    private String nom;
    private HashMap<Integer, Ens> teachers = new HashMap<Integer, Ens>();



    public Deparetement(int id_dep, String nom) {
        this.id_dep = id_dep;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return
                "id_dep : " + id_dep +
                "       || nom : " + nom + '\''
                ;
    }

    public int getId_dep() {
        return id_dep;
    }

    public void setId_dep(int id_dep) {
        this.id_dep = id_dep;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public HashMap<Integer, Ens> getTeachers() {
        return teachers;
    }
    public Ens getTecher(int id) { return this.teachers.get ( id );}

    public void setTeachers(Ens teacher) {
        this.teachers.put(teacher.getId(), teacher);
    }

    //===============



}
