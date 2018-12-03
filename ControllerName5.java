package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class ControllerName5 {



    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button004;

    @FXML
    private Button Button005;

    @FXML
    private Button Button002;

    @FXML
    private Button Button024;

    @FXML
    private Button Button003;

    @FXML
    private Button Button008;

    @FXML
    private Button Button009;

    @FXML
    private Button Button006;

    @FXML
    private Button CancelButton;

    @FXML
    private Button Button007;

    @FXML
    private Button SaveButton;

    @FXML
    private Label Label001;

    @FXML
    private Label Label000;

    @FXML
    private Label Label003;

    @FXML
    private Label Label002;

    @FXML
    private Button Button011;

    @FXML
    private Button Button012;

    @FXML
    private Button Button010;

    @FXML
    private Button Button015;

    @FXML
    private Button Button016;

    @FXML
    private Button Button013;

    @FXML
    private Button Button014;

    @FXML
    private Button Button019;

    @FXML
    private Button Button017;

    @FXML
    private Button Button018;

    @FXML
    private Label Label010;

    @FXML
    private Label Label012;

    @FXML
    private Label Label011;

    @FXML
    private Label Label014;

    @FXML
    private Label Label013;

    @FXML
    private Label Label004;

    @FXML
    private Label Label007;

    @FXML
    private Label Label006;

    @FXML
    private Label Label009;

    @FXML
    private Label Label008;

    @FXML
    private Button Button000;

    @FXML
    private Button Button022;

    @FXML
    private Button Button001;

    @FXML
    private Button Button023;

    @FXML
    private Button Button020;

    @FXML
    private Label Label005;

    @FXML
    private Button Button021;

    @FXML
    private GridPane ButtonPane;

    public Label [][]Label5=new Label[20][20];

    public void addLabel(){
        Label5[0][0]=Label000;
        Label5[0][1]=Label001;
        Label5[0][2]=Label002;
        Label5[1][3]=Label003;
        Label5[1][4]=Label004;
        Label5[1][0]=Label005;
        Label5[2][1]=Label006;
        Label5[2][2]=Label007;
        Label5[2][3]=Label008;
        Label5[3][4]=Label009;
        Label5[3][0]=Label010;
        Label5[3][1]=Label011;
        Label5[4][2]=Label012;
        Label5[4][3]=Label013;
        Label5[4][4]=Label014;
    }

    public void verhne_pole(boolean[][]button5){
        int k=0;
for(int j =0; j<5;j++){
    for(int i=0; i<5; i++){

if(button5[i][j]==true){
    k++;
}
else{

    Label5[j][i].setText( String.valueOf(k));;
}
    }
}

    }





    @FXML
    void initialize(boolean[][]button5) {

        if(button5[0][0] == true){
            Button000.setStyle("-fx-background-color: black");
        }
        if(button5[0][0] == false){
            Button001.setStyle("-fx-background-color: black");
        } 


            if (button5[0][0] == true) {
                Button000.setStyle("-fx-background-color: black");
            }


            if (button5[0][1] == true) {
                Button001.setStyle("-fx-background-color: black");
            }



            if (button5[0][2] == true) {
                Button002.setStyle("-fx-background-color: black");
            }



            if (button5[0][3] == true) {
                Button003.setStyle("-fx-background-color: black");
            }



            if (button5[0][4] == true) {
                Button004.setStyle("-fx-background-color: black");
            }



            if (button5[1][0] == true) {
                Button005.setStyle("-fx-background-color: black");
            }



            if (button5[1][1] == true) {
                Button006.setStyle("-fx-background-color: black");
            }



            if (button5[1][2] == true) {
                Button007.setStyle("-fx-background-color: black");
            }


            if (button5[1][3] == true) {
                Button008.setStyle("-fx-background-color: black");
            }



            if (button5[1][4] == true) {
                Button009.setStyle("-fx-background-color: black");
            }



            if (button5[2][0] == true) {
                Button010.setStyle("-fx-background-color: black");
            }



            if (button5[2][1] == true) {
                Button011.setStyle("-fx-background-color: black");
            }



            if (button5[2][2] == true) {
                Button012.setStyle("-fx-background-color: black");
            }



            if (button5[2][3] == true) {
                Button013.setStyle("-fx-background-color: black");
            }



            if (button5[2][4] == true) {
                Button014.setStyle("-fx-background-color: black");
            }



            if (button5[3][0] == true) {
                Button015.setStyle("-fx-background-color: black");
            }



            if (button5[3][1] == true) {
                Button016.setStyle("-fx-background-color: black");
            }



            if (button5[3][2] == true) {
                Button017.setStyle("-fx-background-color: black");
            }


            if (button5[3][3] == true) {
                Button018.setStyle("-fx-background-color: black");
            }



            if (button5[3][4] == true) {
                Button019.setStyle("-fx-background-color: black");
            }



            if (button5[4][0] == true) {
                Button020.setStyle("-fx-background-color: black");
            }



            if (button5[4][1] == true) {
                Button021.setStyle("-fx-background-color: black");
            }



            if (button5[4][2] == true) {
                Button022.setStyle("-fx-background-color: black");
            }



            if (button5[4][3] == true) {
                Button023.setStyle("-fx-background-color: black");
            }



            if (button5[4][4] == true) {
                Button024.setStyle("-fx-background-color: black");
            }




    }
}
