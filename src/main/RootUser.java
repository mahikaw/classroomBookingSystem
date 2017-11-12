package main;

import com.google.gson.annotations.SerializedName;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tgit on 06/10/17.
 */
public class RootUser implements Serializable {

    @SerializedName("type")
    protected String typeofuser;

    @SerializedName("email")
    protected String userEmailId;

    @SerializedName("password")
    protected String password;
//    private static ArrayList<Student> StudentArrayList;
//    private static ArrayList<Faculty> facultyArrayList;
//    private static ArrayList<Classroom> classroomArrayList;
//    private static ArrayList<Course> courseArrayList;

    public RootUser(String userEmailId, String password) {
        this.userEmailId = userEmailId;
        this.password = password;

    }

    public RootUser() {
        super();
    }

    @Override
    public String toString() {
        return typeofuser + " " + userEmailId + " " + password;
    }

    public void logout() {
        //logout user
    }

    public static void serialize(RootUser r) throws IOException {
//        ObjectOutputStream out = null;
//        try {
//            out = new ObjectOutputStream(
//                    new FileOutputStream("users.txt", true));
//
//            out.writeObject(r);
//        } finally {
//            out.close();
//        }
        MongoDatabase database = Application.mongoClient.getDatabase("db");
        MongoCollection<Document> collection_users = database.getCollection("users");
        Document doc = new Document("email", r.getUserEmailId())
                .append("type", r.getTypeofuser())
                .append("password",r.password);
        collection_users.insertOne(doc);

    }

    public static List<RootUser> deserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream in = null;
        List<RootUser> users = new ArrayList<>();
        try {
            in = new ObjectInputStream(
                    new FileInputStream("users.txt"));
            while (true) {
                try {
                    users.add((RootUser) in.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
        } finally {

        }
        return users;
    }

    protected boolean isRoomAvailable(String roomName) {
        //check availability of room
        return false;
    }

    protected ArrayList<Classroom> getAvailableRooms(int minCapacity) {
        ArrayList<Classroom> availableClassrooms = new ArrayList<Classroom>();
        return availableClassrooms;
    }

    protected void cancelRoomBooking(String roomName) {
        //check the availability of the room
    }

    protected void bookRoom(String roomName, String courseName) {
        //book a room for the course
    }


    public String getUserEmailId() {
        return userEmailId;
    }

//    public ArrayList<Student> getStudentArrayList() {
//        return StudentArrayList;
//    }
//
//    public ArrayList<Faculty> getFacultyArrayList() {
//        return facultyArrayList;
//    }
//
//    public ArrayList<Classroom> getClassroomArrayList() {
//        return classroomArrayList;
//    }
//
//    public ArrayList<Course> getCourseArrayList() {
//        return courseArrayList;
//    }

    public String getTypeofuser() {
        return typeofuser;
    }
}
