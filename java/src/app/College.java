package src.app;

import java.util.HashMap;

public class College {
    private int college_id;
    private String nom;
    private String address;
    private HashMap<Integer, Deparetement> departements = new HashMap<Integer, Deparetement>();

    public College(int college_id, String nom, String address) {
        this.college_id = college_id;
        this.nom = nom;
        this.address = address;
    }

    public int getCollege_id() {
        return college_id;
    }

    public void setCollege_id(int college_id) {
        this.college_id = college_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public HashMap<Integer, Deparetement> getDepartements() {
        return departements;
    }

    public Deparetement getDepartement(int id) {return this.departements.get(id);}

    public void setDeparetement( int id, Deparetement deparetement) {
        this.departements.put(id, deparetement);
    }
}
