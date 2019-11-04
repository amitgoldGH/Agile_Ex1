package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("College System");
        Scene sc = new Scene(root, 400, 325);
        primaryStage.setScene(sc);
        primaryStage.show();

    }

    public static void main(String[] args) {
        /*
        College c = new College("College-City");
        Student s1 = new Student("San", "San@College.com ");
        Student s2 = new Student("San1", "San@College.com ");
        Course math = new Course("Math 101", 5, "Summer", "10:00-12:50", new String[]{"Sunday", "Monday"});
        c.add_Course(math);
        c.register_Student_To_Course(s1, math);
        c.register_Student_To_Course(s2, math);
        //c.show_All_Courses();

        ArrayList<Student> allStudents = new ArrayList<>();
        ArrayList<Principle> allManagers = new ArrayList<>();
        ArrayList<Lecturer> allLecturers = new ArrayList<>();
        allStudents.add(s1);
        allStudents.add(s2);

         */
        launch(args);


        System.exit(0);
    }
}
