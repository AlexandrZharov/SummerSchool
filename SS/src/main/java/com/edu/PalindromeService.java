package com.edu;

import java.util.logging.Logger;

public class PalindromeService {

    private static final String regex = "[^a-zA-Z0-9а-яА-Я]";

    private final static Logger LOGGER  = Logger.getLogger(PalindromeService.class.getName());

    private static String getPrettyString(String str) {
        return str.toLowerCase().replaceAll(regex, "");
    }

    public static boolean check(String str) {
        if(str == null) {
            LOGGER.warning("String is NULL!");
            return false;
        }
        LOGGER.info("Checking string \"" + str + "\"...");
        String prettyString = getPrettyString(str);
        if(str.length() == 0) {
            LOGGER.warning("String is empty or not contain valid symbols!");
            return false;
        }
        return prettyString.equals(new StringBuilder(prettyString).reverse().toString());
    }
}
