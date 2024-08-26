package org.example.registrationform;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.skin.CheckBoxSkin;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setGridLinesVisible(true);

        Label lblTitle = new Label("Registration form");
        lblTitle.setFont(Font.font(24));
        lblTitle.setTextFill(Color.NAVY);
        root.add(lblTitle,1,1);

        Label lblUsername = new Label("Username");
        lblUsername.setFont(Font.font(18));
        TextField txtUsername = new TextField();
        txtUsername.setFont(Font.font(18));
        root.add(lblUsername,1,2);
        root.add(txtUsername,2,2);

        Label lblPassword = new Label("Password");
        lblPassword.setFont(Font.font(18));
        PasswordField txtPassword = new PasswordField();
        txtPassword.setFont(Font.font(18));
        root.add(lblPassword,1,3);

        Label lblSkills = new Label("Skills");
        CheckBox chkCPP = new CheckBox("C++");
        CheckBox chkJava = new CheckBox("Java");
        HBox boxSkills = new HBox();
        boxSkills.getChildren().addAll(chkCPP,chkJava);
        boxSkills.setSpacing(10);
        root.add(lblSkills,1,4);
        root.add(boxSkills,2,4);

        Label lblGender = new Label("Gender");
        RadioButton rdMale = new RadioButton("Male");
        RadioButton rdFemale = new RadioButton("Female");
        ToggleGroup tgGender = new ToggleGroup();
        rdMale.setToggleGroup(tgGender);
        rdFemale.setToggleGroup(tgGender);
        HBox boxGender = new HBox();
        boxGender.getChildren().addAll(rdFemale,rdMale);
        root.add(lblGender,1,5);
        root.add(boxGender,2,5);

        Label lblUni = new Label("University");
        lblUni.setFont(Font.font(18));
        ComboBox<String> cbUni = new ComboBox<>();
        cbUni.getItems().addAll("Erciyes University","Kayseri University", "Abdullah Gül University", "Nuh Naci Yazgan University");
        //cbUni.setEditable(true);
        cbUni.setValue("Kayseri University");
        root.add(lblUni,1,6);
        root.add(cbUni,2,6);

        cbUni.setOnAction(e-> System.out.println(cbUni.getSelectionModel().getSelectedItem()));

        stage.setScene(new Scene(root,400,600));

    }

    public static void main(String[] args) {

        HelloApplication a1 = new HelloApplication();

    }
}