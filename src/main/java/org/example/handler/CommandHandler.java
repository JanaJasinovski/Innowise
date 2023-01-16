package org.example.handler;

import org.example.command.Command;
import org.example.command.impl.*;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.example.result.CommandResult;

import java.util.HashMap;
import java.util.Map;

public class CommandHandler {
    private final Map<Integer, Command<? extends CommandResult>> map;
    private final Service service = new ServiceImpl();
    public CommandHandler() {
        this.map = new HashMap<>();
    }

    private Map<Integer, Command<? extends CommandResult>> getMap() {
        map.put(1, new IntArrayCommandForArrayContainingBFromAIntMethod());
        map.put(2, new IntArrayCommandForArrayContainingBFromADoubleMethod());
        map.put(3, new BooleanCommandForIsAmongFirstThreeDigitsOfFractionalPart0Method());
        map.put(4, new BooleanCommandForIsFirstDigitOfFractionalPartEqualToThirdDigitWholePartMethod());
        map.put(5, new IntegerCommandForSumOfFirstNNaturalNumbersArePowers5Method());
        map.put(6, new IntegerCommandForSumOfNaturalNumberDivided3Method());
        map.put(7, new IntegerCommandForSumNFibonacciMethod());
        map.put(8, new IntegerCommandForSumOfFirstNNaturalNumbersAreFullSquareMethod());
        map.put(9, new IntArrayCommandForGetAllNNaturalDivisorsMethod());
        map.put(10, new IntArrayCommandForGetNMCommonDivisorsMethod());
        map.put(11, new IntArrayCommandForGetAllCommonMultiplesLessMAndNMethod());
        map.put(12, new IntArrayCommandForFindAllNumbersNotExceedingNMethod());
        map.put(13, new IntArrayCommandForFindAllNumbersSumFirstTwoDigitsEqualSumLastDigitsMethod());
        map.put(14, new IntegerCommandForSumOfSerialNumbersPrimeNumbersMethod());
        map.put(15, new IntegerCommandForSumOfPrimeNumbersMethod());
        map.put(16, new IntegerCommandForFindLargestPowerOf100UsingIntMethod());
        map.put(17, new IntegerCommandForFindLargestPowerOf3UsingShortMethod());
        map.put(18, new IntegerCommandForFindHighestPowerOfFractionalMethod());
        map.put(19, new BooleanCommandForIsAllDigitsOfNumberDifferentMethod());
        map.put(20, new BooleanCommandForIsSumFirstKDigitsFractionalPartEqualSumNextNDigitsMethod(service));
        map.put(21, new IntArrayCommandForFindAllNaturalNumbersABExpressionMethod());
        map.put(22, new IntArrayCommandForFindAllSuperprimesBetweenABMethod());
        map.put(23, new IntegerCommandForFindColNumbersInLongestSubsequenceNumbersSortedASCMethod());
        map.put(24, new IntegerCommandForFindKNumberInSequencesMethod());
        return map;
    }

    public void addToMap(int mapKey, Command<?> service) {
        map.put(mapKey, service);
    }

    public Command<?> getService(int number) {
        return getMap().get(number);
    }
}

