package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Evan Verdu
 */


import java.util.ArrayList;

public class AddList {

    //Adds a List to the MainList
    public static void AddList(ArrayList<ArrayList<Assignment4.Item>> MainList){
        //Scans user input from the text area (Title of new List) if they press the Add List button.
        //Uses input to create another arraylist that will store items.
        //Adds new List to MainList, with input as the name of the list.
        //Displays List in the MainList column.

        Take user input
        creates new arraylist by name of user input
        Adds arraylist to the mainlist
        MainList.add(input)

        //Scans to make sure the length of MainList isn't greater than 100, If it is it will output to the user number of lists is at its maximum.
        if MainList.size() >= 100
        create popup text
        "The number of Lists has reached a maximum, please remove or edit a list to create a new one"



    }


}
