package testdemo.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {

    RomanNumeral romanNumeral = new RomanNumeral();

    //Arrange
    //Act
    //Assert

    @Test
    void convertingRomanIGivesNumber1Back() {
        assertEquals(1, romanNumeral.convert("I"), "Converting I should return 1");
    }

    @Test
    void convertingRomanXGivesNumber10Back() {
        assertEquals(10, romanNumeral.convert("X"), "Converting X should return 10");
    }

    @Test
    void convertingEmptyStringGives0Back() {
        assertEquals(0, romanNumeral.convert(""));
    }

    @Test
    void convertingIXGives9Back() {
        assertEquals(9, romanNumeral.convert("IX"));
    }


}