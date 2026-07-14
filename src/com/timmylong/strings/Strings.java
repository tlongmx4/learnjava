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

        String firstName = "Timmy";
        String lastName = "Long";

        String fullName1 = firstName + " " + lastName;

        System.out.println(fullName1);

        String fullName2 = firstName.concat(" ").concat(lastName);

        System.out.println(fullName2);
    }
}
