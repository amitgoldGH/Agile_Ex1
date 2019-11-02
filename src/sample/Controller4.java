package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class Controller4 {

    static String userField;
    static String emailField;
    static String LecInformation;
    static String studInformation;
    @FXML
    private Label userLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private Label LecturerArea;
    @FXML
    private Label StudentArea;

    @FXML
    void initialize() {
        System.out.println("In Controller4 Init");
        System.out.println("userfield: " + sample.controller2.userField);
        userLabel.setText(userField);
        emailLabel.setText(emailField);
        LecturerArea.setText(LecInformation);
        StudentArea.setText(studInformation);
    }

    static void passUserField(String user) {
        sample.Controller4.userField = user;
    }

    static void passEmailField(String email) {
        sample.Controller4.emailField = email;
    }

       static void passLecturerInfo(String LecturesName) {
        sample.Controller4.LecInformation = LecturesName;
    }
    static void passStudentInfo(String StudentName) {
        sample.Controller4.studInformation = StudentName;
    }


//    static void passCourseInfo(String course) {
//        sample.Controller4.courseInformation = course;
//    }

}


