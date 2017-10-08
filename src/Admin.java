import java.util.ArrayList;

public class Admin extends RootUser {
    public void acceptrequest(Request studentrequest){
        studentrequest.setAccepted(false);
    }
}
