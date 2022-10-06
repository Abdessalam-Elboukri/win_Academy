package src;

import src.app.*;
import src.app.Class;

import java.util.HashMap;

public class Data {

    public static User getUser(){
        Data data = new Data();
        return data.user;
    }
    private static HashMap<Integer, User> users = new HashMap <> (  );
    public static HashMap < Integer, User > getUsers ( ) {
        return users;
    }
    public static void setUser ( User user ) {
        Data.user = user;
    }
    private static User user = new User();

    public static HashMap < Integer, College > col = new HashMap < Integer, College > ( );
    public static HashMap<Integer, College> getCollege(){
        return Data.col;
    }


    public void createCollege ( int college_id , String nom ,  String address ) {
        College col = new College ( college_id , nom , address);
        Data.col.put ( col.getCollege_id( ) , col );
        System.out.println ( "College Ajouter avec Succès" );
    }

    public void createDepartement ( int id_dep , String nom , int collegeReference ) {
        Deparetement departement = new Deparetement( id_dep , nom  );
        Data.col.get(collegeReference).setDeparetement(id_dep , departement);
        System.out.println ( "Deparetement Ajouter avec Succès" );
    }

    //===============
    private static HashMap<Integer, Matiere> matieres = new HashMap <> (  );
    public static void setMatiere(Matiere matiere){
        Data.matieres.put ( matiere.getMatiereId(), matiere );
    }

    public static Matiere getMatiere(int id){
        return Data.matieres.get ( id );
    }

    public static HashMap<Integer, Matiere> getMatieres(){
        return Data.matieres;
    }

//===================================


    public static void staticData(){

        //==============College

        Data.col.put(1,new College(1,"Yc_Safi","Safi"));
        Data.col.put(2,new College(2,"Yc_Youssoufia","Youssoufia"));

        //================Departement

        Data.col.get(1).setDeparetement(1,new Deparetement(1,"Java Deparetement"));
        Data.col.get(1).setDeparetement(2,new Deparetement(2,"Javascript Deparetement"));
        Data.col.get(1).setDeparetement(3,new Deparetement(3,"C# Deparetement"));

        //================Enseignant

        Data.col.get(1).getDepartement(1).setTeachers(new Ens(1,"Bouchra","Marzak","marzak@gmail.com","08823263","12/06/2020",12312));
        Data.col.get(1).getDepartement(2).setTeachers(new Ens(2,"Abdelhafid","belfkir","belfkir@gmail.com","07232833","12/05/2020",28733));
        Data.col.get(1).getDepartement(2).setTeachers(new Ens(3,"Ilyas","Chakir","ilyas@gmail.com","0928372","12/07/2020",23283));

        //================Classe

        Data.col.get(1).getDepartement(1).getTecher(1).setClasse(new Class(1,"pouldar"));
        Data.col.get(1).getDepartement(2).getTecher(2).setClasse(new Class(2,"JavaScript_Knight"));


        //===============Etudiants

        Data.col.get(1).getDepartement(1).getTecher(1).getClasse().setEtudiants(new Etu(1,"Abdessalam","elboukri","abdessalam@gmail.com","872834243","13/05/2020"));
        Data.col.get(1).getDepartement(1).getTecher(1).getClasse().setEtudiants(new Etu(2,"Jamal","raouj","jamal@gmail.com","82372834","14/05/2020"));
        Data.col.get(1).getDepartement(1).getTecher(1).getClasse().setEtudiants(new Etu(3,"abdelAziz","afrakla","afrakla@gmail.com","87837373","16/05/2020"));
        Data.col.get(1).getDepartement(2).getTecher(2).getClasse().setEtudiants(new Etu(4,"Mohammed","Maitit","maitite@gmail.com","637232323","14/05/2020"));
        Data.col.get(1).getDepartement(2).getTecher(2).getClasse().setEtudiants(new Etu(5,"Aymane","darji","aymanedarji@gmail.com","72878232","15/05/2020"));


        //=============Matiere

        Data.matieres.put(1,new Matiere(1,"Java"));
        Data.matieres.put(2,new Matiere(2,"Angular"));
        Data.matieres.put(3,new Matiere(3,"Math"));

    }
}
