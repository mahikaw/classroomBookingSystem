package main;
public class Faculty extends RootUser {
    public Faculty(String email, String password) {
        super(email,password);
        typeofuser = "Faculty";
    }
}
