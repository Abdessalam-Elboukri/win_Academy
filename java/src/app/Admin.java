package src.app;

import src.Data;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Admin extends User {
    private int id;

    Admin(int id, String nom, String prenom, String mail, String phone) {
        super(id, nom, prenom, mail, phone);
        this.id=id;
    }

    public int getAdminId(){
        return id;
    }

        public static void ManageCollege(){
        int choix = 0;
        Scanner s = new Scanner(System.in);
            do{
                System.out.println("1 => Ajouter Un Noveaux College ");
                System.out.println("2 => Afficher Les colleges");
                System.out.println("3 => Modifier les info d'un College");
                System.out.println("0 => Cancel");
                System.out.println("choisissez  Votre Choix : ");
                choix=s.nextInt();

                switch(choix){
                    case 1 : {
                        createCollege();
                        }
                    case 2 : {
                        afficheColleges();
                    }
                    case 3 : {

                    }
                    }

        }while(choix!=0);
        }


        //Manage Deparetement
        public static void ManageDeparetement(){
            int choix = 0;
            Scanner s = new Scanner(System.in);
            do{
                System.out.println("1 => Ajouter Un Noveaux Departement ");
                System.out.println("2 => Afficher Les Departements");
                System.out.println("3 => Modifier les info d'un Departement");
                System.out.println("0 => Cancel");
                System.out.println("choisissez Votre Choix : ");
                choix=s.nextInt();

                switch(choix){
                    case 1 : {
                        createDepartement();
                        break;
                    }
                    case 2 : {
                        afficheDepartement();
                        break;
                    }
                    case 3 : {

                    }
                }

            }while(choix!=0);
        }

        //update College
    public static  void updateCollege(){
        int ch;
        afficheColleges();
        System.out.println("Entrer le ref de college");
        int col_id = s.nextInt();
        System.out.println("1. Update school name");
        System.out.println("2. Update school site");
        System.out.println("choisissez Votre Choix : ");
        ch=s.nextInt();
        switch (ch){
            case 1 :{
                updateCollegeName(col_id);
            }
            case 2 :{
                updateCollegeAddress(col_id);
            }
        }
    }
    public static void updateCollegeName(int col_id){
        College college = Data.col.get(col_id);
        System.out.println("Enter le neveau Nom: ");
        String new_col_name = s.nextLine();
        college.setNom(new_col_name);
        Data.col.put(college.getCollege_id(), college);
        System.out.println("les changemeent a bien effectuer");
    }
    public static void updateCollegeAddress(int col_id){
        College college = Data.col.get(col_id);
        System.out.println("Enter le neveau Address: ");
        String new_col_address = s.nextLine();
        college.setAddress(new_col_address);
        Data.col.put(college.getCollege_id(), college);
        System.out.println("les changemeent a bien effectuer");
    }

        //Manage Enseignant

    public static void ManageEnseignant(){
        int choix = 0;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("1 => Ajouter Un Noveaux Enseignant ");
            System.out.println("2 => Afficher Les Enseignant");
            System.out.println("3 => Modifier les info d'un Enseignant");
            System.out.println("0 => Cancel");
            System.out.println("choisissez Votre Choix : ");
            choix=s.nextInt();

            switch(choix){
                case 1 : {
                    createEnseignant();
                    break;
                }
                case 2 : {
                    afficheEnseignant();
                    break;
                }
                case 3 : {

                }
            }

        }while(choix!=0);
    }

    //Manage Etudiants

    public static void ManageEtudiants(){
        int choix = 0;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("1 => Ajouter Un Noveaux Etudiant");
            System.out.println("2 => Afficher Les Etudiants ");
            System.out.println("3 => Modifier les info d'un etudiant");
            System.out.println("0 => Cancel");
            System.out.println("choisissez Votre Choix : ");
            choix=s.nextInt();

            switch(choix){
                case 1 : {
                    createEtudiant();
                    break;
                }
                case 2 : {
                    afficheEtudiants();
                    break;
                }
                case 3 : {

                }
            }

        }while(choix!=0);
    }


    //Manage Classes
    public static void ManageClasses(){
        int choix = 0;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("1 => Ajouter Un Noveaux Classe");
            System.out.println("2 => Afficher Les Classes ");
            System.out.println("3 => Modifier les info d'un Classe");
            System.out.println("0 => Cancel");
            System.out.println("choisissez Votre Choix : ");
            choix=s.nextInt();

            switch(choix){
                case 1 : {
                    createClasse();
                    break;
                }
                case 2 : {
                    afficheClasse();
                    break;
                }
                case 3 : {

                }
            }

        }while(choix!=0);
    }


    //manage matiere
    public static void ManageMatiere(){
        int choix = 0;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("1 => Ajouter Un Noveaux Matiere");
            System.out.println("2 => Afficher Les Matiere ");
            System.out.println("3 => Modifier les info d'un Matiere");
            System.out.println("0 => Cancel");
            System.out.println("choisissez Votre Choix : ");
            choix=s.nextInt();

            switch(choix){
                case 1 : {
                    createMatiere();
                    break;
                }
                case 2 : {
                    afficheClasse();
                    break;
                }
                case 3 : {

                }
            }

        }while(choix!=0);
    }




    //create college
    static Scanner s=new Scanner(System.in);
    static Scanner st=new Scanner(System.in);
    static Data data=new Data();
    public static void createCollege(){
        System.out.println("Entrer Le Reference de College");
        int col_id = s.nextInt();
        System.out.println("Entrer Le Nom de College");
        String col_Name = st.nextLine();
        System.out.println("Entrer L'address de College");
        String col_address = st.nextLine();
        data.createCollege(col_id,col_Name,col_address);

        }

        //Afficher les colleges
        public static void afficheColleges()
        {
            data.col.forEach((key, value) ->System.out.println("Reference: " + key + "        || Nom: " + value.getNom() + "     " +
                    "   || Address: " + value.getAddress() + "\n-------------------------------------------------------------"));
        }

    //create departement
    private static void createDepartement() {
        afficheColleges();
        System.out.println("Entrer Le Reference de College");
        int col_id = s.nextInt();
        System.out.println("Entrer Le Reference d'un depertement");
        int dep_id = s.nextInt();
        System.out.println("Entrer Le Nom de departement");
        String dep_Name = st.nextLine();
        data.createDepartement(dep_id,dep_Name,col_id);
    }


    public static int afficheDepartement()
    {
        afficheColleges();
        System.out.println("Entrer Le Reference de College pour voir ses depertements");
        AtomicInteger id_departement = new AtomicInteger();
        int col_id = s.nextInt();
        data.col.get(col_id).getDepartements().forEach((key, value)-> {
                    System.out.println("Reference: " + key + "         || Nom: " + value.getNom() + "         " +
                            "|| Departement id : " + value.getId_dep() + "\n-------------------------------------------------------------");
                    id_departement.set(value.getId_dep());
                }

        );

        return id_departement.get();

    }


    //Create Enseignant
    public static void createEnseignant() {
        afficheColleges();
        Ens enseignent = new Ens( );
        System.out.println("Selectionner le id de college");
        int col_id = s.nextInt();
        System.out.println("\n============================");
        data.col.get(col_id).getDepartements().forEach((key, value)-> System.out.println("Reference: " + key + "     || Nom: " + value.getNom() + "    " +  "|| Departement id : " + value.getId_dep() + "\n-------------------------------------"));
        System.out.println("Selectionner le Deparetement");
        int dep_id = s.nextInt();
        data.col.get(col_id).getDepartement(dep_id).getTeachers().forEach((key, value)-> System.out.println("Reference: " + key + "   || Nom: " + value.getNom() + "      " +
                "   || Prenom : " + value.getPrenom() + "    || Email : " + value.getMail() + "   || Phone : " + value.getPhone() + "   || Date de prise : " + value.getDatePrise() + "\n-------------------------------------------------------------"));
        System.out.println("Entrer le ref de Enseignant");
        int Ens_ref = st.nextInt();
        System.out.println("Entrer le nom de Enseignant");
        String Ens_name = st.nextLine();
        enseignent.setNom(Ens_name);
        System.out.println("Entrer le prenom de Enseignant");
        String Ens_prenom = st.nextLine();
        enseignent.setPrenom(Ens_prenom);
        System.out.println("Entrer email de Enseignant");
        String Ens_mail = st.nextLine();
        enseignent.setMail(Ens_mail);
        System.out.println("Entrer email de Enseignant");
        String Ens_phone = st.nextLine();
        enseignent.setPhone(Ens_phone);
        System.out.println("Entrer Date Fonction de Enseignant");
        String Ens_depart = st.nextLine();
        enseignent.setDatePrise(Ens_depart);
        System.out.println("Entrer l'indice de Enseignant");
        int Ens_indice = s.nextInt();
        enseignent.getIndice(Ens_indice);
        //========
        enseignent.DataUser();
        data.col.get(col_id).getDepartement(dep_id).setTeachers(enseignent);
    }
    //Afficher les Enseignants
    public static void afficheEnseignant() {
        afficheColleges();
        System.out.println("Entrer Le Reference de College pour voir ses depertements");
        int col_id = s.nextInt();
        data.col.get(col_id).getDepartements().forEach((key, value)-> System.out.println("Reference: " + key + "     || Nom: " + value.getNom() + "    " +  "|| Departement id : " + value.getId_dep() + "\n-------------------------------------"));
        System.out.println("Entrer Le Reference de departement");
        int dep_id = s.nextInt();
        data.col.get(col_id).getDepartement(dep_id).getTeachers().forEach((key, value) -> System.out.println("Reference: " + key + "   || Nom: " + value.getNom() + "      " +
                "   || Prenom : " + value.getPrenom() + "    || Email : " + value.getMail() + "   || Phone : " + value.getPhone() + "   || Date de prise : " + value.getDatePrise() + "\n-------------------------------------------------------------"));
    }


    //Create classe
    public static void createClasse(){
        Class classe= new Class();
        afficheColleges();
        System.out.println("Entrer le reference de college");
        int col_id= s.nextInt();
        afficheDepartement();
        System.out.println("Entrer le reference de Departement");
        int dep_id=s.nextInt();
        System.out.println("Entrer Le Reference de Class");
        int class_ref=st.nextInt();
        classe.setClass_id(class_ref);
        System.out.println("Entrer Le Nom de Class");
        String class_name=st.nextLine();
        classe.setNom(class_name);
        System.out.println("Asigner l'enseignant de Class");
        int ens_active =s.nextInt();
        data.col.get(col_id).getDepartement(dep_id).getTecher(ens_active).setClasse(classe);
    }

    public static void afficheClasse(){
        afficheColleges();
        System.out.println("Entrer Le Reference de College pour voir ses depertements");
        int col_id = s.nextInt();
        data.col.get(col_id).getDepartements().forEach((key, value)-> System.out.println("Reference: " + key + "     || Nom: " + value.getNom() + "    " +  "|| Departement id : " + value.getId_dep() + "\n-------------------------------------"));

        System.out.println("Entrer Le Reference de departement");
        int dep_id = s.nextInt();
        data.col.get(col_id).getDepartement(dep_id).getTeachers().forEach((key, value) -> System.out.println("Reference: " + key + "   || Nom: " + value.getNom() + "      " +
                "   || Prenom : " + value.getPrenom() + "    || Email : " + value.getMail() + "   || Phone : " + value.getPhone() + "   || Date de prise : " + value.getDatePrise() + "\n-------------------------------------------------------------"));

        System.out.println("Entrer Le Reference de Enseignant");
        int ens_id = s.nextInt();

        System.out.println(data.col.get(col_id).getDepartement(dep_id).getTecher(ens_id).getClasse().toString());
    }


    //create ETUDIANT
    public static void createEtudiant() {
        Etu etudiant=new Etu();
        afficheColleges();
        System.out.println("Entrer Le Reference de College pour voir ses depertements");
        int col_id = s.nextInt();
        data.col.get(col_id).getDepartements().forEach((key, value)-> System.out.println("Reference: " + key + "     || Nom: " + value.getNom() + "    " +  "|| Departement id : " + value.getId_dep() + "\n-------------------------------------"));

        System.out.println("Entrer Le Reference de departement");
        int dep_id = s.nextInt();
        data.col.get(col_id).getDepartement(dep_id).getTeachers().forEach((key, value) -> System.out.println("Reference: " + key + "   || Nom: " + value.getNom() + "      " +
                "   || Prenom : " + value.getPrenom() + "    || Email : " + value.getMail() + "   || Phone : " + value.getPhone() + "   || Date de prise : " + value.getDatePrise() + "\n-------------------------------------------------------------"));

        System.out.println("Entrer Le Reference de Enseignant");
        int ens_id = s.nextInt();
        System.out.println(data.col.get(col_id).getDepartement(dep_id).getTecher(ens_id).getClasse().toString());
        System.out.println("Entrer Le Reference d'etudient");
        int etu_id = s.nextInt();
        etudiant.setId(etu_id);
        System.out.println("Entrer Le Nom d'etudient");
        String etu_name = st.nextLine();
        etudiant.setNom(etu_name);
        System.out.println("Entrer Le prenom d'etudient");
        String etu_prenom = st.nextLine();
        etudiant.setPrenom(etu_prenom);
        System.out.println("Entrer email d'etudient");
        String etu_mail = st.nextLine();
        etudiant.setMail(etu_mail);
        System.out.println("Entrer le phone d'etudient");
        String etu_phone = st.nextLine();
        etudiant.setPhone(etu_phone);
        System.out.println("Entrer l'année d'entrer d'etudient");
        String etu_year_enter= st.nextLine();
        etudiant.setYearEnter(etu_year_enter);
        System.out.println("Choisissez le class pour cette etudiant :");

        etudiant.DataUser();
        data.col.get(col_id).getDepartement(dep_id).getTecher(ens_id).getClasse().setEtudiants(etudiant);
    }


    public static void afficheEtudiants(){
        afficheColleges();
        System.out.println("Entrer Le Reference de College pour voir ses depertements");
        int col_id = s.nextInt();
        data.col.get(col_id).getDepartements().forEach((key, value)-> System.out.println("Reference: " + key + "     || Nom: " + value.getNom() + "    " +  "|| Departement id : " + value.getId_dep() + "\n-------------------------------------"));

        System.out.println("Entrer Le Reference de departement");
        int dep_id = s.nextInt();
        data.col.get(col_id).getDepartement(dep_id).getTeachers().forEach((key, value) -> System.out.println("Reference: " + key + "   || Nom: " + value.getNom() + "      " +
                "   || Prenom : " + value.getPrenom() + "    || Email : " + value.getMail() + "   || Phone : " + value.getPhone() + "   || Date de prise : " + value.getDatePrise() + "\n-------------------------------------------------------------"));

        System.out.println("Entrer Le Reference de Enseignant");
        int ens_id = s.nextInt();

        System.out.println(data.col.get(col_id).getDepartement(dep_id).getTecher(ens_id).getClasse().toString());

        data.col.get(col_id).getDepartement(dep_id).getTecher(ens_id).getClasse().getEtudiants().forEach((key, value) -> System.out.println("Reference: " + key + "   || Nom: " + value.getNom() + "      " +
                "   || Prenom : " + value.getPrenom() + "    || Email : " + value.getMail() + "   || Phone : " + value.getPhone() + "   || Date de prise : " + value.getYearEnter() + "\n-------------------------------------------------------------"));

    }

    public static void createMatiere() {
        Matiere matiere=new Matiere();
        System.out.println("Entrer Le reference de Matiere :");
        int matiere_id=s.nextInt();
        matiere.setId_matiere(matiere_id);
        System.out.println("Entrer Le Nom de Matiere :");
        String matiere_name=s.nextLine();
        matiere.setNom(matiere_name);
        Data.setMatiere(matiere);
    }

    public static void afficheMatiere(){
        System.out.println(Data.getMatieres().toString());
    }

    public static void addNote(){
        Note note = new Note();
        showAllEtudiants();
        System.out.println ( "Entrer le ref d'etudiant: ");
        int etu_ref=s.nextInt();
        System.out.println (Data.getMatieres ().toString () );
        System.out.println ( "Entrer le numero de matiere : ");
        int mat_ref=s.nextInt();
        note.setId_matiere(mat_ref);
        System.out.println("Entrer le note pour l'eudiant");
        double note_=s.nextDouble();
        note.setNote(note_);
        System.out.println("Entrer la date");
        String date_note=s.nextLine();
        note.setDate(date_note);

        Class.getEtu(etu_ref).setNotes(note);


    }








    public static void Filtrage(){
        int choix = 0;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("1 => Afficher tous les etudiants");
            System.out.println("2 => Afficher tous les enseignants");
            System.out.println("3 => afficher tous les departement");
            System.out.println("4 => Show all account");
            System.out.println("0 => Cancel");
            System.out.println("choisissez Votre Choix : ");
            choix=s.nextInt();

            switch(choix){
                case 1 : {
                    showAllEtudiants();
                    break;
                }
                case 2 : {

                    break;
                }
                case 3 : {

                }
                case 4 : {
                    showAccount();
                }
            }

        }while(choix!=0);
    }
    public static void showAllEtudiants(){
        afficheColleges();

        System.out.println("Entrer Le Reference de College pour voir Les Etudients");
        int col_id = s.nextInt();
        Data.col.get(col_id).getDepartement(1).getTeachers().forEach((key1,value1)->{
                value1.getClasse().getEtudiants().forEach((key2,value2)->{
                    System.out.println("Reference: " + value2.getId() + "   || Nom: " + value2.getNom() + "      " +
                            "   || Prenom : " + value2.getPrenom() + "    || Email : " + value2.getMail()
                            + "   || Phone : " + value2.getPhone() + "   || Date de Entrer : " + value2.getYearEnter() + "\n-------------------------------" );
                });
            });

    }

    public static void showAccount(){
        Data.getUsers().forEach( (key, value) ->{
            System.out.println (value.getMail () );
        } );
    }

}
