package com.thoughtworks.collection;

import javafx.scene.control.SelectionMode;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Add {
    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(element -> element % 2 != 0).mapToInt(item -> item * 3 + 5).sum();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> oddList = arrayList.stream().filter(element -> element % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> evenList = arrayList.stream().filter(element -> element % 2 == 0).sorted().collect(Collectors.toList());
        return Stream.of(evenList, oddList).flatMap(Collection::stream).collect(Collectors.toList());
    }


    public boolean isIncludedInEven(List<Integer> arrayList, Integer specialElement) {
        return specialElement % 2 == 0 && arrayList.contains(specialElement);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

}
