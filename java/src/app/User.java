package src.app;

public class User {
    private int id;
    private String nom;
    private String prenom;
    private String mail;
    private String phone;
    private Role id_role;

    User(int id, String nom, String prenom, String mail, String phone, Role id_role){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.mail=mail;
        this.phone=phone;
        this.id_role=id_role;
    }

    public int getUserId(){
        return id;
    }
    public String getUserName(){
        return nom;
    }
    public String getUserPrenom(){
        return prenom;
    }
    public String getUserMail(){
        return mail;
    }
    public String getUserPhone(){
        return phone;
    }
    public Role getUserRole(){
        return id_role;
    }
    
    
}
