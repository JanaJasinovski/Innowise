package org.example.model;

import org.example.exception.NegativeException;

public interface Service {
    // 1.1 Реализовать функция, которая принимает два целых числа (a, b) и возвращает массив,
    // содержащий по очереди  "b" первых цифр из "a". (34634552, 6) -> [3, 4, 6, 3, 4, 5].
    int[] arrayContainingBFromAInt(int a, int b);

    // 1.2 сдлетаь 1.1 для вещественного числа. Цифры будут выводиться после запятой. (1.34565634, 4) -> [3, 4, 5, 6].
    int[] arrayContainingBFromADouble(double a, int b);

    // 2.1 . Реализовать функцию, которая принимает вещественное число и возвращает булиан: есть ли среди первых трех
    // цифр дробной части заданного положительного вещественного числа, цифра 0.
    // (2.2 -> false)
    // (2.04 -> true)
    // (3.33305 -> false)
    // (434.8902 -> true)
    boolean isAmongFirstThreeDigitsOfFractionalPart0(double a);

    // 2.2 . Реализовать функцию, которая принимает вещественное число и возвращает булиан: равна ли первая цифра
    // дробной части переданного вещественного числа  третьей цифре не дробной части.
    // (2.2 -> false)
    // (2.04 -> false)
    // (316.35305 -> true)
    // (134.1902 -> true)
    boolean isFirstDigitOfFractionalPartEqualToThirdDigitWholePart(double a);

    // 1.Найдите сумму первых n натуральных чисел, которые являются степенью числа 5.
    int sumOfFirstNNaturalNumbersArePowers5(int a) throws NegativeException;

    // 2.Найдите сумму первых n натуральных чисел, которые делятся на 3.
    int sumOfNaturalNumberDivided3(int a);

    // 3.Найдите сумму первых n натуральных чисел, которые являются числами Фиббоначчи.
    int sumNFibonacci(int a);

    // Найдите сумму первых n натуральных чисел, которые являются полными квадратами.
    int sumOfFirstNNaturalNumbersAreFullSquares(int a);

    // Дано натуральное число n. Получить все его натуральные делители.
    int[] getAllNNaturalDivisors(int a);

    // Даны  натуральные числа n, m. Получить их общие делители.
    int[] getNMCommonDivisors(int a, int b);

    // Даны натуральные числа n, m. Получить все общие кратные, меньшие m&n.
    int[] getAllCommonMultiplesLessMAndN(int a, int b);

    // Найти все простые числа, не превосходящие заданного натурального числа n.
    int[] findAllNumbersNotExceedingN(int n);

    // Среди всех четырехзначных чисел получить все простые числа, у каждого из которых сумма первых двух цифр равна
    // сумме двух последних цифр.
    int[] findAllNumbersSumFirstTwoDigitsEqualSumLastDigits(int n ,int[] mas);

    // Дана последовательность натуральных чисел длины n. Вычислить сумму тех из них, порядковые номера которых – '
    // простые числа.
    int sumOfSerialNumbersPrimeNumbers(int n ,int[] mas);

    // Дана последовательность натуральных чисел длины n. Вычислить сумму тех из них, которые – простые числа.
    int sumOfPrimeNumbers(int n ,int[] mas);

    // Определить, какую наибольшую степень числа 100 можно вычислить, пользуясь типом int.
    // pow = log100(Integer.MAX_VALUE) .
    int findLargestPowerOf100UsingInt();

    // Определить, какую наибольшую степень числа 3 можно вычислить, пользуясь типом  short.
    int findLargestPowerOf3UsingShort();

    // Определить, для какого наибольшего n можно вычислить значение n!, пользуясь типом int.
    int findHighestPowerOfFactorial(int n);

    // Дано натуральное n. Верно ли, что все цифры числа различны? (Сделать за один проход)
    boolean isAllDigitsOfNumberDifferent(int n);

    // Определить, равна ли сумма первых k цифр дробной части заданного положительного вещественного числа сумме n
    // следующих цифр.
    boolean isSumFirstKDigitsFractionalPartEqualSumNextNDigits(double n, int k);

    // 1. Найти все такие натуральные a, b, что n = 3a + 5b для заданного натурального числа n > 7.
    int[] findAllNaturalNumbersABExpression(int a, int b, int n);

    // 2. Сверхпростым называется число, если оно простое, и число, полученное из исходного числа при записи
    // цифр исходного числа в обратном порядке («перевертыш»), тоже будет простым. Написать программу, которая
    // выводит все сверхпростые числа в диапазоне от а до b.
    int[] findAllSuperprimesBetweenAB(int b, int a);

    // Вводится последовательность целых чисел. Определить количество элементов в наиболее длинной подпоследовательности
    // подряд идущих чисел, упорядоченных по возрастанию.
    int findColNumbersInLongestSubsequenceNumbersSortedASC(int n, int[] array);

    // 2.6.2. Выполнить задания без хранения последовательности значений Задано  натуральное  число k. Определить
    // k-ю цифру  последовательности:
    //  1.  1525125625...,               в которой выписаны подряд степени 5;
    int findKNumberInSequences(int k);
}



