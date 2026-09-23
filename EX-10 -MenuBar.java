import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import java.time.LocalDate;
public class MenuBar_2 extends Application
{
public void start(Stage s)
{
s.setTitle("creating MenuBar");
Menu m = new Menu("Options");
MenuItem m1 = new MenuItem("New File");
MenuItem m2 = new MenuItem("Open File");
MenuItem m3 = new MenuItem("Save File");
m.getItems().add(m1);
m.getItems().add(m2);
m.getItems().add(m3);
Label l = new Label("\t\t\t\t" + "no menu item selected");
EventHandler<ActionEvent> event = new EventHandler<ActionEvent>()
{
public void handle(ActionEvent e)
{
l.setText("\t\t\t\t" +((MenuItem)e.getSource()).getText() + " selected");
}
};
m1.setOnAction(event); m2.setOnAction(event);
m3.setOnAction(event);
MenuBar mb = new MenuBar();
mb.getMenus().add(m);
VBox vb = new VBox(mb, l);
Scene sc = new Scene(vb, 500, 300);
s.setScene(sc); s.show();
}
public static void main(String args[])
{
launch(args);
}
}