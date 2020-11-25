package entity;

public class Category {
    private int id;
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
