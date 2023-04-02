package com.example.productlistapp.service;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Utility {

    public static String truncateString(String originalStr, int numOfChars) {
        return originalStr.substring(0, Math.min(originalStr.length(), (numOfChars - 3))) + "...";
    }

    public static String formatCurrency(BigDecimal amount) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(amount);
    }
}
