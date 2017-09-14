package labthree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class TipCalculator {

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Gregory M. Kapfhammer " + new Date());
    // declare the starting file and scanner
    File tipInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      tipInputsFile = new File("input/tip_inputs.txt");
      scanner = new Scanner(tipInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: read in and display the person's name
    String name = scanner.nextLine();
    System.out.println(name + ", welcome to the tip calculator.");
    // Step Two: read in and display the amount of the bill

    // Step Three: Read in and display the tip percentage

    // Step Four: Calculate and display the tip amount

    // Step Five: Calculate and display the total bill


    // Step Six: Read in and display the number of bill payers


    // Step Seven: Calculate and display the amount each person should pay


    // Step Eight: Display a final thankyou message

  }

}
