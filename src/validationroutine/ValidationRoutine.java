/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validationroutine;

import java.util.Scanner;

/**
 *
 * @author 1-WFokinther
 */

public class ValidationRoutine {

    public static void main(String[] args) {
     //Menu
     System.out.println("Here are the menu choices: ");
     System.out.println("Postcode Check: (1)" );
     System.out.println("Presence Check: (2)");
     System.out.println("Other / Expansion: (3)");
     System.out.println("Please choose one of the options and input it by typing the number, and only the number.");
     //NFT ADDRESS RANGE CHECK 32 DIGITS
     //choice input
     Scanner myObj = new Scanner(System.in); //Create scanner object (w3schools scanner)
     String MenuInput = myObj.nextLine(); //read user input (w3schools scanner)
     
     //Postcode Check (1)
      if (MenuInput.equals("1")) { 
          System.out.println("Please input a valid postcode, in the format LLNN NLL");
          String PostcodeInput = myObj.nextLine(); //read user input
          //https://www.w3schools.com/java/ref_string_charat.asp 
          //Use that to check user input for letters and numbers.
          //range check first, 8 characters
          int PostcodeLength = PostcodeInput.length();
          boolean format = true;
          if (PostcodeLength == 8) {
            System.out.println("8 characters");
            char[] postcodeArray = PostcodeInput.toCharArray();//Put input into an array so each character can be checked
                if (Character.isLetter(postcodeArray[0])) { //Check if first in array is Character
                    //System.out.println("Valid");
                 }
                else {
                    System.out.println("Invalid");
                    format = false;
                }
                if (Character.isLetter(postcodeArray[1])) {
                    //System.out.println("Valid");
                 }
                else {
                    System.out.println("Invalid");
                    format = false;
                }
                if (Character.isDigit(postcodeArray[2])) {
                    //System.out.println("Valid");
                 }
                else {
                    System.out.println("Invalid");
                    format = false;
                } 

                if (Character.isDigit(postcodeArray[3])) { 
                    //System.out.println("Valid");
                 }
                else {
                    System.out.println("Invalid");
                    format = false;
                }

                if (Character.isSpace(postcodeArray[4])) { //check if is a space 
                    //System.out.println("Valid");
                 }
                else {
                    System.out.println("Invalid");
                    format = false;
                }
                if (Character.isDigit(postcodeArray[5])) { 
                    //System.out.println("Valid");
                 }
                else {
                    System.out.println("Invalid");
                    format = false;
                }
                if (Character.isLetter(postcodeArray[6])) {
                    //System.out.println("Valid");
                 }
                else {
                    System.out.println("Invalid");
                    format = false;
                }
                if (Character.isLetter(postcodeArray[7])) {
                    System.out.println("Valid");
                 }
                else {
                    System.out.println("Invalid");
                    format = false;
                }
            
      } 
     //Presence Check
      //else if (MenuInput.equals("2")) {
        //System.out.println("Input something so we can check if you actually did.");
        //Scanner myObj = new Scanner(System.in); //Create scanner object (w3schools scanner)
        String PresenceCheckInput = myObj.nextLine(); //read user input (w3schools scanner)
        boolean isvalid = false;
         isvalid = presenceCheck(PresenceCheckInput);
      }
    }

    public static boolean presenceCheck(String PresenceCheckInput) {
        boolean presence = false;
        boolean isEmpty;
        String outputMessage;

        if (PresenceCheckInput.isEmpty())
        {
            presence = false;
            outputMessage = ("No input detected");// 1 text box for output instead of 2 textboxes.
            System.out.println(outputMessage); //output when no input given
            return presence;
            
        }
        else{
                presence = true;
                outputMessage = ("Input detected");
                return presence;
                }

  
    }
}
