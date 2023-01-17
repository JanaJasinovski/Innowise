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
        map.put(1, new IntArrayCommandForArrayContainingBFromAIntMethod(service));
        map.put(2, new IntArrayCommandForArrayContainingBFromADoubleMethod(service));
        map.put(3, new BooleanCommandForIsAmongFirstThreeDigitsOfFractionalPart0Method(service));
        map.put(4, new BooleanCommandForIsFirstDigitOfFractionalPartEqualToThirdDigitWholePartMethod(service));
        map.put(5, new IntegerCommandForSumOfFirstNNaturalNumbersArePowers5Method(service));
        map.put(6, new IntegerCommandForSumOfNaturalNumberDivided3Method(service));
        map.put(7, new IntegerCommandForSumNFibonacciMethod(service));
        map.put(8, new IntegerCommandForSumOfFirstNNaturalNumbersAreFullSquareMethod(service));
        map.put(9, new IntArrayCommandForGetAllNNaturalDivisorsMethod(service));
        map.put(10, new IntArrayCommandForGetNMCommonDivisorsMethod(service));
        map.put(11, new IntArrayCommandForGetAllCommonMultiplesLessMAndNMethod(service));
        map.put(12, new IntArrayCommandForFindAllNumbersNotExceedingNMethod(service));
        map.put(13, new IntArrayCommandForFindAllNumbersSumFirstTwoDigitsEqualSumLastDigitsMethod(service));
        map.put(14, new IntegerCommandForSumOfSerialNumbersPrimeNumbersMethod(service));
        map.put(15, new IntegerCommandForSumOfPrimeNumbersMethod(service));
        map.put(16, new IntegerCommandForFindLargestPowerOf100UsingIntMethod(service));
        map.put(17, new IntegerCommandForFindLargestPowerOf3UsingShortMethod(service));
        map.put(18, new IntegerCommandForFindHighestPowerOfFractionalMethod(service));
        map.put(19, new BooleanCommandForIsAllDigitsOfNumberDifferentMethod(service));
        map.put(20, new BooleanCommandForIsSumFirstKDigitsFractionalPartEqualSumNextNDigitsMethod(service));
        map.put(21, new IntArrayCommandForFindAllNaturalNumbersABExpressionMethod(service));
        map.put(22, new IntArrayCommandForFindAllSuperprimesBetweenABMethod(service));
        map.put(23, new IntegerCommandForFindColNumbersInLongestSubsequenceNumbersSortedASCMethod(service));
        map.put(24, new IntegerCommandForFindKNumberInSequencesMethod(service));
        return map;
    }

    public void addToMap(int mapKey, Command<?> service) {
        map.put(mapKey, service);
    }

    public Command<?> getService(int number) {
        return getMap().get(number);
    }
}

