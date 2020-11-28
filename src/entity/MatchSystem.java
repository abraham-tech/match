package entity;

import java.util.ArrayList;

public class MatchSystem {
    
    private static MatchSystem instance = null;
    private DBHelper dbHelper;
  
    private MatchSystem() { 
        dbHelper = new DBHelper();
    } 
  
    public static MatchSystem getInstance() { 
        if (instance == null) {
            instance = new MatchSystem(); 
        }
        return instance; 
    } 
    
    public User updateUser(User user) {
        //TODO update user. 
        return user;
    }
    public Category updateCategory(Category category) {
        //TODO update category
        return category;
    }
    public Category createCategory(Category category) {
        dbHelper.createData(category);
        return category;
    }

    public ArrayList<Category> getCategories() {
        return dbHelper.categories;
    }

    public ServiceRequest updateServiceRequest(ServiceRequest sr){
        //TODO update service request
        return sr;
    }
}
