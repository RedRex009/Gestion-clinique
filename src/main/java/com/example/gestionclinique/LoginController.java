package com.example.gestionclinique;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {

    @FXML private Button adminButton;
    @FXML private Button patientButton;
    @FXML private Button doctorButton;
    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private Button loginButton;

    private String selectedRole = "Patient"; // Default role

    @FXML
    private void initialize() {
        adminButton.setOnAction(e -> selectedRole = "Admin");
        patientButton.setOnAction(e -> selectedRole = "Patient");
        doctorButton.setOnAction(e -> selectedRole = "Médecin");

        loginButton.setOnAction(e -> handleLogin());
    }

    private void handleLogin() {
        String email = emailField.getText();
        String password = passwordField.getText();

        if (email.isEmpty() || password.isEmpty()) {
            System.out.println("⚠️ Please enter email and password!");
        } else {
            System.out.println("✅ Logging in as " + selectedRole + ": " + email);
        }
    }
}
