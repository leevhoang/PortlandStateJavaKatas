package edu.pdx.cs410J.LeeSamJaegerHannahMinh;

import java.util.ArrayList;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    
  private static String pacManDirection = "V";
  private static final String up = "V";
  private static final String down = "A";
  private static final String left = ">";
  private static final String right = "<";

  /**
   * Set Pac Man's direction.
   * @param direction The direction to face.
   */
  public static void setDirection(String direction) {
    if (direction.equals("up")) {
      pacManDirection = up;
    } else if (direction.equals("down")) {
      pacManDirection = down;
    } else if (direction.equals("left")) {
      pacManDirection = left;
    } else {
      pacManDirection = right;
    }
  }

  public static void main(String[] args) {

    // if no arguments are provided, show an error and exit
    if (args.length == 0) {
      System.err.println("Missing command line arguments");
      System.exit(1);
    }

    // Map
    // 8 x 8 by default
    ArrayList<String> map = new ArrayList<>();
    String upperBound = "| _ _ _ _ _ _ _ _ |";
    String lowerBound = "| _ _ _ _ _ _ _ _ |";

    map.add(upperBound);
    map.add("|<. . . . . . . . |");
    map.add("| . . . . . . . . |");
    map.add("| . . . . . . . . |");
    map.add("| . . . . . . . . |");
    map.add("| . . . . . . . . |");
    map.add("| . . . . . . . . |");
    map.add(lowerBound);

    for (String w: map) {
      System.out.println(w);
    }
  }
}