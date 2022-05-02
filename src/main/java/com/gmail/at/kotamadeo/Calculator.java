
package com.gmail.at.kotamadeo;


import com.gmail.at.kotamadeo.exceptions.InputException;
import com.gmail.at.kotamadeo.utils.Utils;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class Calculator {
    private final Map<String, IntBinaryOperator> calculateOperation = Map.of(
            "-", (x, y) -> x - y,
            "+", (x, y) -> x + y,
            "/", (x, y) -> x / y,
            "*", (x, y) -> x * y);
    private final Expression expression = new Expression();
    private final Scanner scanner = new Scanner(System.in);



    public void start() {
        try {
            System.out.println(Utils.ANSI_GREEN + "Введите ваше выражение в формате: 1 + 1 или I + I:" +
                    Utils.ANSI_RESET);
            var firstValue = scanner.next(expression.getARABIC() + expression.getOR() +
                    expression.getROMAN());
            var operand = scanner.next(expression.getOPERATION());
            var isRoman = firstValue.matches(expression.getROMAN());
            var secondValue = scanner.next(isRoman ? expression.getROMAN() : expression.getARABIC());
            ToIntFunction<String> toArabicFromRoman = isRoman ? Converter::romanToArabicNumbers : Integer::parseInt;
            IntFunction<String> toStringArabicNumbers = isRoman ? Converter::arabicToRomanNumbers : Integer::toString;
            int result = calculateOperation.get(operand).applyAsInt(toArabicFromRoman.applyAsInt(firstValue),
                    toArabicFromRoman.applyAsInt(secondValue));
            System.out.printf("%sРезультат выражения %s %s %s равен: %s.%s%n", Utils.ANSI_PURPLE, firstValue, operand,
                    secondValue, toStringArabicNumbers.apply(result), Utils.ANSI_RESET);
        } catch (InputException e) {
            throw new InputException("Ошибка ввода!");
        }
    }
}
