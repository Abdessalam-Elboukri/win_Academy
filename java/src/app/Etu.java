package src.app;

import java.util.HashMap;

public class Etu extends User {
    private String yearEnter;
    private HashMap<Integer, Note> notes = new HashMap <> (  );

    public void setNotes(Note note) {
        int count = this.notes.size () +1;
        this.notes.put ( count , note );
    }

    public HashMap<Integer, Note> getEvaluations() {
        return notes;
    }





    public Etu(int id, String nom, String prenom, String mail, String phone, String yearEnter) {
        super(id, nom, prenom, mail, phone);
        this.yearEnter = yearEnter;
    }

    public Etu() {
    }
    public void DataUser(){
        User user = new User(this.id,this.nom,this.prenom,this.mail,this.phone);
    }



    public String getYearEnter() {
        return yearEnter;
    }

    public void setYearEnter(String yearEnter) {
        this.yearEnter = yearEnter;
    }

    @Override
    public String toString() {
        return "Etu{" +
                "yearEnter='" + yearEnter + '\'' +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

