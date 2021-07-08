package edu.pdx.cs410J.LeeYufeiPair;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  /**
   * Based on a given number, write it as a combination of
   * @param number The number as a string.
   * @return A modified string (3 -> FooFoo)
   */
  public static String compute(String number) {
    String result = "";
    if (Integer.parseInt(number) % 3 == 0) {
      result += "Foo";
    }

    if (Integer.parseInt(number) % 5 == 0) {
      result += "Bar";
    }

    if (Integer.parseInt(number) % 7 == 0) {
      result += "Qix";
    }

    for (int i = 0; i < number.length(); ++i) {
      if (number.charAt(i) == '3') {
        result += "Foo";
      }
      if (number.charAt(i) == '5') {
        result += "Bar";
      }
      if (number.charAt(i) == '7') {
        result += "Qix";
      }
    }



    return result;
  }

  public static void main(String[] args) {

    if (args.length == 0) {
      System.err.println("Missing command line arguments");
      System.exit(1);
    } else if (args.length == 1) {
      System.out.println(Kata.compute(args[0]));
      System.exit(0);
    } else {
      System.err.println("Too many command line arguments");
      System.exit(1);
    }

  }


}