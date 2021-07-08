package edu.pdx.cs410J.LeeYufeiPair;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

class KataIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsHasExitCodeOf1() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class);
    assertThat(result.getExitCode(), equalTo(1));
  }

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void invokingMainWithArgumentPrintsResult() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "5");
    assertThat(result.getTextWrittenToStandardOut(), containsString("BarBar"));
  }

  @Test
  void invokingMainWith21PrintsFooQix() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "21");
    assertThat(result.getTextWrittenToStandardOut(), containsString("FooQix"));
  }

  @Test
  void invokingMainWith37PrintsFooQix() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "37");
    assertThat(result.getTextWrittenToStandardOut(), containsString("FooQix"));
  }

  @Test
  void invokingMainWithTooManyArgumentsPrintsTooManyArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "5", "abc");
    assertThat(result.getTextWrittenToStandardError(), containsString("Too many command line arguments"));
  }


}
