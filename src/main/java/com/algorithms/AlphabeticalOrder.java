package com.algorithms;

public class AlphabeticalOrder {

    static boolean alphabetical_order(String str) {
        int str_len = str.length();
        for (int i = 1; i < str_len; i++) {
            if (str.charAt(i) < str.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = alphabetical_order("abccv");
        System.out.println(result);
    }

}
