/*
package sample;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller10 {

    public static boolean button00, button01, button02,button03, button04, button10, button11, button12, button13, button14, button20, button21, button22, button23, button24, button30, button31, button32, button33, button34, button40, button41, button42, button43, button44;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button85;

    @FXML
    private Button Button84;

    @FXML
    private Button Button83;

    @FXML
    private Button Button82;

    @FXML
    private Button Button81;

    @FXML
    private Button Button80;

    @FXML
    private Button CancelButton;

    @FXML
    private Button Button09;

    @FXML
    private Button Button08;

    @FXML
    private Button Button07;

    @FXML
    private Button Button06;

    @FXML
    private Button Button05;

    @FXML
    private Button Button04;

    @FXML
    private Button Button03;

    @FXML
    private Button Button12;

    @FXML
    private Button Button02;

    @FXML
    private Button Button89;

    @FXML
    private Button Button88;

    @FXML
    private Button Button00;

    @FXML
    private Button Button87;

    @FXML
    private Button Button86;

    @FXML
    private Button Button96;

    @FXML
    private Button Button95;

    @FXML
    private Button Button94;

    @FXML
    private Button Button93;

    @FXML
    private Button Button92;

    @FXML
    private Button Button91;

    @FXML
    private Button Button90;

    @FXML
    private Button Button19;

    @FXML
    private Button Button18;

    @FXML
    private Button Button27;

    @FXML
    private Button Button17;

    @FXML
    private Button Button16;

    @FXML
    private Button Button15;

    @FXML
    private Button Button14;

    @FXML
    private Button Button13;

    @FXML
    private Button Button99;

    @FXML
    private Button Button11;

    @FXML
    private Button Button98;

    @FXML
    private Button Button10;

    @FXML
    private Button Button97;

    @FXML
    private Button Button63;

    @FXML
    private Button Button62;

    @FXML
    private Button Button61;

    @FXML
    private Button Button60;

    @FXML
    private Button Button75;

    @FXML
    private Button Button69;

    @FXML
    private Button Button68;

    @FXML
    private Button Button67;

    @FXML
    private Button Button66;

    @FXML
    private Button Button65;

    @FXML
    private Button Button64;

    @FXML
    private Button Button74;

    @FXML
    private Button Button73;

    @FXML
    private Button Button72;

    @FXML
    private Button Button71;

    @FXML
    private Button Button70;

    @FXML
    private Button Button01;

    @FXML
    private Button Button79;

    @FXML
    private Button Button78;

    @FXML
    private Button Button77;

    @FXML
    private Button Button76;

    @FXML
    private Button Button41;

    @FXML
    private Button Button40;

    @FXML
    private Button Button008;

    @FXML
    private Button Button007;

    @FXML
    private Button SaveButton;

    @FXML
    private Button Button49;

    @FXML
    private Button Button48;

    @FXML
    private Button Button47;

    @FXML
    private Button Button46;

    @FXML
    private Button Button45;

    @FXML
    private Button Button44;

    @FXML
    private Button Button43;

    @FXML
    private Button Button42;

    @FXML
    private Button Button52;

    @FXML
    private Button Button51;

    @FXML
    private Button Button50;

    @FXML
    private Button Button59;

    @FXML
    private Button Button58;

    @FXML
    private Button Button57;

    @FXML
    private Button Button56;

    @FXML
    private Button Button55;

    @FXML
    private Button Button001;

    @FXML
    private Button Button54;

    @FXML
    private Button Button53;

    @FXML
    private Button Button29;

    @FXML
    private Button Button28;

    @FXML
    private Button Button26;

    @FXML
    private Button Button25;

    @FXML
    private Button Button24;

    @FXML
    private Button Button23;

    @FXML
    private Button Button22;

    @FXML
    private Button Button21;

    @FXML
    private Button Button20;

    @FXML
    private Button Button30;

    @FXML
    private Button Button39;

    @FXML
    private Button Button38;

    @FXML
    private Button Button37;

    @FXML
    private Button Button36;

    @FXML
    private Button Button35;

    @FXML
    private Button Button34;

    @FXML
    private Button Button33;

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

public class Controller10 {

 //   final boolean[]button=new boolean[300];
    public static boolean[][]button10=new boolean[100][100];

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button048;

    @FXML
    private Button Button049;

    @FXML
    private Button Button046;

    @FXML
    private Button Button047;

    @FXML
    private Button CancelButton;

    @FXML
    private Button Button051;

    @FXML
    private Button Button052;

    @FXML
    private Button Button050;

    @FXML
    private Button Button055;

    @FXML
    private Button Button056;

    @FXML
    private Button Button053;

    @FXML
    private Button Button054;

    @FXML
    private Button Button037;

    @FXML
    private Button Button038;

    @FXML
    private Button Button035;

    @FXML
    private Button Button036;

    @FXML
    private Button Button039;

    @FXML
    private Button Button040;

    @FXML
    private Button Button041;

    @FXML
    private Button Button044;

    @FXML
    private Button Button045;

    @FXML
    private Button Button042;

    @FXML
    private Button Button043;

    @FXML
    private Button Button068;

    @FXML
    private Button Button069;

    @FXML
    private Button Button070;

    @FXML
    private Button Button073;

    @FXML
    private Button Button074;

    @FXML
    private Button Button071;

    @FXML
    private Button Button072;

    @FXML
    private Button Button077;

    @FXML
    private Button Button078;

    @FXML
    private Button Button075;

    @FXML
    private Button Button076;

    @FXML
    private Button Button059;

    @FXML
    private Button Button057;

    @FXML
    private Button Button058;

    @FXML
    private Button Button062;

    @FXML
    private Button Button063;

    @FXML
    private Button Button060;

    @FXML
    private Button Button061;

    @FXML
    private Button Button066;

    @FXML
    private Button Button067;

    @FXML
    private Button Button064;

    @FXML
    private Button Button065;

    @FXML
    private Button Button004;

    @FXML
    private Button Button005;

    @FXML
    private Button Button002;

    @FXML
    private Button Button003;

    @FXML
    private Button Button008;

    @FXML
    private Button Button009;

    @FXML
    private Button Button006;

    @FXML
    private Button Button007;

    @FXML
    private Button SaveButton;

    @FXML
    private Button Button091;

    @FXML
    private Button Button092;

    @FXML
    private Button Button090;

    @FXML
    private Button Button095;

    @FXML
    private Button Button096;

    @FXML
    private Button Button093;

    @FXML
    private Button Button094;

    @FXML
    private Button Button099;

    @FXML
    private Button Button011;

    @FXML
    private Button Button012;

    @FXML
    private Button Button097;

    @FXML
    private Button Button098;

    @FXML
    private Button Button010;

    @FXML
    private Button Button079;

    @FXML
    private Button Button080;

    @FXML
    private Button Button081;

    @FXML
    private Button Button084;

    @FXML
    private Button Button085;

    @FXML
    private Button Button082;

    @FXML
    private Button Button083;

    @FXML
    private Button Button088;

    @FXML
    private Button Button000;

    @FXML
    private Button Button089;

    @FXML
    private Button Button001;

    @FXML
    private Button Button086;

    @FXML
    private Button Button087;

    @FXML
    private Button Button026;

    @FXML
    private Button Button027;

    @FXML
    private Button Button024;

    @FXML
    private Button Button025;

    @FXML
    private Button Button028;

    @FXML
    private Button Button029;

    @FXML
    private Button Button030;

    @FXML
    private Button Button033;

    @FXML
    private Button Button034;

    @FXML
    private Button Button031;

    @FXML
    private Button Button032;

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
    private Button Button022;

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
                Parent root7 = FXMLLoader.load(getClass().getResource("basis.fxml"));
                Stage stage = new Stage();
                stage.setTitle("MyNonogram");
                stage.setScene(new Scene(root7));
                stage.show();
            } catch (IOException e) {
                System.out.println();
            }

        });




        Button000.setOnAction(event -> {
            if(button10[0][0]==true){ button10[0][0]=false;
                Button000.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[0][0]=true;
                Button000.setStyle("-fx-background-color: black"); } });

        Button001.setOnAction(event -> {
            if(button10[0][1]==true){ button10[0][1]=false;
                Button001.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[0][1]=true;
                Button001.setStyle("-fx-background-color: black"); } });

        Button002.setOnAction(event -> {
            if(button10[0][2]==true){ button10[0][2]=false;
                Button002.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[0][2]=true;
                Button002.setStyle("-fx-background-color: black"); } });


        Button003.setOnAction(event -> {
            if(button10[0][3]==true){ button10[0][3]=false;
                Button003.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[0][3]=true;
                Button003.setStyle("-fx-background-color: black"); } });


        Button004.setOnAction(event -> {
            if(button10[0][4]==true){ button10[0][4]=false;
                Button004.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[0][4]=true;
                Button004.setStyle("-fx-background-color: black"); } });

        Button005.setOnAction(event -> {
            if(button10[0][5]==true){ button10[0][5]=false;
                Button005.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[0][5]=true;
                Button005.setStyle("-fx-background-color: black"); } });

        Button006.setOnAction(event -> {
            if(button10[0][6]==true){ button10[0][6]=false;
                Button006.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[0][6]=true;
                Button006.setStyle("-fx-background-color: black"); } });

        Button007.setOnAction(event -> {
            if(button10[0][7]==true){ button10[0][7]=false;
                Button007.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[0][7]=true;
                Button007.setStyle("-fx-background-color: black"); } });

        Button008.setOnAction(event -> {
            if(button10[0][8]==true){ button10[0][8]=false;
                Button008.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[0][8]=true;
                Button008.setStyle("-fx-background-color: black"); } });

        Button009.setOnAction(event -> {
            if(button10[0][9]==true){ button10[0][9]=false;
                Button009.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[0][9]=true;
                Button009.setStyle("-fx-background-color: black"); } });


        Button010.setOnAction(event -> {
            if(button10[1][0]==true){ button10[1][0]=false;
                Button010.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[1][0]=true;
                Button010.setStyle("-fx-background-color: black"); } });


        Button011.setOnAction(event -> {
            if(button10[1][1]==true){ button10[1][1]=false;
                Button011.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[1][1]=true;
                Button011.setStyle("-fx-background-color: black"); } });


        Button012.setOnAction(event -> {
            if(button10[1][2]==true){ button10[1][2]=false;
                Button012.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[1][2]=true;
                Button012.setStyle("-fx-background-color: black"); } });


        Button013.setOnAction(event -> {
            if(button10[1][3]==true){ button10[1][3]=false;
                Button013.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[1][3]=true;
                Button013.setStyle("-fx-background-color: black"); } });


        Button014.setOnAction(event -> {
            if(button10[1][4]==true){ button10[1][4]=false;
                Button014.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[1][4]=true;
                Button014.setStyle("-fx-background-color: black"); } });

        Button015.setOnAction(event -> {
            if(button10[1][5]==true){ button10[1][5]=false;
                Button015.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[1][5]=true;
                Button015.setStyle("-fx-background-color: black"); } });

        Button016.setOnAction(event -> {
            if(button10[1][6]==true){ button10[1][6]=false;
                Button016.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[1][6]=true;
                Button016.setStyle("-fx-background-color: black"); } });

        Button017.setOnAction(event -> {
            if(button10[1][7]==true){ button10[1][7]=false;
                Button017.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[1][7]=true;
                Button017.setStyle("-fx-background-color: black"); } });

        Button018.setOnAction(event -> {
            if(button10[1][8]==true){ button10[1][8]=false;
                Button018.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[1][8]=true;
                Button018.setStyle("-fx-background-color: black"); } });

        Button019.setOnAction(event -> {
            if(button10[1][9]==true){ button10[1][9]=false;
                Button019.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[1][9]=true;
                Button019.setStyle("-fx-background-color: black"); } });


        Button020.setOnAction(event -> {
            if(button10[2][0]==true){ button10[2][0]=false;
                Button020.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[2][0]=true;
                Button020.setStyle("-fx-background-color: black"); } });


        Button021.setOnAction(event -> {
            if(button10[2][1]==true){ button10[2][1]=false;
                Button021.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[2][1]=true;
                Button021.setStyle("-fx-background-color: black"); } });

        Button022.setOnAction(event -> {
            if(button10[2][2]==true){ button10[2][2]=false;
                Button022.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[2][2]=true;
                Button022.setStyle("-fx-background-color: black"); } });


        Button023.setOnAction(event -> {
            if(button10[2][3]==true){ button10[2][3]=false;
                Button023.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[2][3]=true;
                Button023.setStyle("-fx-background-color: black"); } });


        Button024.setOnAction(event -> {
            if(button10[2][4]==true){ button10[2][4]=false;
                Button024.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[2][4]=true;
                Button024.setStyle("-fx-background-color: black"); } });

        Button025.setOnAction(event -> {
            if(button10[2][5]==true){ button10[2][5]=false;
                Button025.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[2][5]=true;
                Button025.setStyle("-fx-background-color: black"); } });

        Button026.setOnAction(event -> {
            if(button10[2][6]==true){ button10[2][6]=false;
                Button026.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[2][6]=true;
                Button026.setStyle("-fx-background-color: black"); } });

        Button027.setOnAction(event -> {
            if(button10[2][7]==true){ button10[2][7]=false;
                Button027.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[2][7]=true;
                Button027.setStyle("-fx-background-color: black"); } });

        Button028.setOnAction(event -> {
            if(button10[2][8]==true){ button10[2][8]=false;
                Button028.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[2][8]=true;
                Button028.setStyle("-fx-background-color: black"); } });

        Button029.setOnAction(event -> {
            if(button10[2][9]==true){ button10[2][9]=false;
                Button029.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[2][9]=true;
                Button029.setStyle("-fx-background-color: black"); } });

        Button030.setOnAction(event -> {
            if(button10[3][0]==true){ button10[3][0]=false;
                Button030.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[3][0]=true;
                Button030.setStyle("-fx-background-color: black"); } });


        Button031.setOnAction(event -> {
            if(button10[3][1]==true){ button10[3][1]=false;
                Button031.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[3][1]=true;
                Button031.setStyle("-fx-background-color: black"); } });

        Button032.setOnAction(event -> {
            if(button10[3][2]==true){ button10[3][2]=false;
                Button032.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[3][2]=true;
                Button032.setStyle("-fx-background-color: black"); } });

        Button033.setOnAction(event -> {
            if(button10[3][3]==true){ button10[3][3]=false;
                Button033.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[3][3]=true;
                Button033.setStyle("-fx-background-color: black"); } });

        Button034.setOnAction(event -> {
            if(button10[3][4]==true){ button10[3][4]=false;
                Button034.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[3][4]=true;
                Button034.setStyle("-fx-background-color: black"); } });

        Button035.setOnAction(event -> {
            if(button10[3][5]==true){ button10[3][5]=false;
                Button035.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[3][5]=true;
                Button035.setStyle("-fx-background-color: black"); } });

        Button036.setOnAction(event -> {
            if(button10[3][6]==true){ button10[3][6]=false;
                Button036.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[3][6]=true;
                Button036.setStyle("-fx-background-color: black"); } });

        Button037.setOnAction(event -> {
            if(button10[3][7]==true){ button10[3][7]=false;
                Button037.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[3][7]=true;
                Button037.setStyle("-fx-background-color: black"); } });

        Button038.setOnAction(event -> {
            if(button10[3][8]==true){ button10[3][8]=false;
                Button038.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[3][8]=true;
                Button038.setStyle("-fx-background-color: black"); } });

        Button039.setOnAction(event -> {
            if(button10[3][9]==true){ button10[3][9]=false;
                Button039.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[3][9]=true;
                Button039.setStyle("-fx-background-color: black"); } });

        Button040.setOnAction(event -> {
            if(button10[4][0]==true){ button10[4][0]=false;
                Button040.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[4][0]=true;
                Button040.setStyle("-fx-background-color: black"); } });

        Button041.setOnAction(event -> {
            if(button10[4][1]==true){ button10[4][1]=false;
                Button041.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[4][1]=true;
                Button041.setStyle("-fx-background-color: black"); } });

        Button042.setOnAction(event -> {
            if(button10[4][2]==true){ button10[4][2]=false;
                Button042.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[4][2]=true;
                Button042.setStyle("-fx-background-color: black"); } });

        Button043.setOnAction(event -> {
            if(button10[4][3]==true){ button10[4][3]=false;
                Button043.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[4][3]=true;
                Button043.setStyle("-fx-background-color: black"); } });

        Button044.setOnAction(event -> {
            if(button10[4][4]==true){ button10[4][4]=false;
                Button044.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[4][4]=true;
                Button044.setStyle("-fx-background-color: black"); } });

        Button045.setOnAction(event -> {
            if(button10[4][5]==true){ button10[4][5]=false;
                Button045.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[4][5]=true;
                Button045.setStyle("-fx-background-color: black"); } });

        Button046.setOnAction(event -> {
            if(button10[4][6]==true){ button10[4][6]=false;
                Button046.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[4][6]=true;
                Button046.setStyle("-fx-background-color: black"); } });

        Button047.setOnAction(event -> {
            if(button10[4][7]==true){ button10[4][7]=false;
                Button047.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[4][7]=true;
                Button047.setStyle("-fx-background-color: black"); } });

        Button048.setOnAction(event -> {
            if(button10[4][8]==true){ button10[4][8]=false;
                Button048.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[4][8]=true;
                Button048.setStyle("-fx-background-color: black"); } });

        Button049.setOnAction(event -> {
            if(button10[4][9]==true){ button10[4][9]=false;
                Button049.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[4][9]=true;
                Button049.setStyle("-fx-background-color: black"); } });


        Button050.setOnAction(event -> {
            if(button10[5][0]==true){ button10[5][0]=false;
                Button050.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[5][0]=true;
                Button050.setStyle("-fx-background-color: black"); } });


        Button051.setOnAction(event -> {
            if(button10[5][1]==true){ button10[5][1]=false;
                Button051.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[5][1]=true;
                Button051.setStyle("-fx-background-color: black"); } });


        Button052.setOnAction(event -> {
            if(button10[5][2]==true){ button10[5][2]=false;
                Button052.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[5][2]=true;
                Button052.setStyle("-fx-background-color: black"); } });


        Button053.setOnAction(event -> {
            if(button10[5][3]==true){ button10[5][3]=false;
                Button053.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[5][3]=true;
                Button053.setStyle("-fx-background-color: black"); } });


        Button054.setOnAction(event -> {
            if(button10[5][4]==true){ button10[5][4]=false;
                Button054.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[5][4]=true;
                Button054.setStyle("-fx-background-color: black"); } });

        Button055.setOnAction(event -> {
            if(button10[5][5]==true){ button10[5][5]=false;
                Button055.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[5][5]=true;
                Button055.setStyle("-fx-background-color: black"); } });

        Button056.setOnAction(event -> {
            if(button10[5][6]==true){ button10[5][6]=false;
                Button056.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[5][6]=true;
                Button056.setStyle("-fx-background-color: black"); } });

        Button057.setOnAction(event -> {
            if(button10[5][7]==true){ button10[5][7]=false;
                Button057.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[5][7]=true;
                Button057.setStyle("-fx-background-color: black"); } });

        Button058.setOnAction(event -> {
            if(button10[5][8]==true){ button10[5][8]=false;
                Button058.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[5][8]=true;
                Button058.setStyle("-fx-background-color: black"); } });

        Button059.setOnAction(event -> {
            if(button10[5][9]==true){ button10[5][9]=false;
                Button059.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[5][9]=true;
                Button059.setStyle("-fx-background-color: black"); } });


        Button060.setOnAction(event -> {
            if(button10[6][0]==true){ button10[6][0]=false;
                Button060.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[6][0]=true;
                Button060.setStyle("-fx-background-color: black"); } });


        Button061.setOnAction(event -> {
            if(button10[6][1]==true){ button10[6][1]=false;
                Button061.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[6][1]=true;
                Button061.setStyle("-fx-background-color: black"); } });

        Button062.setOnAction(event -> {
            if(button10[6][2]==true){ button10[6][2]=false;
                Button062.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[6][2]=true;
                Button062.setStyle("-fx-background-color: black"); } });


        Button063.setOnAction(event -> {
            if(button10[6][3]==true){ button10[6][3]=false;
                Button063.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[6][3]=true;
                Button063.setStyle("-fx-background-color: black"); } });


        Button064.setOnAction(event -> {
            if(button10[6][4]==true){ button10[6][4]=false;
                Button064.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[6][4]=true;
                Button064.setStyle("-fx-background-color: black"); } });

        Button065.setOnAction(event -> {
            if(button10[6][5]==true){ button10[6][5]=false;
                Button065.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[6][5]=true;
                Button065.setStyle("-fx-background-color: black"); } });

        Button066.setOnAction(event -> {
            if(button10[6][6]==true){ button10[6][6]=false;
                Button066.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[6][6]=true;
                Button066.setStyle("-fx-background-color: black"); } });

        Button067.setOnAction(event -> {
            if(button10[6][7]==true){ button10[6][7]=false;
                Button067.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[6][7]=true;
                Button067.setStyle("-fx-background-color: black"); } });

        Button068.setOnAction(event -> {
            if(button10[6][8]==true){ button10[6][8]=false;
                Button068.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[6][8]=true;
                Button068.setStyle("-fx-background-color: black"); } });

        Button069.setOnAction(event -> {
            if(button10[6][9]==true){ button10[6][9]=false;
                Button069.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[6][9]=true;
                Button069.setStyle("-fx-background-color: black"); } });

        Button070.setOnAction(event -> {
            if(button10[7][0]==true){ button10[7][0]=false;
                Button070.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[7][0]=true;
                Button070.setStyle("-fx-background-color: black"); } });


        Button071.setOnAction(event -> {
            if(button10[7][1]==true){ button10[7][1]=false;
                Button071.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[7][1]=true;
                Button071.setStyle("-fx-background-color: black"); } });

        Button072.setOnAction(event -> {
            if(button10[7][2]==true){ button10[7][2]=false;
                Button072.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[7][2]=true;
                Button072.setStyle("-fx-background-color: black"); } });

        Button073.setOnAction(event -> {
            if(button10[7][3]==true){ button10[7][3]=false;
                Button073.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[7][3]=true;
                Button073.setStyle("-fx-background-color: black"); } });

        Button074.setOnAction(event -> {
            if(button10[7][4]==true){ button10[7][4]=false;
                Button074.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[7][4]=true;
                Button074.setStyle("-fx-background-color: black"); } });

        Button075.setOnAction(event -> {
            if(button10[7][5]==true){ button10[7][5]=false;
                Button075.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[7][5]=true;
                Button075.setStyle("-fx-background-color: black"); } });

        Button076.setOnAction(event -> {
            if(button10[7][6]==true){ button10[7][6]=false;
                Button076.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[7][6]=true;
                Button076.setStyle("-fx-background-color: black"); } });

        Button077.setOnAction(event -> {
            if(button10[7][7]==true){ button10[7][7]=false;
                Button077.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[7][7]=true;
                Button077.setStyle("-fx-background-color: black"); } });

        Button078.setOnAction(event -> {
            if(button10[7][8]==true){ button10[7][8]=false;
                Button078.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[7][8]=true;
                Button078.setStyle("-fx-background-color: black"); } });

        Button079.setOnAction(event -> {
            if(button10[7][9]==true){ button10[7][9]=false;
                Button079.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[7][9]=true;
                Button079.setStyle("-fx-background-color: black"); } });

        Button080.setOnAction(event -> {
            if(button10[8][0]==true){ button10[8][0]=false;
                Button080.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[8][0]=true;
                Button080.setStyle("-fx-background-color: black"); } });

        Button081.setOnAction(event -> {
            if(button10[8][1]==true){ button10[8][1]=false;
                Button081.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[8][1]=true;
                Button081.setStyle("-fx-background-color: black"); } });

        Button082.setOnAction(event -> {
            if(button10[8][2]==true){ button10[8][2]=false;
                Button082.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[8][2]=true;
                Button082.setStyle("-fx-background-color: black"); } });

        Button083.setOnAction(event -> {
            if(button10[8][3]==true){ button10[8][3]=false;
                Button083.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[8][3]=true;
                Button083.setStyle("-fx-background-color: black"); } });

        Button084.setOnAction(event -> {
            if(button10[8][4]==true){ button10[8][4]=false;
                Button084.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[8][4]=true;
                Button084.setStyle("-fx-background-color: black"); } });


        Button085.setOnAction(event -> {
            if(button10[8][5]==true){ button10[8][5]=false;
                Button085.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[8][5]=true;
                Button085.setStyle("-fx-background-color: black"); } });

        Button086.setOnAction(event -> {
            if(button10[8][6]==true){ button10[8][6]=false;
                Button086.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[8][6]=true;
                Button086.setStyle("-fx-background-color: black"); } });

        Button087.setOnAction(event -> {
            if(button10[8][7]==true){ button10[8][7]=false;
                Button087.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[8][7]=true;
                Button087.setStyle("-fx-background-color: black"); } });

        Button088.setOnAction(event -> {
            if(button10[8][8]==true){ button10[8][8]=false;
                Button088.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[8][8]=true;
                Button088.setStyle("-fx-background-color: black"); } });

        Button089.setOnAction(event -> {
            if(button10[8][9]==true){ button10[8][9]=false;
                Button089.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[8][9]=true;
                Button089.setStyle("-fx-background-color: black"); } });

        Button090.setOnAction(event -> {
            if(button10[9][0]==true){ button10[9][0]=false;
                Button090.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[9][0]=true;
                Button090.setStyle("-fx-background-color: black"); } });


        Button091.setOnAction(event -> {
            if(button10[9][1]==true){ button10[9][1]=false;
                Button091.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[9][1]=true;
                Button091.setStyle("-fx-background-color: black"); } });

        Button092.setOnAction(event -> {
            if(button10[9][2]==true){ button10[9][2]=false;
                Button092.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[9][2]=true;
                Button092.setStyle("-fx-background-color: black"); } });

        Button093.setOnAction(event -> {
            if(button10[9][3]==true){ button10[9][3]=false;
                Button093.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[9][3]=true;
                Button093.setStyle("-fx-background-color: black"); } });

        Button094.setOnAction(event -> {
            if(button10[9][4]==true){ button10[9][4]=false;
                Button094.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[9][4]=true;
                Button094.setStyle("-fx-background-color: black"); } });

        Button095.setOnAction(event -> {
            if(button10[9][5]==true){ button10[9][5]=false;
                Button095.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[9][5]=true;
                Button095.setStyle("-fx-background-color: black"); } });

        Button096.setOnAction(event -> {
            if(button10[9][6]==true){ button10[9][6]=false;
                Button096.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[9][6]=true;
                Button096.setStyle("-fx-background-color: black"); } });

        Button097.setOnAction(event -> {
            if(button10[9][7]==true){ button10[9][7]=false;
                Button097.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[9][7]=true;
                Button097.setStyle("-fx-background-color: black"); } });

        Button098.setOnAction(event -> {
            if(button10[9][8]==true){ button10[9][8]=false;
                Button098.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[9][8]=true;
                Button098.setStyle("-fx-background-color: black"); } });

        Button099.setOnAction(event -> {
            if(button10[9][9]==true){ button10[9][9]=false;
                Button099.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button10[9][9]=true;
                Button099.setStyle("-fx-background-color: black"); } });
      /*  Button000.setOnAction(event -> {
            if(button[0]==true){ button[0]=false;
                Button000.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[0]=true;
                Button000.setStyle("-fx-background-color: black"); } });

        Button001.setOnAction(event -> {
            if(button[1]==true){ button[1]=false;
                Button001.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[1]=true;
                Button001.setStyle("-fx-background-color: black"); } });

        Button002.setOnAction(event -> {
            if(button[2]==true){ button[2]=false;
                Button002.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[2]=true;
                Button002.setStyle("-fx-background-color: black"); } });


        Button003.setOnAction(event -> {
            if(button[3]==true){ button[3]=false;
                Button003.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[3]=true;
                Button003.setStyle("-fx-background-color: black"); } });


        Button004.setOnAction(event -> {
            if(button[4]==true){ button[4]=false;
                Button004.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[4]=true;
                Button004.setStyle("-fx-background-color: black"); } });

        Button005.setOnAction(event -> {
            if(button[5]==true){ button[5]=false;
                Button005.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[5]=true;
                Button005.setStyle("-fx-background-color: black"); } });

        Button006.setOnAction(event -> {
            if(button[6]==true){ button[5]=false;
                Button006.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[6]=true;
                Button006.setStyle("-fx-background-color: black"); } });

        Button007.setOnAction(event -> {
            if(button[7]==true){ button[7]=false;
                Button007.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[7]=true;
                Button007.setStyle("-fx-background-color: black"); } });

        Button008.setOnAction(event -> {
            if(button[8]==true){ button[8]=false;
                Button008.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[8]=true;
                Button008.setStyle("-fx-background-color: black"); } });

        Button009.setOnAction(event -> {
            if(button[9]==true){ button[9]=false;
                Button009.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[9]=true;
                Button009.setStyle("-fx-background-color: black"); } });


        Button010.setOnAction(event -> {
            if(button[10]==true){ button[10]=false;
                Button010.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[10]=true;
                Button010.setStyle("-fx-background-color: black"); } });


        Button011.setOnAction(event -> {
            if(button[11]==true){ button[11]=false;
                Button011.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[11]=true;
                Button011.setStyle("-fx-background-color: black"); } });


        Button012.setOnAction(event -> {
            if(button[12]==true){ button[12]=false;
                Button012.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[12]=true;
                Button012.setStyle("-fx-background-color: black"); } });





        Button013.setOnAction(event -> {
            if(button[13]==true){ button[13]=false;
                Button013.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[13]=true;
                Button013.setStyle("-fx-background-color: black"); } });


        Button014.setOnAction(event -> {
            if(button[14]==true){ button[14]=false;
                Button014.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[14]=true;
                Button014.setStyle("-fx-background-color: black"); } });

        Button015.setOnAction(event -> {
            if(button[15]==true){ button[15]=false;
                Button015.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[15]=true;
                Button015.setStyle("-fx-background-color: black"); } });

        Button016.setOnAction(event -> {
            if(button[16]==true){ button[16]=false;
                Button016.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[16]=true;
                Button016.setStyle("-fx-background-color: black"); } });

        Button017.setOnAction(event -> {
            if(button[17]==true){ button[17]=false;
                Button017.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[17]=true;
                Button017.setStyle("-fx-background-color: black"); } });

        Button018.setOnAction(event -> {
            if(button[18]==true){ button[18]=false;
                Button018.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[18]=true;
                Button018.setStyle("-fx-background-color: black"); } });

        Button019.setOnAction(event -> {
            if(button[19]==true){ button[19]=false;
                Button019.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[19]=true;
                Button019.setStyle("-fx-background-color: black"); } });


        Button020.setOnAction(event -> {
            if(button[20]==true){ button[20]=false;
                Button020.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[20]=true;
                Button020.setStyle("-fx-background-color: black"); } });


        Button021.setOnAction(event -> {
            if(button[21]==true){ button[21]=false;
                Button021.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[21]=true;
                Button021.setStyle("-fx-background-color: black"); } });

        Button022.setOnAction(event -> {
            if(button[22]==true){ button[22]=false;
                Button022.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[22]=true;
                Button022.setStyle("-fx-background-color: black"); } });


        Button023.setOnAction(event -> {
            if(button[23]==true){ button[23]=false;
                Button023.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[23]=true;
                Button023.setStyle("-fx-background-color: black"); } });


        Button024.setOnAction(event -> {
            if(button[24]==true){ button[24]=false;
                Button024.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[24]=true;
                Button024.setStyle("-fx-background-color: black"); } });

        Button025.setOnAction(event -> {
            if(button[25]==true){ button[25]=false;
                Button025.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[25]=true;
                Button025.setStyle("-fx-background-color: black"); } });

        Button026.setOnAction(event -> {
            if(button[26]==true){ button[26]=false;
                Button026.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[26]=true;
                Button026.setStyle("-fx-background-color: black"); } });

        Button027.setOnAction(event -> {
            if(button[27]==true){ button[27]=false;
                Button027.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[27]=true;
                Button027.setStyle("-fx-background-color: black"); } });

        Button028.setOnAction(event -> {
            if(button[28]==true){ button[28]=false;
                Button028.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[28]=true;
                Button028.setStyle("-fx-background-color: black"); } });

        Button029.setOnAction(event -> {
            if(button[29]==true){ button[29]=false;
                Button029.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[29]=true;
                Button029.setStyle("-fx-background-color: black"); } });

        Button030.setOnAction(event -> {
            if(button[30]==true){ button[30]=false;
                Button030.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[30]=true;
                Button030.setStyle("-fx-background-color: black"); } });


        Button031.setOnAction(event -> {
            if(button[31]==true){ button[31]=false;
                Button031.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[31]=true;
                Button031.setStyle("-fx-background-color: black"); } });

        Button032.setOnAction(event -> {
            if(button[32]==true){ button[32]=false;
                Button032.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[32]=true;
                Button032.setStyle("-fx-background-color: black"); } });

        Button033.setOnAction(event -> {
            if(button[33]==true){ button[33]=false;
                Button033.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[33]=true;
                Button033.setStyle("-fx-background-color: black"); } });

        Button034.setOnAction(event -> {
            if(button[34]==true){ button[34]=false;
                Button034.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[34]=true;
                Button034.setStyle("-fx-background-color: black"); } });

        Button035.setOnAction(event -> {
            if(button[35]==true){ button[35]=false;
                Button035.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[35]=true;
                Button035.setStyle("-fx-background-color: black"); } });

        Button036.setOnAction(event -> {
            if(button[36]==true){ button[36]=false;
                Button036.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[36]=true;
                Button036.setStyle("-fx-background-color: black"); } });

        Button037.setOnAction(event -> {
            if(button[37]==true){ button[37]=false;
                Button037.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[37]=true;
                Button037.setStyle("-fx-background-color: black"); } });

        Button038.setOnAction(event -> {
            if(button[38]==true){ button[38]=false;
                Button038.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[38]=true;
                Button038.setStyle("-fx-background-color: black"); } });

        Button039.setOnAction(event -> {
            if(button[39]==true){ button[39]=false;
                Button039.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[39]=true;
                Button039.setStyle("-fx-background-color: black"); } });

        Button040.setOnAction(event -> {
            if(button[40]==true){ button[40]=false;
                Button040.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[40]=true;
                Button040.setStyle("-fx-background-color: black"); } });

        Button041.setOnAction(event -> {
            if(button[41]==true){ button[41]=false;
                Button041.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[41]=true;
                Button041.setStyle("-fx-background-color: black"); } });

        Button042.setOnAction(event -> {
            if(button[42]==true){ button[42]=false;
                Button042.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[42]=true;
                Button042.setStyle("-fx-background-color: black"); } });

        Button043.setOnAction(event -> {
            if(button[43]==true){ button[43]=false;
                Button043.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[43]=true;
                Button043.setStyle("-fx-background-color: black"); } });

        Button044.setOnAction(event -> {
            if(button[44]==true){ button[44]=false;
                Button044.setStyle("-fx-background-color:#FFFFF0"); }
            else{ button[44]=true;
                Button044.setStyle("-fx-background-color: black"); } });
*/
    }
}
