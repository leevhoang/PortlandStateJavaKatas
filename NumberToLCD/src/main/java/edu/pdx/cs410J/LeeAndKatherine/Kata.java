package edu.pdx.cs410J.LeeAndKatherine;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  public Kata() {

  }

  // 1
  // 12
  // 123
  public static String num2LCD(String num) {
    String lcd = "";

    for (int i = 0; i < num.length(); ++i) {
      if (num.charAt(i) == '1') {
        lcd = "\n|\n|";
      } else if (num.charAt(i) == '2') {
        lcd = "_\n_|\n|_";
      } else if (num.charAt(i) == '3') {
        lcd = "_\n_|\n_|";
      } else if (num.charAt(i) == '4') {
        lcd = "  \n|_|\n  |";
      } else if (num.charAt(i) == '5') {
        lcd = " _\n|_\n_|";
      } else if (num.charAt(i) == '6') {
        lcd = " _\n|_\n|_|";
      } else if (num.charAt(i) == '7') {
        lcd = "_\n |\n |";
      } else if (num.charAt(i) == '8') {
        lcd = " _\n|_|\n|_|";
      } else if (num.charAt(i) == '9') {
        lcd = " _\n|_|\n _|";
      }
    }

    return lcd;
  }

  //
  public static void main(String[] args) {
//    System.err.println("Missing command line arguments");
//    System.exit(1);

    if (args.length == 0) {
      System.err.println("Missing command line arguments");
      System.exit(1);
    }

    // Number to parse
    String lcd = num2LCD(args[0]);
    System.out.println(lcd);
  }


}