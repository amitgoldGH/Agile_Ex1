package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class Controller3 {



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
            System.out.println("In Controller3 Init");
            System.out.println("userfield: " + sample.controller2.userField);
            userLabel.setText(userField);
            emailLabel.setText(emailField);
            courseArea.setText(courseInformation);
        }
        static void passUserField(String user) {
            sample.Controller3.userField = user;
        }

        static void passEmailField(String email) {
            sample.Controller3.emailField = email;
        }

        static void passCourseInfo(String course) {
            sample.Controller3.courseInformation = course;
        }

    }


