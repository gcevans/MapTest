package com.example;

import java.util.HashMap;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Map<String,Integer> candyCosts= new HashMap<String,Integer>();

        candyCosts.put("Bubblegum", 99);
        candyCosts.put("Pepermint Bark",149);
        candyCosts.put("Spinich",-10);
        candyCosts.put("Peanut M&Ms", 99);

        System.out.println("Bubblegum costs " + candyCosts.get("Bubblegum"));
        System.out.println("All Candy For Sale");

        Set<Map.Entry<String,Integer>> setViewCandyCosts = candyCosts.entrySet();

        for(Map.Entry<String,Integer> meNameCost:setViewCandyCosts){
            System.out.println(meNameCost.getKey()+"\t"+meNameCost.getValue());
        }
    }
}
