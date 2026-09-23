package org.mano.example;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class LayoutDemo extends Application
{
public static void main(String[] args)
{
Application.launch(args);
}
@Override
public void start(Stage stage) throws Exception
{
Scene scene = new Scene(createHBoxLayout(), 700, 120);
stage.setTitle("Login Layout Demo");
stage.setScene(scene);stage.show();
}
public HBox createHBoxLayout()
{
HBox hbox = new HBox(); hbox.setSpacing(15);
hbox.setPadding(new Insets(8));
hbox.setAlignment(Pos.CENTER_LEFT);
Label userLabel=new Label("Username ");
Label passLabel=new Label("Passcode ");
TextField userTextField=new TextField();
PasswordField passwordField=new PasswordField();
Button loginButton=new Button("Sign In");
hbox.getChildren().addAll(userLabel,userTextField, passLabel,passwordField,loginButton);
return hbox;
}
}