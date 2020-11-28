package entity;

import java.util.ArrayList;

public class DBHelper {

    public ArrayList<Category> categories;

    public DBHelper() {
        this.categories = new ArrayList<>();
    }


    public Object createData(Object obj) {
        if (obj instanceof Category) {
            Category category = (Category) obj;
            
            // TODO: Replace list with actual DB
            this.categories.add(category);
            return category;
            
        }
        // else if(obj instanceof ServiceRequest){
        //     ServiceRequest sr = (ServiceRequest) obj;
        //     this.ServiceRequest.add(sr);
        // }

        return null;
    }
    // public Object updateData() {

    // }
    // public Object deleteData() {

    // }
    // public Object readData() {

    // }
    // public Boolean establishConnection() {

    // }
    // public Boolean closeConnection() {

    // }
}