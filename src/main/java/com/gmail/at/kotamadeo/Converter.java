package com.gmail.at.kotamadeo;

import com.gmail.at.kotamadeo.exceptions.RomanCalculationException;

import java.util.List;

public class Converter {
    public static int romanToArabicNumbers(String number) {
        return 1 + List.of("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X").indexOf(number);
    }

    public static String arabicToRomanNumbers(int number) throws RomanCalculationException {
        if (number > 0) {
            return String.join("",
                    number == 100 ? "C" : "",
                    new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}[number % 100 / 10],
                    new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}[number % 10]
            );
        } else {
            throw new RomanCalculationException("Ошибка! В римской системе счисления нет отрицательных чисел!");
        }
    }
}
