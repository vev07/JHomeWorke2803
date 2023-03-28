package MethodsString;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "Human is animal";
        String str2 = "Animals";
        String str3 = "w";
        String str4 = "AnimaLS";
        String arr = "012345";
        char[] dest =  { '!', '#', '%', '^'};
        String[] car = {"BMW", "AMG", "Reno", "Nisan"};

        System.out.println(str.length());
        System.out.println(str.isEmpty()+ " " + str3.isBlank());
        System.out.println(str2.charAt(0));
        System.out.println(Arrays.toString(dest));
        System.out.println(arr.toCharArray());
        System.out.println(str.equals(str2));
        System.out.println(str2.equalsIgnoreCase(str4));
        System.out.println(str2.compareTo(str4)); // ??????????
        System.out.println(str4.startsWith("An") + " " + str4.endsWith("LS"));
        System.out.println(str.indexOf("u") + " " + str.lastIndexOf("a"));
        System.out.println(str.substring(5,8));
        System.out.println(str.concat(" String "+14));
        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));
        System.out.println(String.join("; ",car));
        System.out.println(str.toLowerCase());
        System.out.println(str4.repeat(3));


    }
}
