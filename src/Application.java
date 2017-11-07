import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tgit on 06/10/17.
 */
public class Application extends javafx.application.Application {

    public List<Course> ListofCourses = new ArrayList<Course>();


    //JavaFX components
    Stage mainStage;



    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    	//String hj = "The Advanced Programming course is a successor to the Introduction to Programming course. This course teaches some advanced programming concepts. It builds upon prior knowledge of students about programming using languages like C. This is going to be an intensive hands-on course and is going to heavily based on programming assignments, labs and practical exams. The course begins with a discussion on Introduction to Object Oriented Paradigm and Programming Concepts. Students will learn the key elements of a typical object oriented application such as objects, classes, messages, interfaces, abstraction, inheritance, encapsulation and polymorphism. We will make use of Java language to demonstrate the concepts. However, the concepts can be applied using other programming languages. After covering the basics of object oriented programming, we will cover advanced Java programming features such as the Basic Error amp; Exception handling, IO amp; Streams, Concurrent programming with Threads , GUI programming, Collections Framework, and unit testing with JUnit. Throughout the course, students will use an integrated development environment like Eclipse and learn to make use of Java documentation and also learn to create documentation, using JavaDoc, with code.";
        //System.out.println(hj);
    	mainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Resources/Login.fxml"));
        primaryStage.setTitle("IIIT-D Classroom Booking System");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setFullScreen(true);
        primaryStage.show();
        BufferedReader br = new BufferedReader(new FileReader("./src/courses.txt"));
        try {
            //StringBuilder sb = new StringBuilder();
            //String ff = br.readLine();
            //System.out.println(ff);
            br.readLine();
            String line = br.readLine();
            
            while (line != null) {
            	line = br.readLine();
            	if(line.isEmpty()){
            		br.readLine();
            		line = br.readLine();
            		String name = br.readLine();
            		String pre = br.readLine();
            		String desc= br.readLine();
            		Course newc = new Course(line, name, pre, desc, 50);
            		ListofCourses.add(newc);
            		//System.out.println(line);
            		//System.out.println(name);
            		//System.out.println(pre);
            		//System.out.println(desc);
            		//System.out.println(line);}
            	}                
            }
            //System.out.println(everything);
        } finally {
            br.close();
        }
        //System.out.println(ListofCourses.get(34));
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


    public boolean Authenticate() {
        //authenticate user
        int xyz;
        return true;

    }
}