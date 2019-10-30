package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;
public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        //launch(args);
        Scanner sc = new Scanner(System.in);
        College c = new College("College-City");
        Student s1 = new Student("San");
        Course math = new Course("Math 101", 5, "Summer", "10:00-12:50", new String[]{"Sunday", "Monday"});
        c.add_Course(math);
        c.register_Student_To_Course(s1, math);
        c.show_All_Courses();
        sc.next();
        System.exit(0);
    }
}
