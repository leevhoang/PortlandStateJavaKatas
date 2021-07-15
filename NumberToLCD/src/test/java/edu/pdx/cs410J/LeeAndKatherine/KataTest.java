package edu.pdx.cs410J.LeeAndKatherine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest
{

  @Test
  void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  void passingOneReturnsLCDOne() {
    Kata test = new Kata();
    String lcd = test.num2LCD("1");
    assertEquals(lcd, "\n|\n|");
  }

}
