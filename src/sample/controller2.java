package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class controller2 {

    static String userField;
    static String emailField;
    static String courseInformation;
    @FXML
    private Label userLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private Label courseArea;

    @FXML
    void initialize() {
        System.out.println("In Controller2 Init");
        System.out.println("userfield: " + controller2.userField);
        userLabel.setText(userField);
        emailLabel.setText(emailField);
        courseArea.setText(courseInformation);
    }
    static void passUserField(String user) {
        controller2.userField = user;
    }

    static void passEmailField(String email) {
        controller2.emailField = email;
    }

    static void passCourseInfo(String course) {
        controller2.courseInformation = course;
    }

}
