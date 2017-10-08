import java.util.ArrayList;

public class Admin extends RootUser {
    public Admin(String Email){
        super(Email);
        super.typeofuser ="Admin";
    }
    public void acceptrequest(Request studentrequest){
        studentrequest.setAccepted(false);
    }
}
