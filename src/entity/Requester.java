package entity;

public class Requester extends User{

    public Requester(String name, String email) {
        super(name, email);
    }
    
    public void updateServiceRequestStatus(StatusService.Status status, ServiceRequest sr) {
        sr.setStatus(status);
    }
}
