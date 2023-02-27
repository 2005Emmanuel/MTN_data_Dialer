/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning_Projects;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Mtn_dial { //main class

    public static void main(String[] args) { //main method
        Dial dial = new Dial(); //object of class Dial
        dial.dial_pin(); //using the object to call the dial_pin method

    }
}

class Dial {

    public void dial_pin() { //dial_pin method
        Scanner scanner1 = new Scanner(System.in);// object of class Scanner
        System.out.println("Dial  code");
        String pin = scanner1.nextLine(); ////User prompt
        if (pin.equals("*131#")) { //using if else statement to check if the user input equals *131#

            String[] Array = {"1. buy data", "2. buy airtime"}; //this code block are going to be executed if user input is *131#
            for (String i : Array) {
                System.out.println(i);

            }
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("make a purchase");
            switch (scanner2.nextInt()) { //User prompt
                case 1:
                    buy_data();  //calling the buy_data method if User input is 1
                    break;
                default:
                    System.out.println("Learning_Projects.Dial.dial_pin()");
                    break;

            }

        } else { //if User input is not equals to *131# this is going to executed
            System.out.println("you dialed an Incorrect code");
        }

    }

    public void buy_data() {
        String[] Array = {"1. 20mb", "2. 30mb", "3. 40mb", "4. 50mb", "5. menu"};
        for (String i : Array) { //looping through the Array
            System.out.println(i);
        }

        Scanner scanner3 = new Scanner(System.in);
        System.out.println();
        switch (scanner3.nextInt()) {//User_prompt
            case 1:
                twenty_mb(); //calling the twenty_mb method if User input is 1
                break;

            case 5:
                dial_pin();  //calling the dial_pin method if User input is 5
                break;
        }
    }

    public void twenty_mb() {
        System.out.println("20mb Succesfully purchased");
    }

}



