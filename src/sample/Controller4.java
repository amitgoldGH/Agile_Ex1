package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class Controller4 {

    static String userField;
    static String emailField;
    static String courseInformation;
    @FXML
    private Label userLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private Label LecturerArea;

    @FXML
    void initialize() {
        System.out.println("In Controller4 Init");
        System.out.println("userfield: " + sample.controller2.userField);
        userLabel.setText(userField);
        emailLabel.setText(emailField);
        LecturerArea.setText(courseInformation);
    }

    static void passUserField(String user) {
        sample.Controller4.userField = user;
    }

    static void passEmailField(String email) {
        sample.Controller4.emailField = email;
    }

       static void passLecturerInfo(String LecturesName) {
        sample.Controller4.courseInformation = LecturesName;
    }


//    static void passCourseInfo(String course) {
//        sample.Controller4.courseInformation = course;
//    }

}


