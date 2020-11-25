package entity;

import entity.StatusService.Status;

public class ServiceRequest {
    private Requester requester;
    private String name;
    private String description;
    private int personsNeeded;

    private Image image;
    private Category category;
    private StatusService statusService;
    
    
    public StatusService.Status status;

    public ServiceRequest(Requester requester, String name) {
        this.requester = requester;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setStatus(StatusService.Status status){
        this.statusService = new StatusService(ServiceRequest.this);
        this.statusService.setStatus(status);
    }

    public StatusService.Status getStatus() {
        return this.status;
    }
}
