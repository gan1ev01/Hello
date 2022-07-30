package com.company;

import java.nio.file.LinkPermission;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(word.substring(1,3));
        System.out.println(method(word));
    }
    public static boolean method(String word){
        if (word.length()<3){
            return  false;
        }

        return word.substring(1,3).equals("ik");
    }

}











































