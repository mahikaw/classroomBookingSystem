package main;
import java.util.ArrayList;

public class Admin extends RootUser {
    public static ArrayList<Request> ListofRequests = new ArrayList<Request>();


    public Admin(String email, String password) {
        super(email,password);
        super.typeofuser = "Admin";
    }

    public void acceptrequest(Request studentRequest) {
    }

    public void rejectRequest(Request studentRequest){

    }
    public ArrayList<Request> getListofRequests() {
        return ListofRequests;
    }

}
