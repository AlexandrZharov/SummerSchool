package com.edu;

public class Main {
    public static void main(String[] args) {
        String abba = "ABba";
        if(PalindromeService.check(abba))
            System.out.println("String " + abba + " is a palindrome!");
        else
            System.out.println("String " + abba + " is NOT a palindrome!");
    }
}
