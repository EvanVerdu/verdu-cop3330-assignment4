package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Evan Verdu
 */

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class AddList_Test {

    @Test
    public void AddList(ArrayList<ArrayList<Assignment4.Item>> MainList) throws Exception{

        Take user input
        creates new arraylist by name of user input
        Adds arraylist to the mainlist
        MainList.add(input);

        //Scans to make sure the length of MainList isn't greater than 100, If it is it will output to the user number of lists is at its maximum.
        if MainList.size() >= 100
        create popup text
        "The number of Lists has reached a maximum, please remove or edit a list to create a new one"

    }

}