package src.app;

import java.util.HashMap;

public class Class {
    private int class_id;
    private String nom;
    private static HashMap<Integer, Etu> etudiants = new HashMap<>(  );



    @Override
    public String toString() {
        return "class_id : " + class_id +
                "       || nom : " + nom ;
    }

    public Class(int class_id, String nom){
        this.class_id=class_id;
        this.nom= nom ;

    }


    public Class() {
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public HashMap<Integer, Etu> getEtudiants() {
        return etudiants;
    }

    public static Etu getEtu(int id){
        return Class.etudiants.get(id);
    }


    public static void setEtudiants(HashMap<Integer, Etu> etudiants) {
        Class.etudiants = etudiants;
    }

    public void setEtudiants(Etu etudiant) {
        this.etudiants.put(etudiant.getId(), etudiant);
    }

}
