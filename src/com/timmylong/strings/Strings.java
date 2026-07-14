package com.timmylong.strings;

public class Strings {
    public static void main(String[] args) {

        String s = "I am learning Java";

        String sInUppercase = s.toUpperCase();
        System.out.println(sInUppercase);

        boolean startsWith = sInUppercase.startsWith("I");
        System.out.println(startsWith);

        String sInLowercase = s.toLowerCase();
        System.out.println(sInLowercase);

        String noSpaces = s.replace(" ", "");
        System.out.println(noSpaces);

        String snakeCaseString = s.replace(" ", "_");
        System.out.println(snakeCaseString);
    }
}
