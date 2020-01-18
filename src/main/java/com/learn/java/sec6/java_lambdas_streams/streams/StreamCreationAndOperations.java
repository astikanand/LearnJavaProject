package com.learn.java.sec6.java_lambdas_streams.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCreationAndOperations {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

        // Map each element to another value using :=> map(lambdaMapper)
        List<Integer> squares = numbers.stream().map(e -> e*e).collect(Collectors.toList());
        System.out.println(squares);

        // Filter elements using :=> filter(lambdaFilterer)
        List<String> filteredNames = names.stream().filter(e -> e.startsWith("S"))
                                                        .collect(Collectors.toList());
        System.out.println(filteredNames);

        // Sort elements using :=> sorted(lambdaComparator)
        List<String> sortedNames = names.stream().sorted((e1, e2) -> e2.compareTo(e1))
                                                    .collect(Collectors.toList());
        System.out.println(sortedNames);

        // Collect from stream using :=> collect(container)
        Set<Integer> squareSet = numbers.stream().map(e -> e*e).collect(Collectors.toSet());
        System.out.println(squareSet);

        // Iterate over each element in stream using :=> forEach(operations)
        numbers.stream().forEach(e -> System.out.print(e + " "));
        System.out.println();

        // Reduce the stream to a single entity using :=> reduce(binaryOperator)
        int evenSum = numbers.stream().filter(e -> e%2==0).reduce(0, (sum, i) -> sum+i);
        System.out.println(evenSum);
    }
}
