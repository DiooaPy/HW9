package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.GregorianCalendar;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import main.Calendar;

class TestCalendar {
  GregorianCalendar gre = new GregorianCalendar();

  @ParameterizedTest
  @ValueSource(ints = {1825, 1910, 1955, 2002, 2021})
  public void Should_check_if_year_is_leap_also_in_gregorian(int year) {
    Calendar calendar = new Calendar(year);

    boolean actualResult = calendar.isLeapYear();
    boolean expectedResult = gre.isLeapYear(year);

    assertFalse(expectedResult != actualResult);

  }

  // Implement test cases for the equivalent partitions

  // input 1901 <= year <= 2000 , output false/true
  @ParameterizedTest
  @ValueSource(ints = {1896, 1996, 1804, 2020, 1812})
  public void TC_valid_years(int year) {
    Calendar calendar = new Calendar(year);
    boolean actualResult = false;
    if (year < 1901) {
      actualResult = false;
    } else if (year > 2000) {
      actualResult = false;
    } else {
      actualResult = true;
    }
    boolean expectedResult = calendar.isLeapYear();

    assertTrue(expectedResult == actualResult);
  }
}
