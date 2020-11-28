package entity;

public class Adminstrator extends User{

    private MatchSystem system;

    public Adminstrator(String name, String email) {
        super(name, email);
        this.role = "admin";
        this.system = MatchSystem.getInstance();
    }
    
    public MatchSystem getSystem(){
        return this.system;
    }
}
