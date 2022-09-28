package src.app;

public class Role {
    private int id_role;
    private String role;

    Role(int id, String role){
        this.id_role=id;
        this.role=role;
    }
    
    public int getRoleId(){
        return id_role;
    }
    public String getRoleName(){
        return role;
    }
}
