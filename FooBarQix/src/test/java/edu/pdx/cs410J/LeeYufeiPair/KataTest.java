package edu.pdx.cs410J.LeeYufeiPair;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class KataTest
{

  @Test
  void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  void canCallKataCompute() {
    String result = Kata.compute("5");
  }

  @Test
  void computeDoesNotWorkWithLetters() {
    String result = Kata.compute("a");
    assertThat(result, equalTo(""));
  }

  @Test
  void computeWorksWithNegativeNumber() {
    String result = Kata.compute("-5");
    assertThat(result, equalTo("BarBar")); // Don't add the negative sign to the string
  }

}
