package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    final boolean[]button=new boolean[300];
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("basis.fxml"));
        primaryStage.setTitle("MyNonogram");
        primaryStage.setScene(new Scene(root, 550, 650));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
