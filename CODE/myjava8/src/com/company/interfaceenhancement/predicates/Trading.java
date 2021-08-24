package com.company.interfaceenhancement.predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Trading {
    static ArrayList<Stock> stocks = new ArrayList<>();

    public static void main(String[] args){
        Stock stockToSearch = new Stock("Facebook",400,10);

        stocks.add(new Stock("Apple",500,20));
        stocks.add(new Stock("Facebook",400,10));
        stocks.add(new Stock("Google",560,22));

        Predicate<Stock> stockEquality = Predicate.isEqual(stockToSearch);

        for(Stock s: stocks){
            if(stockEquality.test(s)){
                System.out.println("Stock found: " + s);
            }else{
                System.out.println("Stock not found" );
            }
        }
    }
}
