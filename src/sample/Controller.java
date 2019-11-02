package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Controller {

    static College c = new College("College");
    static boolean initFlag = false;
    static Parent root = null;


    @FXML
    private TextField txtName;
    @FXML
    private TextField txtEmail;
    @FXML
    private Label txtStatus;
    @FXML
    private Button buttLogin;
    @FXML
    private Text studentTest;

    ObservableList<String> roleList = FXCollections.observableArrayList("Student", "Lecturer", "Principle");
    @FXML
    private ComboBox roleBox;

    @FXML
    void initialize() {
        if (initFlag == false) {
            roleBox.setValue("Student");
            roleBox.setItems(roleList);
            txtStatus.setText(" ");
            //College c = new College("College-City");
            Student s1 = new Student("San", "San@College.com");
            Student s2 = new Student("San1", "San@College.com");
         //   Student s3 = new Student("1", "1");


            Principle p1 = new Principle("Manager", "Manager@College.com");
           //Principle p = new Principle("Manager", "Manager@College.com");

            Lecturer l1 = new Lecturer("Teacher", "Teacher@College.com", 6969);
            Lecturer l2 = new Lecturer("Teacher1", "Teacher1@College.com", 5329);
          //  Lecturer l3 = new Lecturer("2", "2", 5329);

            c.setPrinciple(p1);

            c.add_Lecturer(l1);
            c.add_Lecturer(l2);
      //    c.add_Lecturer(l3);

            c.add_Student(s1);
            c.add_Student(s2);
        //    c.add_Student(s3);

            Course math = new Course("Math 101", 5, "Summer", "10:00-12:50", new String[]{"Sunday", "Monday"});
            math.assign_Lecturer(l1);

            Course Biology = new Course("Biology 202", 5, "Spring", "11:00-13:50", new String[]{"Monday"});
            Biology.assign_Lecturer(l2);

            Course Agile = new Course("Agile 10346", 5, "winter", "08:00-10:50", new String[]{"Friday"});
            Agile.assign_Lecturer(l2);

            c.add_Course(Biology);
            c.add_Course(math);
            c.add_Course(Agile);

            c.register_Student_To_Course(s1, math);
            c.register_Student_To_Course(s2, math);
            c.register_Student_To_Course(s1, Agile);
          //  c.register_Student_To_Course(s3, Agile);


            //c.show_All_Courses();
        /*
        ArrayList<Student> allStudents = new ArrayList<>();
        ArrayList<Principle> allManagers = new ArrayList<>();
        ArrayList<Lecturer> allLecturers = new ArrayList<>();
        allStudents.add(s1);
        allStudents.add(s2);
        */
        }
        initFlag = true;

    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
         String userField = txtName.getText();
        String emailField = txtEmail.getText();
        String role = roleBox.getValue().toString();
        c.show_All_Courses();


        System.out.println("User : " + userField);
        System.out.println("Email : " + emailField);
        boolean flag = false;
        try {
            switch (role) {
                case "Student" : {

                    System.out.println("Student selected");
                    for (Student s : Controller.c.getAll_Students()) {
                        if (s.getName().equalsIgnoreCase(userField) && s.getEmail().equalsIgnoreCase(emailField)) {
                            flag = true;
                            controller2.passUserField(userField);
                            controller2.passEmailField(emailField);
                            controller2.passCourseInfo(s.getAttending_Courses().toString());
                            root = FXMLLoader.load(getClass().getResource("Student.fxml"));

                            //studentTest.setText(userField);
                            break;
                        }
                        else {
                            txtStatus.setText("Information Is Incorrect");

                            }
                      }
                    if (flag == true)
                        System.out.println("Student found!");
                    else
                        System.out.println("Student not found");
                    break;
                }
                case "Lecturer" : {
                    System.out.println("Lecturer selected");
                    for (Lecturer l : Controller.c.getAll_Lecturers()) {
                        if (l.getName().equalsIgnoreCase(userField) && l.getEmail().equalsIgnoreCase(emailField)) {
                            flag = true;
                            Controller3.passUserField(userField);
                            Controller3.passEmailField(emailField);
                            Controller3.passCourseInfo(l.getAttending_Courses().toString());
                            root = FXMLLoader.load(getClass().getResource("Lecturer.fxml"));
                            break;
                        }
                        else txtStatus.setText("Information Is Incorrect");
                    }
                    if (flag == true)
                        System.out.println("Lecturer found!");
                    else
                        System.out.println("Lecturer not found");
                    break;
                }
                case "Principle" : {
                    System.out.println("Principle selected");
                    if (Controller.c.getPrinciple().getName().equalsIgnoreCase(userField) && c.getPrinciple().getEmail().equalsIgnoreCase(emailField)) {
                        Principle p;
                        flag = true;
                        Controller4.passUserField(userField);
                        Controller4.passEmailField(emailField);
                         Controller4.passLecturerInfo(c.getAllLectureName());
                        Controller4.passStudentInfo(c.getAllStudentName());
                        root = FXMLLoader.load(getClass().getResource("Principle.fxml"));
                        //root = FXMLLoader.load(getClass().getResource("Principle.fxml"));
                        break;
                    }
                    else txtStatus.setText("Information Is Incorrect");

                    if (flag == true)
                        System.out.println("Principle found!");
                    else
                        System.out.println("Principle not found");
                    break;
                }
                default : {
                    System.exit(0);
                    break;
                }
            }
            System.out.println("Outside of switch");
            if (flag == true) {
                Stage stage = new Stage();
                stage.setTitle("My New Stage Title");
                stage.setScene(new Scene(root, 450, 450));
                stage.show();

                // Hide this current window
                ((Node) (event.getSource())).getScene().getWindow().hide();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
