package org.launchcode.techjobs.console;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tr {
    public static void main(String[] args) {


        HashMap<String,String> countryCapitalMap= new HashMap<String,String>();

        countryCapitalMap.put("USA","Washington");
        countryCapitalMap.put("Bangladesh","Dhaka");
        countryCapitalMap.put("France","Paris");
        countryCapitalMap.put("England","London");
        countryCapitalMap.put("Russia","Moscow");


        System.out.println("-----------------------------");

        // Creating  ArrayList from Keys

        ArrayList<String> keysArrayList=  new ArrayList<String>(countryCapitalMap.keySet());

        System.out.println("Countries (Keys) are: ");
        for (String country: keysArrayList) {
            System.out.println(country);
        }

        System.out.println("-----------------------------");

        //Creating  ArrayList from Values
        ArrayList<String> valuesArrayList= new ArrayList<String>(countryCapitalMap.values());
        System.out.println("Capital (Values) are: ");
        for (String capital:valuesArrayList) {
            System.out.println(capital);
        }
        System.out.println("-----------------------------");

        //Creating  ArrayList from Entry set
        ArrayList <Map.Entry<String,String>> entryArrayList= new ArrayList<Map.Entry<String,String>>(countryCapitalMap.entrySet());
        for (Map.Entry<String, String> entry:entryArrayList) {
            System.out.println("Country: "+ entry.getKey() + " and  Capital: "+entry.getValue());

        }

        System.out.println("-----------------------------");

    }
    }

