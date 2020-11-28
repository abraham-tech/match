import java.util.ArrayList;

import entity.Adminstrator;
import entity.Category;
import entity.Pay;
import entity.Requester;
import entity.Responder;
import entity.ServiceRequest;
import entity.StatusService.Status;

public class App {
    public static void main(String[] args) throws Exception {
        
        Requester requester = new Requester("Abraham", "ab@gmail.com");
        Responder responder_1 = new Responder("Shubhomoy", "sb@gmail.com");
        Responder responder_2 = new Responder("DaiLing", "dl@gmail.com");

        ServiceRequest sr = new ServiceRequest(requester, "maintaninace");
        sr.setStatus(Status.CREATED);

        System.out.println("The first responder is - " + responder_1.getName());
        System.out.println("The second responder is - " + responder_2.getName());

        responder_1.accept(sr);
        responder_2.decline(sr);

        System.out.println("Responder " + responder_1.getName() + " accepted the following requests");
        for (ServiceRequest serviceRequest: responder_1.getAcceptedRequests()) {
            System.out.println(serviceRequest.getName());
        }
        System.out.println("Responder " + responder_1.getName() + " declined the following requests");
        for (ServiceRequest serviceRequest: responder_1.getDeclinedRequests()) {
            System.out.println(serviceRequest.getName());
        }
        
        System.out.println("-------------");

        System.out.println("Responder " + responder_2.getName() + " accepted the following requests");
        for (ServiceRequest serviceRequest: responder_2.getAcceptedRequests()) {
            System.out.println(serviceRequest.getName());
        }
        System.out.println("Responder " + responder_2.getName() + " declined the following requests");
        for (ServiceRequest serviceRequest: responder_2.getDeclinedRequests()) {
            System.out.println(serviceRequest.getName());
        }
        
        System.out.println("-------------");

        System.out.println("Service Status is " + sr.getStatus());
        System.out.println("The requester " + requester.getName() + " marked the service " + sr.getName() + " as completed");
        requester.updateServiceRequestStatus(Status.COMPLETED, sr);
        System.out.println("Service Status is " + sr.getStatus());

        System.out.println("-------------");

        sr.pay(100, Pay.Method.PAYPAL);

        System.out.println("-------------");
        
        Adminstrator admin = new Adminstrator("admin1", "admin@gmail.com");
        responder_1.setActive(false);
        admin.getSystem().updateUser(responder_1);
        System.out.println("The User " + responder_1.getName() + " active status is " + responder_1.isActive());

        System.out.println("-------------");

        ArrayList<Category> categories = admin.getSystem().getCategories();
        System.out.println("Categories in the system");
        for(Category cat: categories) {
            System.out.println(cat.getName());
        }

        System.out.println("-------------");

        Category cat1 = new Category("OddJob");
        Category cat2 = new Category("Tech");
        admin.getSystem().createCategory(cat1);
        admin.getSystem().createCategory(cat2);

        categories = admin.getSystem().getCategories();
        System.out.println("Categories in the system");
        for(Category cat: categories) {
            System.out.println(cat.getName());
        }
    }
}
