package entity;

public class StatusService {
    public enum Status {
        CREATED,
        INPROGRESS,
        COMPLETED,
        CANCELLED
    }

    private ServiceRequest sr;
    private Status status;

    public StatusService(ServiceRequest sr) {
        this.sr = sr;
    }
    
    public void setStatus(Status status) {
        this.sr.status = status;
        //TODO DB UPDATE
    }
}
