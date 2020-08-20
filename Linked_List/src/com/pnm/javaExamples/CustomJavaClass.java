package com.pnm.javaExamples;

/*Develop a java class with a instance variable H1 (HashSet)
        add a method saveCountryNames(String CountryName) ,
        the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).

        Develop a method getCountry(String CountryName)
        which iterates through the HashSet and returns the country if exist else return null.

        NOTE: You can test the methods using a main method.*/

import java.util.HashSet;

public class CustomJavaClass {
    HashSet<String> h1;

    public HashSet<String> saveCountryNames(String CountryName){
        h1 = new HashSet<>();
        h1.add(CountryName);
        return h1;
    }

    public String getCountry(){
        String CountryName = "";
        if(h1 != null) {
            for (String s : h1) {
                CountryName = s;
            }
        }
        return CountryName;
    }

    public static void main(String[] args) {
        CustomJavaClass obj = new CustomJavaClass();

        obj.saveCountryNames("India");
        System.out.println("Country is " + obj.getCountry());
    }
}
