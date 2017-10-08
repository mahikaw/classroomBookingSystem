public class Student extends RootUser {
    public void requestroom(String purpose, int capacity){
        Request newrequest = new Request(purpose,capacity);
        ListofRequests.add(newrequest);
    }
    public void requestroom(String purpose, int capacity, Classroom roomrequired){
        Request newrequest = new Request(purpose,capacity,roomrequired);
        ListofRequests.add(newrequest);
    }
}
