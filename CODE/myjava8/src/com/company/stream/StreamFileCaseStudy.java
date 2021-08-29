package com.company.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFileCaseStudy {

    public static void main(String[] a) throws IOException {
 // You can't reuse a tream more than once, so to avoid it, put it in a Spplier object and create a new Stream from it for every operation
        List<String> allLines = Files.readAllLines(Paths.get(System.getProperty("user.dir")+"/"+"salesdata.csv"));

        Supplier<Stream<String>> supplier = () -> allLines.stream();

        // Get only the data that has sales info
        // Example: Cheese,8000,2020 -> [Cheese,8000,2020]
        System.out.println("********* Get only the data that has sales info ********");
        Stream<String> rowData = supplier.get();
        long totalRows = rowData.map(x -> x.split(","))
                .filter(array -> array.length > 2)
                .count();
        System.out.println("Total rows: " + totalRows);

        // Get all pizza names that have some sales data
        System.out.println("********* Get all pizza names that have some sales data ********");
        Stream<String> rowData2 = supplier.get();
       rowData2.map(x -> x.split(","))
                .filter(array -> array.length > 2)
                .collect(Collectors.toList())
               .forEach(value -> {
                   System.out.println("Pizzas with sales: " + value[0] + ", Sales data: " + value[1]);
               });

       // Get information as map
        // For example: {Cheese = 8000, Veggie = 7000}
        System.out.println("********* Get information as map ********");
        Stream<String> rowData3 = supplier.get();
      Map<String,String> mappedData = rowData3.map(x -> x.split(","))
                .filter(array -> array.length > 2)
                .collect(Collectors.toMap(x -> x[0], y -> y[1]));

        System.out.println("Sales map: " + mappedData);


        // Total sales for all pizzas for the year 2020
        System.out.println("********* Total sales for all pizzas for the year 2020 ********");
        Stream<String> rowData4 = supplier.get();
        Optional<Integer> salesData = rowData4.map(x -> x.split(","))
                .filter(array -> array.length > 2)
                .map(y -> Integer.parseInt(y[1]))
                .reduce((p,q) -> p + q);

        System.out.println("Sales for 2020: " + salesData.get());
    }
}