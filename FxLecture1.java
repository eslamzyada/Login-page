/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fxlecture.pkg1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 *
 * @author MS
 */
public class FxLecture1 extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Group g = new Group();
//        VBox v = new VBox();
//        Scene s = new Scene(g);
//        Label L2 = new Label("UserName");
//        L2.setFont(Font.font("Arial", 16));
//        L2.setTextFill(Color.BURLYWOOD);
//        L2.setLayoutX(30);
//        L2.setLayoutY(70);
//        TextField T = new TextField("Your name");
//        T.setLayoutX(110);
//        T.setLayoutY(70);
//        T.setFocusTraversable(false);
//        
//        Label L3 = new Label("Password");
//        L3.setFont(Font.font("Arial", 16));
//        L3.setTextFill(Color.BURLYWOOD);
//        L3.setLayoutX(30);
//        L3.setLayoutY(110);
//        stage.setScene(s);
//        PasswordField P = new PasswordField();
//        P.setLayoutX(110);
//        P.setLayoutY(110);
//        P.setFocusTraversable(false);
//        
//        Button b = new Button("Add");
//        b.setFont(Font.font("Arial", 16));
//        b.setTextFill(Color.CHOCOLATE);
//        b.setLayoutX(120);
//        b.setLayoutY(150);
//        b.setFocusTraversable(false);
//        Label L1 = new Label("LogIn");
//        L1.setFont(Font.font("Arial", 16));
//        L1.setTextFill(Color.BURLYWOOD);
//        L1.setLayoutX(110);
//        L1.setLayoutY(30);
//        g.getChildren().addAll(L1,L2,L3,T,P,b);
//        
//        stage.setScene(s);
//        stage.setHeight(300);
//        stage.setWidth(300);
//        stage.setTitle("JavaFx");
//        stage.show();
       primaryStage.setTitle("Login Page");

        // Create the GridPane layout and set properties
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Create the header text
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        // Create the username label and text field
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        userTextField.setFocusTraversable(false);
        grid.add(userTextField, 1, 1);
        
        // Create the password label and password field
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        pwBox.setFocusTraversable(false);
        grid.add(pwBox, 1, 2);

        // Create the login button
        Button btn = new Button("Sign in");
        btn.setFocusTraversable(false);
        grid.add(btn, 1, 4);

        // Create the status label
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        // Set the event handler for the login button
        btn.setOnAction(event -> {
            String username = userTextField.getText();
            String password = pwBox.getText();

            // TODO: Check the username and password against a database or other authentication system

            // Display a message indicating success or failure
            if (username.equals("admin") && password.equals("123456")) {
                actiontarget.setFill(Color.GREEN);
                actiontarget.setText("Login successful");
            } else {
                actiontarget.setFill(Color.RED);
                actiontarget.setText("Invalid username or password");
            }
        });

        // Create the scene and set it on the stage
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }
}
    
    

