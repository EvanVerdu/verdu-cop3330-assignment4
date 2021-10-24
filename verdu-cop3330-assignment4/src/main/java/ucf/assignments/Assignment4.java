package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Evan Verdu
 */

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class Assignment4 extends Application {

      @Override
      public void start(Stage PrimaryStage) throws Exception {
                Parent root = FXMLLoader.load(getClass().getResource("/SceneBuilder1.fxml"));


                PrimaryStage.setScene(new Scene(root));
                PrimaryStage.show();
      }

      public static void main(String[] Args){

          launch(Args);

          //CreateMainlist (Creates the array that would store the information)
          //IfButtonPress (Checks for any button press which would result in a change)
          //DisplayALlInformationTextArea (Checks if user selects any list or item and displays its information, or maintains first item of first list as default on display)
      }


    //Lets the ArrayLists store items with a name, description and due date.
    public class Item {
        String Name;
        String Description;
        String DueDate;
    }

}
