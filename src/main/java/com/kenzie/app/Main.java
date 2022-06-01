package com.kenzie.app;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.util.stream.StreamSupport;


public class Main {

    public static void main(String[] args) {


        //This method takes in list of names and outputs a String

        // Step 1 - Print out a welcome message and instructions
        // Step 2 - In a loop, collect each attendee name and store it in a list
        // Step 3 - when they enter a blank name, then stop looping
        // Step 4 - Then iterate over the attendee list to create the output string (using StringBuilder!)
        //
        // Note that there are three distinct formats for the output string depending on the number of attendees
        // More than 2 attendees:
        // You have invited: Leslie Knope, April Ludgate, and Ron Swanson
        //
        // Exactly 2 attendees:
        // You have invited: Leslie Knope and Ron Swanson
        //
        // Only 1 attendee:
        // You have invited: Leslie Knope
        //
        // Your output should exactly match the way these are formatted with spaces, commas, and the "and"

        // Your Code Here
        //create dynamic array
        ArrayList<String> nameList = new ArrayList<String>();
        //create scanner
        Scanner nameObj = new Scanner(System.in);

        System.out.println("Hello! Who would you like to invite to the party? \n " +
                "Enter an attendee name and press Enter. \n Leave the name blank and press Enter when you are done.");

        String userInput = nameObj.nextLine();

        while(!userInput.equals("")){
            nameList.add(userInput);
            userInput = nameObj.nextLine();
        }

        System.out.println(formatAttendeeList(nameList));

    }
    public static String formatAttendeeList(ArrayList nameList ){
        //method takes in list of names and outputs String
        //this method should use StringBuilder to construct the output string
        //include a comma separated list of names
        //there should be an and before the last name
        StringBuilder attendeeList = new StringBuilder("You have invited: ");

        if (nameList.size() == 1) {
            attendeeList.append(nameList.get(0));
        } else if (nameList.size() == 2) {
            attendeeList.append(nameList.get(0) + " and " + nameList.get(1));
        } else {
            for(int i = 0; i < nameList.size() -1; i++) {
                attendeeList.append(nameList.get(i));
                attendeeList.append(", ");
            }
            String lastOne = nameList.get(nameList.size()-1).toString();
            attendeeList.append("and ");
            attendeeList.append(lastOne);
        }

        return attendeeList.toString();
    }

}
