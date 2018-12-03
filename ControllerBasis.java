package sample;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class ControllerBasis {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<?> ListSaved;

    @FXML
    private Button OutButton;

    @FXML
    private Button ButtonSize15;

    @FXML
    private Button ButtonSize10;

    @FXML
    private Button ButtonSize5;

    @FXML
    void initialize() {



        ButtonSize5.setOnAction(event -> {
            ButtonSize5.getScene().getWindow().hide();
            try {
                Parent root2 = FXMLLoader.load(getClass().getResource("sample.fxml"));
                Stage stage = new Stage();
                stage.setTitle("MyNonogram");
                stage.setScene(new Scene(root2));
                stage.show();
            } catch (IOException e) {
                System.out.println();
            }
             });
        ButtonSize10.setOnAction(event -> {
            ButtonSize10.getScene().getWindow().hide();
            try {
                Parent root3 = FXMLLoader.load(getClass().getResource("sample10.fxml"));
                Stage stage = new Stage();
                stage.setTitle("MyNonogram");
                stage.setScene(new Scene(root3));
                stage.show();
            } catch (IOException e) {
                System.out.println();
            }
        });
        ButtonSize15.setOnAction(event -> {
            ButtonSize15.getScene().getWindow().hide();
            try {
                Parent root4 = FXMLLoader.load(getClass().getResource("sample15.fxml"));
                Stage stage = new Stage();
                stage.setTitle("MyNonogram");
                stage.setScene(new Scene(root4));
                stage.show();
            } catch (IOException e) {
                System.out.println();
            }
        });
        OutButton.setOnAction(event -> {
            OutButton.getScene().getWindow().hide();
        });
    }
}
