package main;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCursor;
import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.bson.Document;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by tgit on 06/10/17.
 */
public class Application extends javafx.application.Application {

    public static List<RootUser> users = new ArrayList<>();
    public static MongoClient mongoClient = new MongoClient("localhost", 27017);
    public static RootUser currentUser;
    public static int requestCounter = 0;
    public static ObservableList<Course> ListofCourses = new ObservableList<Course>() {
        @Override
        public boolean add(Course e) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public void add(int index, Course element) {
            // TODO Auto-generated method stub

        }

        @Override
        public boolean addAll(Collection<? extends Course> c) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Course> c) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public void clear() {
            // TODO Auto-generated method stub

        }

        @Override
        public boolean contains(Object o) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public Course get(int index) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public int indexOf(Object o) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public boolean isEmpty() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public Iterator<Course> iterator() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public int lastIndexOf(Object o) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public ListIterator<Course> listIterator() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public ListIterator<Course> listIterator(int index) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public boolean remove(Object o) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public Course remove(int index) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public Course set(int index, Course element) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public int size() {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public List<Course> subList(int fromIndex, int toIndex) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Object[] toArray() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public <T> T[] toArray(T[] a) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public void addListener(InvalidationListener listener) {
            // TODO Auto-generated method stub

        }

        @Override
        public void removeListener(InvalidationListener listener) {
            // TODO Auto-generated method stub

        }

        @Override
        public boolean addAll(Course... elements) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public void addListener(ListChangeListener<? super Course> listener) {
            // TODO Auto-generated method stub

        }

        @Override
        public void remove(int from, int to) {
            // TODO Auto-generated method stub

        }

        @Override
        public boolean removeAll(Course... elements) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public void removeListener(ListChangeListener<? super Course> listener) {
            // TODO Auto-generated method stub

        }

        @Override
        public boolean retainAll(Course... elements) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean setAll(Course... elements) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean setAll(Collection<? extends Course> col) {
            // TODO Auto-generated method stub
            return false;
        }
    };


    //JavaFX components
    Stage mainStage;

    public static void deserializingData() throws IOException, ClassNotFoundException {
//        Application.users = RootUser.deserialize();
//        System.out.println("number os users:"+Application.users.size());
//        for (RootUser r:users){
//            System.out.println(r.toString());
//        }
        MongoCursor<Document> cursor = Application.mongoClient
                .getDatabase("db")
                .getCollection("users")
                .find().iterator();
        try {
            while (cursor.hasNext()) {
                Gson g = new Gson();
                String json = cursor.next().toJson();
                RootUser a = g.fromJson(json, RootUser.class);
                users.add(a);
            }
        } finally {
            cursor.close();
        }
//System.out.println("users in databseeeee");
//        for (RootUser e:users){
//            System.out.println(e.toString());
//        }
    }

    public static void main(String args[]) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Application.deserializingData();
        mainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("../Resources/Login.fxml"));
        primaryStage.setTitle("IIIT-D Classroom Booking System");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setFullScreen(true);
        primaryStage.show();
        BufferedReader br = new BufferedReader(new FileReader("./src/courses.txt"));
        try {
            br.readLine();
            String line = br.readLine();

            while (line != null) {
                line = br.readLine();
                if (line.isEmpty()) {
                    br.readLine();
                    line = br.readLine();
                    String name = br.readLine();
                    String pre = br.readLine();
                    String desc = br.readLine();
                    //Course newc = new Course(line, name, pre, desc, 50, 4/*(int) title[2].charAt(0)*/);
                    //ListofCourses.add(newc);
                    //System.out.println(newc);
                }
                //System.out.println(ListofCourses.get(5));
            }
        } finally {
            br.close();
        }
        TimeTable t = new TimeTable(new HashMap<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        t.read();
//        t.showTimetable();
    }

    public ArrayList<Course> searchcourses(String keywords) {
        //do search
        int xyz;
        return (ArrayList<Course>) ListofCourses;
    }

    public void addcourse(Course addcourse) {
        int xyz;
        ListofCourses.add(addcourse);
    }


    public static String Authenticate(String emailentered, String passwordentered) {
        //authenticate user

        Iterator<RootUser> it = Application.users.iterator();
        boolean userAuthenticated = false;
        String ret = "";
        while (it.hasNext()) {
            RootUser temp = it.next();
//            System.out.println("user: "+temp.getUserEmailId()+" password: "+temp.getPassword());
            if ((temp.getUserEmailId().toLowerCase().compareTo(emailentered.toLowerCase()) == 0) && (temp.getPassword()).compareTo(passwordentered) == 0) {
                userAuthenticated = true;
//                System.out.println("user enteres: "+emailentered+" password entered: "+passwordentered);
                ret = temp.getTypeofuser();
                break;
            }
        }
        if (!userAuthenticated) {
            System.out.println("Wrong credentials");
        }
        return userAuthenticated + " " + ret;

    }

}