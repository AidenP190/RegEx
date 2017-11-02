/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexproject;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author aparsons
 */
public class RegExProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Number;
        
        Pattern A = Pattern.compile("[(]?([0-9]{3})[)-.][' ']?([0-9]{3})[.-]([0-9]{4})");
        
        System.out.println("Please enter your phone number.");
        
        Scanner myScanner = new Scanner(System.in);
        Number = myScanner.nextLine();
        
        Matcher matchA = A.matcher(Number);
        
        if(matchA.matches())
        { 
            String groupOne = matchA.group(1);
            String groupTwo = matchA.group(2);
            String groupThree = matchA.group(3);  
            System.out.println("Your number matches the format.");
            System.out.println("(" + groupOne + ") " + groupTwo + "-" + groupThree);
        }
        else
        {
            System.out.println("Phone number does not match the format.");
        }
    }
    
}
