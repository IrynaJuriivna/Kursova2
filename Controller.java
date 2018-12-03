/*
package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {


    public static boolean button00, button01, button02,button03, button04, button10, button11, button12, button13, button14, button20, button21, button22, button23, button24, button30, button31, button32, button33, button34, button40, button41, button42, button43, button44;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button41;

    @FXML
    private Button Button40;

    @FXML
    private Button CancelButton;

    @FXML
    private Button SaveButton;

    @FXML
    private Button Button04;

    @FXML
    private Button Button03;

    @FXML
    private Button Button02;

    @FXML
    private Button Button24;

    @FXML
    private Button Button01;

    @FXML
    private Button Button23;

    @FXML
    private Button Button00;

    @FXML
    private Button Button22;

    @FXML
    private Button Button44;

    @FXML
    private Button Button21;

    @FXML
    private Button Button43;

    @FXML
    private Button Button20;

    @FXML
    private Button Button42;

    @FXML
    private Button Button30;

    @FXML
    private Button Button14;

    @FXML
    private Button Button13;

    @FXML
    private Button Button12;

    @FXML
    private Button Button34;

    @FXML
    private Button Button11;

    @FXML
    private Button Button33;

    @FXML
    private Button Button10;

    @FXML
    private Button Button32;

    @FXML
    private Button Button31;

    @FXML
    void initialize() {

Button00.setOnAction(event -> {
if(button00==true){ button00=false;
    Button00.setStyle("-fx-background-color:#FFFFF0"); }
else{ button00=true;
    Button00.setStyle("-fx-background-color: black"); } });

        Button01.setOnAction(event -> {
            if(button01==true){ button01=false;
                Button01.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button01=true;
                Button01.setStyle("-fx-background-color: black"); } });

        Button02.setOnAction(event -> {
            if(button02==true){ button02=false;
                Button02.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button02=true;
                Button02.setStyle("-fx-background-color: black"); } });


        Button03.setOnAction(event -> {
            if(button03==true){ button03=false;
                Button03.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button03=true;
                Button03.setStyle("-fx-background-color: black"); } });


        Button04.setOnAction(event -> {
            if(button04==true){ button04=false;
                Button04.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button04=true;
                Button04.setStyle("-fx-background-color: black"); } });


        Button10.setOnAction(event -> {
            if(button10==true){ button10=false;
                Button10.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10=true;
                Button10.setStyle("-fx-background-color: black"); } });


        Button11.setOnAction(event -> {
            if(button11==true){ button11=false;
                Button11.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button11=true;
                Button11.setStyle("-fx-background-color: black"); } });


        Button12.setOnAction(event -> {
            if(button12==true){ button12=false;
                Button12.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button12=true;
                Button12.setStyle("-fx-background-color: black"); } });





        Button13.setOnAction(event -> {
            if(button13==true){ button13=false;
                Button13.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button13=true;
                Button13.setStyle("-fx-background-color: black"); } });


        Button14.setOnAction(event -> {
            if(button14==true){ button14=false;
                Button14.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button14=true;
                Button14.setStyle("-fx-background-color: black"); } });


        Button20.setOnAction(event -> {
            if(button20==true){ button20=false;
                Button20.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button20=true;
                Button20.setStyle("-fx-background-color: black"); } });


        Button21.setOnAction(event -> {
            if(button21==true){ button21=false;
                Button21.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button21=true;
                Button21.setStyle("-fx-background-color: black"); } });

        Button22.setOnAction(event -> {
            if(button22==true){ button22=false;
                Button22.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button22=true;
                Button22.setStyle("-fx-background-color: black"); } });


        Button23.setOnAction(event -> {
            if(button23==true){ button23=false;
                Button23.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button23=true;
                Button23.setStyle("-fx-background-color: black"); } });


        Button24.setOnAction(event -> {
            if(button24==true){ button24=false;
                Button24.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button24=true;
                Button24.setStyle("-fx-background-color: black"); } });


        Button30.setOnAction(event -> {
            if(button30==true){ button30=false;
                Button30.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button30=true;
                Button30.setStyle("-fx-background-color: black"); } });


        Button31.setOnAction(event -> {
            if(button31==true){ button31=false;
                Button31.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button31=true;
                Button31.setStyle("-fx-background-color: black"); } });

        Button32.setOnAction(event -> {
            if(button32==true){ button32=false;
                Button32.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button32=true;
                Button32.setStyle("-fx-background-color: black"); } });

        Button33.setOnAction(event -> {
            if(button33==true){ button33=false;
                Button33.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button33=true;
                Button33.setStyle("-fx-background-color: black"); } });

        Button34.setOnAction(event -> {
            if(button34==true){ button34=false;
                Button34.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button34=true;
                Button34.setStyle("-fx-background-color: black"); } });

        Button40.setOnAction(event -> {
            if(button40==true){ button40=false;
                Button40.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button40=true;
                Button40.setStyle("-fx-background-color: black"); } });

        Button41.setOnAction(event -> {
            if(button41==true){ button41=false;
                Button41.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button41=true;
                Button41.setStyle("-fx-background-color: black"); } });

        Button42.setOnAction(event -> {
            if(button42==true){ button42=false;
                Button42.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button42=true;
                Button42.setStyle("-fx-background-color: black"); } });

        Button43.setOnAction(event -> {
            if(button43==true){ button43=false;
                Button43.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button43=true;
                Button43.setStyle("-fx-background-color: black"); } });

        Button44.setOnAction(event -> {
            if(button44==true){ button44=false;
                Button44.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button44=true;
                Button44.setStyle("-fx-background-color: black"); } });



    }

}
*/
package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {
    public static boolean[][]button5=new boolean[20][20];

    public boolean getbutton5(int i, int j){
        return button5[i][j];
    }

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
    private Button Button021;

    @FXML
    void initialize() {



        CancelButton.setOnAction(event -> {

            CancelButton.getScene().getWindow().hide();
            try {
                Parent root6 = FXMLLoader.load(getClass().getResource("basis.fxml"));
                Stage stage = new Stage();
                stage.setTitle("MyNonogram");
                stage.setScene(new Scene(root6));
                stage.show();
            } catch (IOException e) {
                System.out.println();
            }

        });
        SaveButton.setOnAction(event -> {

            SaveButton.getScene().getWindow().hide();
            try {
                Parent root9 = FXMLLoader.load(getClass().getResource("name5.fxml"));
                Stage stage = new Stage();
                stage.setTitle("MyNonogram");
                stage.setScene(new Scene(root9));
                stage.show();
            } catch (IOException e) {
                System.out.println();
            }

        });

        Button000.setOnAction(event -> {
            if(button5[0][0]==true){ button5[0][0]=false;
                Button000.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[0][0]=true;
                Button000.setStyle("-fx-background-color: black"); } });

        Button001.setOnAction(event -> {
            if(button5[0][1]==true){ button5[0][1]=false;
                Button001.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[0][1]=true;
                Button001.setStyle("-fx-background-color: black"); } });

        Button002.setOnAction(event -> {
            if(button5[0][2]==true){ button5[0][2]=false;
                Button002.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[0][2]=true;
                Button002.setStyle("-fx-background-color: black"); } });


        Button003.setOnAction(event -> {
            if(button5[0][3]==true){ button5[0][3]=false;
                Button003.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[0][3]=true;
                Button003.setStyle("-fx-background-color: black"); } });


        Button004.setOnAction(event -> {
            if(button5[0][4]==true){ button5[0][4]=false;
                Button004.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[0][4]=true;
                Button004.setStyle("-fx-background-color: black"); } });

        Button005.setOnAction(event -> {
            if(button5[1][0]==true){ button5[1][0]=false;
                Button005.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[1][0]=true;
                Button005.setStyle("-fx-background-color: black"); } });

        Button006.setOnAction(event -> {
            if(button5[1][1]==true){ button5[1][1]=false;
                Button006.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[1][1]=true;
                Button006.setStyle("-fx-background-color: black"); } });

        Button007.setOnAction(event -> {
            if(button5[1][2]==true){ button5[1][2]=false;
                Button007.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[1][2]=true;
                Button007.setStyle("-fx-background-color: black"); } });

        Button008.setOnAction(event -> {
            if(button5[1][3]==true){ button5[1][3]=false;
                Button008.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[1][3]=true;
                Button008.setStyle("-fx-background-color: black"); } });

        Button009.setOnAction(event -> {
            if(button5[1][4]==true){ button5[1][4]=false;
                Button009.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[1][4]=true;
                Button009.setStyle("-fx-background-color: black"); } });


        Button010.setOnAction(event -> {
            if(button5[2][0]==true){ button5[2][0]=false;
                Button010.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[2][0]=true;
                Button010.setStyle("-fx-background-color: black"); } });


        Button011.setOnAction(event -> {
            if(button5[2][1]==true){ button5[2][1]=false;
                Button011.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[2][1]=true;
                Button011.setStyle("-fx-background-color: black"); } });


        Button012.setOnAction(event -> {
            if(button5[2][2]==true){ button5[2][2]=false;
                Button012.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[2][2]=true;
                Button012.setStyle("-fx-background-color: black"); } });


        Button013.setOnAction(event -> {
            if(button5[2][3]==true){ button5[2][3]=false;
                Button013.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[2][3]=true;
                Button013.setStyle("-fx-background-color: black"); } });


        Button014.setOnAction(event -> {
            if(button5[2][4]==true){ button5[2][4]=false;
                Button014.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[2][4]=true;
                Button014.setStyle("-fx-background-color: black"); } });

        Button015.setOnAction(event -> {
            if(button5[3][0]==true){ button5[3][0]=false;
                Button015.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[3][0]=true;
                Button015.setStyle("-fx-background-color: black"); } });

        Button016.setOnAction(event -> {
            if(button5[3][1]==true){ button5[3][1]=false;
                Button016.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[3][1]=true;
                Button016.setStyle("-fx-background-color: black"); } });

        Button017.setOnAction(event -> {
            if(button5[3][2]==true){ button5[3][2]=false;
                Button017.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[3][2]=true;
                Button017.setStyle("-fx-background-color: black"); } });

        Button018.setOnAction(event -> {
            if(button5[3][3]==true){ button5[3][3]=false;
                Button018.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[3][3]=true;
                Button018.setStyle("-fx-background-color: black"); } });

        Button019.setOnAction(event -> {
            if(button5[3][4]==true){ button5[3][4]=false;
                Button019.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[3][4]=true;
                Button019.setStyle("-fx-background-color: black"); } });


        Button020.setOnAction(event -> {
            if(button5[4][0]==true){ button5[4][0]=false;
                Button020.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[4][0]=true;
                Button020.setStyle("-fx-background-color: black"); } });


        Button021.setOnAction(event -> {
            if(button5[4][1]==true){ button5[4][1]=false;
                Button021.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[4][1]=true;
                Button021.setStyle("-fx-background-color: black"); } });

        Button022.setOnAction(event -> {
            if(button5[4][2]==true){ button5[4][2]=false;
                Button022.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[4][2]=true;
                Button022.setStyle("-fx-background-color: black"); } });


        Button023.setOnAction(event -> {
            if(button5[4][3]==true){ button5[4][3]=false;
                Button023.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[4][3]=true;
                Button023.setStyle("-fx-background-color: black"); } });


        Button024.setOnAction(event -> {
            if(button5[4][4]==true){ button5[4][4]=false;
                Button024.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button5[4][4]=true;
                Button024.setStyle("-fx-background-color: black"); } });


    }
}
