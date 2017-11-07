import java.util.ArrayList;

public class Admin extends RootUser {
    public static ArrayList<Request> ListofRequests;

    public Admin() {
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
