package entity;

public class User {
    private String email;
    private String name;
    private String phone;
    private boolean isActive;

    protected String role;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.isActive = true;
    }

    public String getEmail() {
        return this.email;
    }
    public String getName() {
        return this.name;
    }
    public String getPhone() {
        return this.phone;
    }
    public String getRole() {
        return this.role;
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }

    public boolean isActive() {
        return this.isActive;
    }
}
