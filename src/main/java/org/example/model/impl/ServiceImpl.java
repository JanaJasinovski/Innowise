package org.example.model.impl;

import org.example.exception.InCorrectParameterException;
import org.example.exception.NegativeException;
import org.example.model.Service;

import java.util.Arrays;

public class ServiceImpl implements Service {
    @Override
    public int[] arrayContainingBFromAInt(int a, int b) throws InCorrectParameterException {
        int[] array = new int[b];
        int reversed = 0;
        if (countDigit(a) < b) {
            throw new InCorrectParameterException("A must be greater than b");
        }
        else if(b == 0){
            return arrayOfNumber(a);
        }else {
            for (; a != 0; a /= 10) {
                int digit = a % 10;
                reversed = reversed * 10 + digit;
            }
            for (int i = 0; i < b; ++i) {
                array[i] += reversed % 10;
                reversed /= 10;
            }

        }
        return array;
    }

    private int countDigit(int number) {
        int length = 0;
        long temp = 1;
        while (temp <= number) {
            length++;
            temp *= 10;
        }
        return length;
    }

    private int[] arrayOfNumber(int number) {
        int[] array = new int[countDigit(number)];
        int i = countDigit(number) - 1;
        do {
            array[i] = number % 10;
            number = number / 10;
            i--;
        } while (number > 0);

        return array;
    }

    @Override
    public int[] arrayContainingBFromADouble(double a, int b) {
        double fract = a - (int) a;
        for (int i = 0; i < b; i++) {
            fract *= 10;
        }
        int fractInt = (int) fract;
        int[] array = new int[b];
        int reversed = 0;
        for (; fractInt != 0; fractInt /= 10) {
            int digit = fractInt % 10;
            reversed = reversed * 10 + digit;
        }
        for (int i = 0; i < b; ++i) {
            array[i] += reversed % 10;
            reversed /= 10;
        }

        return array;
    }

    @Override
    public boolean isAmongFirstThreeDigitsOfFractionalPart0(double a) {
        float fraction = (float) (a % 1);
        int length = count(a);
        boolean flag = false;
        if (length == 1) {
            return false;
        } else if (length == 2) {
            for (int i = 1; i <= 2; i++) {
                fraction *= 10;
                if ((int) fraction == 0) {
                    return true;
                }
            }
        } else if (length >= 3) {
            for (int i = 1; i <= 3; i++) {
                fraction *= 10;
            }
        }

        int answer = (int) fraction;
        while (answer != 0) {
            int digit = answer % 10;
            answer /= 10;
            if (digit == 0) {
                flag = true;
            }
        }
        return flag;
    }

    private static int count(double a) {
        int count = 0;
        while (a % 1 != 0) {
            count++;
            a *= 10;
        }
        return count;
    }

    @Override
    public boolean isFirstDigitOfFractionalPartEqualToThirdDigitWholePart(double a) {
        boolean flag = true;
        int fractional = firstDigitInFractional(a);
        int wholeNumber = (int) a;
        if (wholeNumber < 3) {
            flag = false;
        }
        int[] array = new int[3];

        int reversed = 0;
        for (; wholeNumber != 0; wholeNumber /= 10) {
            int digit = wholeNumber % 10;
            reversed = reversed * 10 + digit;
        }
        for (int i = 0; i < 3; ++i) {
            array[i] += reversed % 10;
            reversed /= 10;
        }

        if (array[0] == fractional) {
            flag = true;
        }

        return flag;
    }

    private static int firstDigitInFractional(double a) {
        double fract = a % 1;
        fract *= 10;
        return (int) fract % 10;
    }

    @Override
    public int sumOfFirstNNaturalNumbersArePowers5(int a) throws NegativeException {
        if (a < 0) {
            throw new NegativeException("Negative Number");
        }
        int sumNumbers = 0;
        for (int i = 1; i <= a; i++) {
            sumNumbers += Math.pow(5, i);

        }
        return sumNumbers;
    }

    @Override
    public int sumOfNaturalNumberDivided3(int a) {
        int sumNumbers = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 3 == 0) {
                sumNumbers += i;
            }
        }
        System.out.println(sumNumbers);
        return sumNumbers;
    }

    @Override
    public int sumNFibonacci(int a) {
        int sumNumbers = 0;
        long first = 0;
        long second = 1;
        long result = a;
        for (int i = 1; i < a; i++) {
            result = first + second;
            first = second;
            second = result;
            sumNumbers += result;
        }
        return sumNumbers + 1;
    }

    @Override
    public int sumOfFirstNNaturalNumbersAreFullSquares(int a) {
        int sumNumbers = 0;
        for (int i = 1; i <= a; i++) {
            if (isSquare(i)) {
                sumNumbers += i;
            }
        }

        return sumNumbers;
    }

    // Вычислить квадратный корень
    // Округлить до ближайшего целого
    // Возвести в квадрат
    // Проверить, что совпадает с исходным числом.
    private static boolean isSquare(int number) {
        int result = (int) Math.sqrt(number);
        return Math.pow(result, 2) == number;
    }

    @Override
    public int[] getAllNNaturalDivisors(int a) {
        int[] result = new int[a];
        for (int i = 1; i <= a; i++) {
            if ((a % i) == 0)
                result[i - 1] = i;
        }

        return Arrays.stream(result).filter(num -> num != 0).toArray();
    }

    @Override
    public int[] getNMCommonDivisors(int a, int b) {
        int j = 0;
        int k = 0;
        int max = Math.max(a, b);
        int[] array = new int[max];
        for (int i = 1; i < max; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                array[j] = i;
            }
            k++;
            j++;
        }

        int len = 0;
        for (int value : array) {
            if (value != 0)
                len++;
        }

        int[] newArray = new int[len];
        for (int i = 0, p = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newArray[p] = array[i];
                p++;
            }
        }

        return newArray;
    }

    @Override
    public int[] getAllCommonMultiplesLessMAndN(int a, int b) {
        int nm = a * b;
        int lcm = a / gcd(a, b) * b;

        int[] array = new int[nm];
        for (int i = lcm; i < nm; i += lcm) {
            array[i] += i;
        }

        int len = 0;
        for (int value : array) {
            if (value != 0)
                len++;
        }

        int[] newArray = new int[len];
        for (int i = 0, p = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newArray[p] = array[i];
                p++;
            }
        }

        return newArray;
    }

    private static int gcd(int a, int b) {
        int number;
        while (b != 0) {
            number = a % b;
            a = b;
            b = number;
        }
        return a;
    }

    @Override
    public int[] findAllNumbersNotExceedingN(int n) {
        int[] primes = new int[n];
        int count = 0;
        int p = 2;
        while (count < n) {
            boolean isprime = true;
            for (int i = 2; i < p; i++) {
                if (p % i == 0) {
                    isprime = false;
                    break;

                }
            }
            if (isprime) {
                primes[count] = p;
                count++;
            }
            p++;
        }

        int[] result = new int[n];
        for (int i = 0; i < primes.length; i++) {
            if (primes[i] < n) {
                result[i] = primes[i];
            }
        }

        return Arrays.stream(result).filter(num -> num != 0).toArray();
    }

    @Override
    public int[] findAllNumbersSumFirstTwoDigitsEqualSumLastDigits(int n, int[] mas) {
        int[] resultMas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            if (countInt(mas[i]) == 4) {
                resultMas[i] = mas[i];
            }
        }

        int[] allFourDigits = Arrays.stream(resultMas).filter(num -> num != 0).toArray();

        int[] result = new int[allFourDigits.length];
        for (int i = 0; i < allFourDigits.length; i++) {
            if ((allFourDigits[i] / 100 % 10 + allFourDigits[i] / 1000 == allFourDigits[i] % 100 / 10 + allFourDigits[i] % 10) ||
                    (allFourDigits[i] / 100 % 10 == allFourDigits[i] / 1000 &&
                            allFourDigits[i] % 100 / 10 == allFourDigits[i] % 10)) {
                result[i] = allFourDigits[i];
            }
        }

        return Arrays.stream(result).filter(num -> num != 0).toArray();
    }

    private static int countInt(int a) {
        int count = 0;
        for (; a != 0; a /= 10) {
            ++count;
        }
        return count;
    }

    @Override
    public int sumOfSerialNumbersPrimeNumbers(int n, int[] mas) {
        int[] primes = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            if (isPrime(i)) {
                primes[i] = mas[i];
            }
        }
        int[] result = Arrays.stream(primes).filter(num -> num != 0).toArray();
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum += result[i];
        }
        return sum;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }

    @Override
    public int sumOfPrimeNumbers(int n, int[] mas) {
//        int[] main.result = new int[mas.length];
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            if (isPrime(mas[i])) {
                sum += mas[i];
//                while (mas[i] != 0) {
//                    main.result[i] += mas[i] % 10;
//                    mas[i] /= 10;
//                }
            }
        }
        return sum;
    }

    @Override
    public int findLargestPowerOf100UsingInt() {
        int number = 100;
        int pow = 0;
        int result = 0;
        while (result < Integer.MAX_VALUE) {
            result = (int) Math.pow(number, pow);
            pow++;
        }
        return pow;
    }

    @Override
    public int findLargestPowerOf3UsingShort() {
        int number = 3;
        int pow = 0;
        short result = 0;
        while (result < Short.MAX_VALUE) {
            result = (short) Math.pow(number, pow);
            pow++;
        }
        return pow;
    }

    @Override
    public int findHighestPowerOfFactorial(int n) {
        int pow = 1;
        int fact = 1;
        while (fact < Short.MAX_VALUE && pow <= n) {
            fact = fact * pow;
            pow++;
        }
        return pow;
    }

    @Override
    public boolean isAllDigitsOfNumberDifferent(int n) {
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            int t = n;
            while (t > 0) {
                if (t % 10 == digit) {
                    count = -1;
                    break;
                }
                t /= 10;
            }
        }

        return count == 0;
    }

    @Override
    public boolean isSumFirstKDigitsFractionalPartEqualSumNextNDigits(double n, int k) {
        double fraction = n % 1;
        int sumk = 0;
        for (int i = 1; i <= k; i++) {
            fraction *= 10;
            sumk += (int) fraction % 10;
        }

        int sumAll = 0;
        fraction = n % 1;
        for (int i = 1; i <= count(n); i++) {
            fraction *= 10;
            sumAll += (int) fraction % 10;
        }

        int sumLast = sumAll - sumk;
        return sumk == sumLast;
    }

    private static int count(float a) {
        int count = 0;
        while (a % 1 != 0) {
            count++;
            a *= 10;
        }
        return count;
    }

    @Override
    public int[] findAllNaturalNumbersABExpression(int a, int b, int n) {
        int[] result = new int[a];

        for (a = 0; a <= n / 3; ++a) {
            for (b = 0; b <= n / 5; ++b) {
                if (3 * a + 5 * b == n) {
                    result[a] = n;
                }
            }
        }
        return Arrays.stream(result)
                .filter(num -> num != 0)
                .distinct().toArray();
    }

    @Override
    public int[] findAllSuperprimesBetweenAB(int b, int a) {
        int max = b, min = a;
        if (a > b) {
            max = a;
        }
        if (b < a) {
            min = b;
        }

        int[] result = new int[a];
        for (int i = min; i <= max; i++) {
            if (isSuperPrime(i)) {
                result[i] = i;
            }
        }
        return Arrays.stream(result)
                .filter(num -> num != 0)
                .distinct().toArray();
    }

    private static boolean isSuperPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number >= 2;
    }

    @Override
    public int findColNumbersInLongestSubsequenceNumbersSortedASC(int n, int[] array) {
        int size = array.length, buffer = 1, maxbuffer = 0, max = 0;
        for (int i = 0; i < size - 1; i++) {
            if (array[i + 1] > array[i]) {
                buffer++;
                max = buffer;
                if (maxbuffer < max) {
                    maxbuffer = max;
                }
            }
            if (array[i + 1] <= array[i]) {
                max = buffer;
                if (maxbuffer < max) {
                    maxbuffer = max;
                }
                buffer = 1;
            }

        }
        return maxbuffer;
    }

    @Override
    public int findKNumberInSequences(int k) {
        int b = 1;
        int n = 0;
        while (n < k) {
            b *= k;
            int t = b;
            while (t / 10 < 0) {
                n++;

            }
            ;
        }
        for (int i = n - k; i > 0; i--) {
            b /= 10;
        }
        return b % 10;
    }
}
