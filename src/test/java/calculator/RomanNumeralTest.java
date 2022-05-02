package calculator;

import com.gmail.at.kotamadeo.Converter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/romanToArabicNumbers.csv", delimiter = '=')
    void romanToArabicNumbers(String input, int expected) {
        assertEquals(expected, Converter.romanToArabicNumbers(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/arabicToRomanNumbers.csv", delimiter = '=')
    void arabicToRoman(int input, String expected) {
        assertEquals(expected, Converter.arabicToRomanNumbers(input));
    }
}