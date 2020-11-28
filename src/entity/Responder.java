package entity;

import java.util.ArrayList;

public class Responder extends User {

    private ArrayList<ServiceRequest> acceptedServiceRequests;
    private ArrayList<ServiceRequest> declinedServiceRequests;
    private ArrayList<Category> categories;

	public Responder(String name, String email) {
		super(name, email);
        acceptedServiceRequests = new ArrayList<>();
        declinedServiceRequests = new ArrayList<>();
        categories = new ArrayList<>();
	}
    
    public ArrayList<ServiceRequest> getAcceptedRequests() {
        return this.acceptedServiceRequests;
    }

    public ArrayList<ServiceRequest> getDeclinedRequests() {
        return this.declinedServiceRequests;
    }

    public ArrayList<Category> getCategories() {
        return this.categories;
    }

    public void accept(ServiceRequest sr) {
        this.acceptedServiceRequests.add(sr);
    }
    public void decline(ServiceRequest sr) {
        this.declinedServiceRequests.add(sr);
    }
}

