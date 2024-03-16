package com.livrariaheroi.util;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);

    private ScannerUtil() {
    }

    public static Scanner getScanner() {
        return scanner;
    }
}
