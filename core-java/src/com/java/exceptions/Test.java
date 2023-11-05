package com.java.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test

{

    public static void main(String[] args) {
        int precedingMinutes = 0;
        double alertThreshold = 0;
        List<Integer> numCalls = new ArrayList<>();
//        numCalls.add(2);
//        numCalls.add(2);
//        numCalls.add(2);
//        numCalls.add(2);
//        numCalls.add(5);
//        numCalls.add(5);
//        numCalls.add(5);
//        numCalls.add(8);
        int result = numberOfAlerts(precedingMinutes, alertThreshold, numCalls);
        System.out.println(result);
    }

    public static int numberOfAlerts(int precedingMinutes, double alertThreshold, List<Integer> numCalls) {
        List<Integer> numCallsSum = numCalls.stream().collect(Collectors.toList());
        for (int i = 1; i < numCalls.size(); i++) {
            numCallsSum.set(i, numCallsSum.get(i - 1) + numCalls.get(i));
        }

        int totalAlerts = (int) IntStream.range(precedingMinutes - 1, numCalls.size())
                .filter(i -> {
                    double average = (i >= precedingMinutes) ?
                            (numCallsSum.get(i) - numCallsSum.get(i - precedingMinutes)) / (double) precedingMinutes :
                            numCallsSum.get(i) / (double) (i + 1);
                    return average > alertThreshold;
                })
                .count();

        return totalAlerts;
    }

}
